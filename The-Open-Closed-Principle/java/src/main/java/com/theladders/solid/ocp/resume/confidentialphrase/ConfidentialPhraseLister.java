package com.theladders.solid.ocp.resume.confidentialphrase;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConfidentialPhraseLister implements PhraseLister
{
  public Set<String> getCategories(){
    String categoryNames[] = {
      "Name",
      "Phone Number",
      "Email Address",
      "Mailing Address",
      "Contact Info",
      "Company Name",
      "Work Experience"
    };
    return new HashSet<>(Arrays.asList(categoryNames));
  }
}
