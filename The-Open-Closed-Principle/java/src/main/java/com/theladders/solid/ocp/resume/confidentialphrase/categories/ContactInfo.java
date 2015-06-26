package com.theladders.solid.ocp.resume.confidentialphrase.categories;

import com.theladders.solid.ocp.resume.confidentialphrase.ConfidentialPhrase;

public class ContactInfo extends ConfidentialPhrase
{
  public ContactInfo(String phrase, boolean isConfidential)
  {
    super(phrase, isConfidential);
  }

  public boolean isContactInfo()
  {
    return true;
  }
}
