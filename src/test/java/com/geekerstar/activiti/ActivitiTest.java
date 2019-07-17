package com.geekerstar.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.Test;

/**
 * @author geekerstar
 * date: 2019-07-17 16:36
 * description: 测试Activiti所需要的25张表的生成
 */
public class ActivitiTest {

    @Test
    public void testGenTable(){
        //1、创建ProcessEngineConfiguration对象
        ProcessEngineConfiguration configuration = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml");

        //2、创建ProcessEngine对象
        ProcessEngine processEngine = configuration.buildProcessEngine();

        //3、输出Process是Engine对象
        System.out.println(processEngine);

    }
}
