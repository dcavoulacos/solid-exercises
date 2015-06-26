package com.theladders.solid.isp.oldjob.interfaces;

import java.util.Date;
import java.util.List;

import com.theladders.solid.isp.oldjob.stubs.Discipline;
import com.theladders.solid.isp.oldjob.stubs.Experience;

public interface JobInformation
{
  /**
   * Retrieves a list of disciplines for this job.
   *
   * @return List of Disciplines
   */
  List<Discipline> getDisciplines();

  /**
   * Returns an object that represents the number of years of experience
   * that are required for this job.
   * @return experience object
   */
  Experience getExperience();

  /**
   * Get the date this job was published.
   *
   * @return the Date the job was published.
   */
  Date getPublicationDate();

  /**
   * Get this job's title.
   *
   * @return the title for this job.
   */
  String getTitle();

  /**
   * Get the "reportsTo" field.
   *
   * @return reportsTo
   */
  String getReportsTo();
}
