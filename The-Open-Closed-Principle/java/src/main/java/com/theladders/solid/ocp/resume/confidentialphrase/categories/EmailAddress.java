package com.theladders.solid.ocp.resume.confidentialphrase.categories;

import com.theladders.solid.ocp.resume.confidentialphrase.ConfidentialPhrase;

public class EmailAddress extends ConfidentialPhrase
{
  public EmailAddress(String phrase, boolean isConfidential)
  {
    super(phrase, isConfidential);
  }

  public boolean isContactInfo()
  {
    return true;
  }
}
