package com.theladders.solid.srp.resume;

import com.theladders.solid.srp.http.HttpRequest;
import com.theladders.solid.srp.jobseeker.Jobseeker;

public class MyResumeManager
{
  private final ActiveResumeRepository repository;

  public MyResumeManager(ActiveResumeRepository repository)
  {
    this.repository = repository;
  }

//  public Resume saveNewOrRetrieveExistingResume(ResumeManager resumeManager,
//                                                String newResumeFileName,
//                                                Jobseeker jobseeker)
//  {
//    Resume resume;
//
//    return resume;
//  }

  private void saveAsActive(Jobseeker jobseeker,
                           Resume resume)
  {
    repository.makeActive(jobseeker.getId(), resume);
  }

  public Resume getActiveResume(int jobseekerId)
  {
    return repository.activeResumeFor(jobseekerId);
  }
}
