package com.theladders.solid.ocp.resume.confidentialphrase;

public abstract class ConfidentialPhrase
{
  private String phrase;
  private boolean isConfidential;

  public ConfidentialPhrase(String phrase,
                            boolean isConfidential)
  {
    super();
    this.phrase = phrase;
    this.isConfidential = isConfidential;
  }

  public String getPhrase()
  {
    return phrase;
  }

  public void setPhrase(String phrase)
  {
    this.phrase = phrase;
  }

  public boolean isConfidential()
  {
    return isConfidential;
  }

  public void setConfidential(boolean isConfidential)
  {
    this.isConfidential = isConfidential;
  }

  public abstract boolean isContactInfo();
}
