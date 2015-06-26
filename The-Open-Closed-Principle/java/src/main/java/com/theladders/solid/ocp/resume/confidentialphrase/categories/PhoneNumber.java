package com.theladders.solid.ocp.resume.confidentialphrase.categories;

import com.theladders.solid.ocp.resume.confidentialphrase.ConfidentialPhrase;

public class PhoneNumber extends ConfidentialPhrase
{
  public PhoneNumber(String phrase, boolean isConfidential)
  {
    super(phrase, isConfidential);
  }

  public boolean isContactInfo()
  {
    return true;
  }
}
