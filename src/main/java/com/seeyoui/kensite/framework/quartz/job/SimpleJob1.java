package com.seeyoui.kensite.framework.quartz.job;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;

public class SimpleJob1 implements Job {

    private static Logger _log = LoggerFactory.getLogger(SimpleJob1.class);

    public SimpleJob1() {
    }

    public void execute(JobExecutionContext context)
        throws JobExecutionException {
        JobKey jobKey = context.getJobDetail().getKey();
        System.out.println("SimpleJob111 says: " + jobKey + " executing at " + new Date());
    }

}
