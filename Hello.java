package com.offcn;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class HelloJob implements Job {

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		
		System.out.println("作业执行中  "+"当前时间为："+new Date().toLocaleString());
		
	}



}
