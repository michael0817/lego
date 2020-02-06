package com.pingan.lego.processor.service.external;

/**
 * @description: 控制中心调用服务
 * @author: xu min xuan
 * @create: 2020-02-06 12:55
 **/
public interface CcService {

    /**
     * 查询需要执行的任务及相关属性
     */
    public <T> T getTaskInfo();
}
