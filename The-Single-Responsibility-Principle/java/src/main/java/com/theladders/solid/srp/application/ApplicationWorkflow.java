package com.theladders.solid.srp.application;

import java.util.HashMap;
import java.util.Map;

import com.theladders.solid.srp.http.HttpRequest;
import com.theladders.solid.srp.job.Job;
import com.theladders.solid.srp.job.application.ApplicationFailureException;
import com.theladders.solid.srp.job.application.JobApplicationResult;
import com.theladders.solid.srp.job.application.JobApplicationSystem;
import com.theladders.solid.srp.job.application.UnprocessedApplication;
import com.theladders.solid.srp.jobseeker.Jobseeker;
import com.theladders.solid.srp.jobseeker.JobseekerProfileManager;
import com.theladders.solid.srp.resume.MyResumeManager;
import com.theladders.solid.srp.resume.Resume;
import com.theladders.solid.srp.resume.ResumeManager;
import com.theladders.solid.srp.viewprovider.ApplicationError;
import com.theladders.solid.srp.viewprovider.InvalidJob;
import com.theladders.solid.srp.viewprovider.ViewProvider;

public class ApplicationWorkflow
{
  private final JobseekerProfileManager jobseekerProfileManager;
  private final JobApplicationSystem    jobApplicationSystem;
  private final ResumeManager           resumeManager;
  private final MyResumeManager         myResumeManager;

  public ApplicationWorkflow(JobseekerProfileManager jobseekerProfileManager,
                             JobApplicationSystem jobApplicationSystem,
                             ResumeManager resumeManager,
                             MyResumeManager myResumeManager)
  {
    this.jobseekerProfileManager = jobseekerProfileManager;
    this.jobApplicationSystem = jobApplicationSystem;
    this.resumeManager = resumeManager;
    this.myResumeManager = myResumeManager;
  }

  public void apply(Jobseeker jobseeker,
                     Job job,
                     String fileName,
                     boolean isNewResume,
                     boolean setAsActive)
  {
//    Resume resume = myResumeManager.saveNewOrRetrieveExistingResume(
//            resumeManager,
//            fileName,
//            jobseeker,
//            request);
//    UnprocessedApplication application = new UnprocessedApplication(jobseeker,
//                                                                    job,
//                                                                    resume);
//    JobApplicationResult applicationResult = jobApplicationSystem.apply(
//            application);
//
//    if (applicationResult.failure())
//    {
//      throw new ApplicationFailureException(applicationResult.toString());
//    }
//
//    Map<String, Object> model = new HashMap<>();
//
//    model.put(ModelParameterValues.JOB_ID, jobId);
//
//    ViewProvider viewProvider;
//    if (job == null) {
//      viewProvider = new InvalidJob();
//      viewProvider.provideView(response, model);
//      return response;
//    }
//    TODO: replace this try-catch with polymorphic Resume classes (public static nested ?)
//    try {
//      applicationWorkflow.apply(request, jobseeker, job, origFileName);
//    }
//    catch (Exception e) {
//      viewProvider = new ApplicationError();
//      viewProvider.provideView(response, new HashMap<String, Object>());
//      return response;
//    }
//
//    model.put(ModelParameterValues.JOB_TITLE, job.getTitle());
//
//    viewProvider = returnProviderForProfileStatus(jobseeker, profile);
//    viewProvider.provideView(response, model);
//    return response;
  }
}
