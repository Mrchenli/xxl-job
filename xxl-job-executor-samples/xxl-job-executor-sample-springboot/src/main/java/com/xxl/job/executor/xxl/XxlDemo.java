package com.xxl.job.executor.xxl;

import com.ik2k.lithos.core.annotations.DestroyJob;
import com.ik2k.lithos.core.annotations.Xxl;
import com.ik2k.lithos.core.annotations.XxlJob;
import com.ik2k.lithos.core.model.ExecutorParam;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.executor.service.jobhandler.DemoJobHandler;


/**
 * 注意参数只能是ExecutorParam
 */
@Xxl
public interface XxlDemo {

    @XxlJob(jobCron = "0 */1 * * * ?",jobDesc = "demo01",
            author = "mrchenli",alarmEmail = "1278530889@qq.com",
            executorHandler = DemoJobHandler.class,executorParam = "demo01",onStart = false)
    ReturnT<String> demo01(ExecutorParam executorParam);

    @XxlJob(jobCron = "0 */1 * * * ?",jobDesc = "demo02",
            author = "mrchenli",alarmEmail = "1278530889@qq.com",
            executorHandler = DemoJobHandler.class,executorParam = "demo02",onStart = false)
    @DestroyJob
    ReturnT<String> demo02(ExecutorParam executorParam);

    @XxlJob(jobCron = "0 */1 * * * ?",jobDesc = "demo03",
            author = "mrchenli",alarmEmail = "1278530889@qq.com",
            executorHandler = DemoJobHandler.class,executorParam = "demo03",onStart = true)
    ReturnT<String> demo03(ExecutorParam executorParam);

}
