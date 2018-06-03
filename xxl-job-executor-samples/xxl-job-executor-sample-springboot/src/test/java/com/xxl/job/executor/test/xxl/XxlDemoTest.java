package com.xxl.job.executor.test.xxl;


import com.ik2k.lithos.core.enums.ExecutorType;
import com.ik2k.lithos.core.model.ExecutorParam;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.executor.test.ApplicationTest;
import com.xxl.job.executor.xxl.XxlDemo;
import org.apache.catalina.core.ApplicationContext;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class XxlDemoTest extends ApplicationTest {

    @Autowired
    private XxlDemo xxlDemo;

    @Test
    public void demo01() throws Exception {
        ExecutorParam executorParam = ExecutorParam
                .builder()
                .executorType(ExecutorType.PAUSE)
                .put("name","mrchenli")
                .put("age","18")
                .build();
        ReturnT returnT = xxlDemo.demo03(executorParam);
        System.out.println(returnT.getCode());
        System.out.println(returnT.getContent());
        System.out.println(returnT.getMsg());
    }

    @Test
    public void demo02() throws Exception {
        ExecutorParam executorParam = ExecutorParam.builder().executorType(ExecutorType.TRIGGER_ONCE).put("name","mrchenli").build();
        ReturnT returnT = xxlDemo.demo01(executorParam);
        System.out.println(returnT);
    }

    @Test
    public void demo03() throws Exception {
    }

}