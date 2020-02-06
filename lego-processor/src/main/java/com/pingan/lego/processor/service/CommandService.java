package com.pingan.lego.processor.service;

import com.pingan.lego.processor.service.external.CcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: 计算指令接收和查询服务
 * @author: xu min xuan
 * @create: 2020-02-05 17:15
 */
@Service
public class CommandService {

    @Autowired
    private CcService sampleCcServiceImpl;

    public <T> T getTaskInfos(){
        return null;
    }
}