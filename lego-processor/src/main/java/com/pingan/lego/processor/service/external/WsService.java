package com.pingan.lego.processor.service.external;

import org.springframework.stereotype.Service;

/**
 * @description: 预计算指标调用服务
 * @author: xu min xuan
 * @create: 2020-02-05 14:27
 */
public interface WsService {

    /**
     * 预计算调用方法
     * 指定业务分类调用
     */
    public void flowPush();

    /**
     * 预计算调用方法
     * 指定计算规则调用
     */
    public void flowPushToFlow();

    /**
     * 预计算结果查询方法
     */
    public void queryFlowData();

    /**
     * 分布式去重写入方法
     */
    public void addtoBloomFilter();

    /**
     * 分布式去重写入方法
     */
    public void isDuplicated();

}
