package com.theladders.solid.srp.viewprovider;

import java.util.Map;

import com.theladders.solid.srp.http.HttpResponse;

public interface ViewProvider
{
  public void provideView(HttpResponse response, Map<String, Object> model);
}
