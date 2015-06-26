package com.theladders.solid.ocp.resume.confidentialphrase.categories;

import com.theladders.solid.ocp.resume.confidentialphrase.ConfidentialPhrase;

public class MailingAddress extends ConfidentialPhrase
{
  public MailingAddress(String phrase, boolean isConfidential)
  {
    super(phrase, isConfidential);
  }

  public boolean isContactInfo()
  {
    return true;
  }
}
