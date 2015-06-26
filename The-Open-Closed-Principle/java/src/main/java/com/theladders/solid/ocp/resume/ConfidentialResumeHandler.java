package com.theladders.solid.ocp.resume;

import com.theladders.solid.ocp.jobseeker.JobseekerConfidentialityProfile;
import com.theladders.solid.ocp.jobseeker.JobseekerConfidentialityProfileDao;
import com.theladders.solid.ocp.resume.confidentialphrase.ConfidentialPhrase;
import com.theladders.solid.ocp.resume.confidentialphrase.categories.Name;
import com.theladders.solid.ocp.user.User;

public class ConfidentialResumeHandler
{
  private final JobseekerProfileManager            jobSeekerProfileManager;
  private final JobseekerConfidentialityProfileDao jobseekerConfidentialityProfileDao;

  public ConfidentialResumeHandler(JobseekerProfileManager jobseekerProfileManager,
                                   JobseekerConfidentialityProfileDao jobseekerConfidentialityProfileDao)
  {
    //TODO: gotta completely rewrite this class. Delegate the logic to profile (?) class
    this.jobSeekerProfileManager = jobseekerProfileManager;
    this.jobseekerConfidentialityProfileDao = jobseekerConfidentialityProfileDao;
  }

  public void makeAllCategoriesNonConfidential(User user)
  {
    JobseekerProfile jsp = jobSeekerProfileManager.getJobSeekerProfile(user);
    JobseekerConfidentialityProfile profile = jobseekerConfidentialityProfileDao.fetchJobSeekerConfidentialityProfile(jsp.getId());

    boolean isChanged = profile.resetAllConfidentialFlags();

    if (isChanged)
    {
      generatePermanentConfidentialFiles(user, profile);
    }
  }

  public void makeAllContactInfoNonConfidential(User user)
  {
    JobseekerProfile jsp = jobSeekerProfileManager.getJobSeekerProfile(user);
    JobseekerConfidentialityProfile profile = jobseekerConfidentialityProfileDao.fetchJobSeekerConfidentialityProfile(jsp.getId());
    boolean isChanged = false;
//    isChanged = profile.resetConfidentialFlagsFor(
//            ConfidentialPhraseCategory.PhoneNumber) || isChanged;
//    isChanged = profile.resetConfidentialFlagsFor(
//            ConfidentialPhraseCategory.EmailAddress) || isChanged;
//    isChanged = profile.resetConfidentialFlagsFor(
//            ConfidentialPhraseCategory.MailingAddress) || isChanged;
//    isChanged = profile.resetConfidentialFlagsFor(
//            ConfidentialPhraseCategory.ContactInfo) || isChanged;

    if (isChanged)
    {
      generatePermanentConfidentialFiles(user, profile);
    }
  }

  @SuppressWarnings("unused")
  private void generatePermanentConfidentialFiles(User user,
                                                  JobseekerConfidentialityProfile profile)
  {
    // stub
  }
}
