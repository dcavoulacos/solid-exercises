package com.theladders.solid.lsp;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * A wrapper that allows some properties to be overriden on a per-request basis.
 *
 * @author Zhi-Da Zhong &lt;zz@theladders.com&gt;
 */

public class DynamicEnvironment
{
  public final Environment         base;
  private final Map<String, String> keyMap; // map insecure prop names to secure ones

  public DynamicEnvironment(Environment base, Map<String, String> propKeyMap)
  {
    this.base = base;
    this.keyMap = propKeyMap;
  }

  public Collection<Object> values()
  {
    // TODO remove masked values
    // TODO join local instance values
    return base.values();
  }

  /**
   * This method uses a mapped version of the given key to access first its own Map then its
   * underlying Map.
   *
   * @param key
   *          An environment key like "home"
   * @return The value for the given key after mapping (e.g. "home" might be mapped to "secureHome")
   */

  public Object get(Object key)
  {
    String realKey = keyMap.get(key);
    return base.get(realKey != null ? realKey : key);
  }

  public Set<Map.Entry<Object, Object>> entrySet()
  {
    return base.entrySet();
  }

  public Set<Object> keySet()
  {
    Set<Object> keySet = new HashSet<>();
    keySet.addAll(keyMap.keySet());
    keySet.addAll(base.keySet());
    return Collections.unmodifiableSet(keySet);
  }

  public Object put(Object key, Object value){
    return base.put(key, value);
  }
}

// stop extending environment -> was also extending hashmap and screwing up. but how?
// get never returning null ~> violates expectation
//  L> fixes the issue of extending hashmap, but now can't be used like hashmap
//  L> tradeoff? is there another way to fix that issue?
//
// 'is a' vs. 'has a' relationships
//
//  keySet and entrySet returning unmodifiableSet's
//   L> HashMap returns modifiable Sets?