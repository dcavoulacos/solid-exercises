package com.theladders.solid.ocp.resume.confidentialphrase.categories;

import com.theladders.solid.ocp.resume.confidentialphrase.ConfidentialPhrase;

public class CompanyName extends ConfidentialPhrase
{
  public CompanyName(String phrase, boolean isConfidential)
  {
    super(phrase, isConfidential);
  }

  public boolean isContactInfo()
  {
    return false;
  }
}
