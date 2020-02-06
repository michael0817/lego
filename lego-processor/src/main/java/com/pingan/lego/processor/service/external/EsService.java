package com.pingan.lego.processor.service.external;

import org.springframework.stereotype.Service;

/**
 * @description: ES调用服务
 * @author: xu min xuan
 * @create: 2020-02-05 16:39
 */
public interface EsService {

    /**
     * ES单条数据写入方法
     */
    public void insertRecordToEs();


    /**
     * ES多行数据读取方法
     */
    public void queryRecordsFromEs();

    /**
     * ES单行数据读取方法
     */
    public void querySingleRecordFromEs();
}