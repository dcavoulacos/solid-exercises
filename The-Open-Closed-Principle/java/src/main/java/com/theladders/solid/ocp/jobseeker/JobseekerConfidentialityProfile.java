package com.theladders.solid.ocp.jobseeker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.theladders.solid.ocp.resume.confidentialphrase.ConfidentialPhrase;

public class JobseekerConfidentialityProfile
{
  private Map<String, List<ConfidentialPhrase>> confidentialityProfile;

  public JobseekerConfidentialityProfile()
  {
    confidentialityProfile = new HashMap<>();
  }

  +
  public boolean resetAllConfidentialFlags() {
    boolean isChanged = false;
    for (Map.Entry<String, List<ConfidentialPhrase>> entry : confidentialityProfile.entrySet()) {
      List<ConfidentialPhrase> category = entry.getValue();
      isChanged = resetConfidentialFlagsFor(category) || isChanged;
    }
    return isChanged;
  }

//  private boolean resetConfidentialFlagsForCollection() {
//
//  }

  private boolean resetConfidentialFlagsFor(List<ConfidentialPhrase> phrases)
  {
    boolean isChanged = false;

    if (phrases != null)
    {
      for (ConfidentialPhrase phrase : phrases)
      {
        if (phrase.isConfidential())
        {
          phrase.setConfidential(false);
          isChanged = true;
        }
      }
    }

    return isChanged;
  }
}
