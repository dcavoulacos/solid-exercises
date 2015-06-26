package com.theladders.solid.isp.oldjob.interfaces;

import java.util.Date;

public interface JobSystemInformation
{
  /**
   * Get the date this job was entered into the system.
   *
   * @return the Date the job was entered.
   */
  Date getEntryDate();

  int getOldJobId();

  int getSubscriberId();

  /**
   * @return The last time this job was updated
   */
  Date getUpdateTime();

  /**
   * Refactored so it can be used by both job and JobReq
   * @return fullJobDescription()
   *
   */
  String getDescription();
}
