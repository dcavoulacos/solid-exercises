package com.theladders.solid.srp.application;

import java.util.HashMap;
import java.util.Map;

import com.theladders.solid.srp.viewprovider.*;
import com.theladders.solid.srp.http.HttpRequest;
import com.theladders.solid.srp.http.HttpResponse;
import com.theladders.solid.srp.job.Job;
import com.theladders.solid.srp.job.JobSearchService;
import com.theladders.solid.srp.job.application.JobApplicationSystem;
import com.theladders.solid.srp.jobseeker.JobseekerProfile;
import com.theladders.solid.srp.jobseeker.JobseekerProfileManager;
import com.theladders.solid.srp.jobseeker.ProfileStatus;
import com.theladders.solid.srp.jobseeker.Jobseeker;
import com.theladders.solid.srp.resume.MyResumeManager;
import com.theladders.solid.srp.resume.ResumeManager;

public class ApplyController
{
  private final JobSearchService        jobSearchService;
  private final ApplicationWorkflow     applicationWorkflow;

  public ApplyController(JobSearchService jobSearchService,
                         ApplicationWorkflow applicationWorkflow)
  {
    this.jobSearchService = jobSearchService;
    this.applicationWorkflow = applicationWorkflow;
  }

  public HttpResponse handle(HttpRequest request,
                             HttpResponse response,
                             String origFileName)
  {
    Jobseeker jobseeker = request.getSession().getJobseeker();

    String jobIdString = request.getParameter(ModelParameterValues.JOB_ID);
    int jobId = Integer.parseInt(jobIdString);

    Job job = jobSearchService.getJob(jobId);

    boolean isNewResume = !"existing".equals(request.getParameter("whichResume"));
    boolean setAsActive = "yes".equals(request.getParameter("makesResumeActive"));

    applicationWorkflow.apply(jobseeker, job, origFileName, isNewResume, setAsActive);

    return response;
//    if (!"existing".equals(request.getParameter("whichResume")))
//    {
//      resume = resumeManager.saveResume(jobseeker, newResumeFileName);
//
//      if (resume != null && "yes".equals(request.getParameter("makeResumeActive")))
//      {
//        saveAsActive(jobseeker, resume);
//      }
//    }
//    else
//    {
//      resume = getActiveResume(jobseeker.getId());
//    }
  }
}
