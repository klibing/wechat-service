package com.libing.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

public class MyElasticJob implements SimpleJob {
	private static final Logger logger = LoggerFactory.getLogger(MyElasticJob.class);

	@Override
	public void execute(ShardingContext shardingContext) {
		System.out.println("=================任务开始===============");
		logger.debug("=================任务开始===============");
	}
}
