package com.theladders.solid.isp.oldjob.interfaces;

import com.theladders.solid.isp.oldjob.stubs.Industry;
import com.theladders.solid.isp.oldjob.stubs.Region;

public interface JobCompany
{
  /**
   * @return the name of the company
   */
  String getCompany();

  /**
   * Gets the value of the company_size_id field.
   * This represents the id in the company size table for the description of
   * how large the company is.
   *
   * @return companySize
   */
  Integer getCompanySize();

  /**
   * Get the Industry for this job.
   *
   * @return the Industry for this job.
   */
  Industry getIndustry();

  String getLocation();

  /**
   * Get the region for this job.
   *
   * @return the region for this job.
   */
  Region getRegion();
}
