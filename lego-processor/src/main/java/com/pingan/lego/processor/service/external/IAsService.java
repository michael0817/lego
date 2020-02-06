package com.pingan.lego.processor.service.external;

import org.springframework.stereotype.Service;

/**
 * @description: AS调用服务
 * @author: xu min xuan
 * @create: 2020-02-05 16:39
 */
public interface IAsService {

    /**
     * AS KV数据写入方法
     */
    public void insertKvToAs();

    /**
     * AS KV数据读取方法
     */
    public void readKvFromAs();
}