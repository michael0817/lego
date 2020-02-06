package com.pingan.lego.processor.service;

import com.pingan.lego.config.cache.CommandInfoCache;
import com.pingan.lego.processor.service.external.IEsService;
import com.pingan.lego.processor.service.external.IWsService;
import com.pingan.lego.processor.service.external.IAsService;
import com.pingan.lego.processor.service.external.IDwService;
import com.pingan.lego.processor.service.internal.IRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: 数据中心统一调用服务
 * @author: xu min xuan
 * @create: 2020-02-05 14:26
 */
@Service
public class DataService {

    @Autowired
    public IDwService dwService;
    @Autowired
    public IWsService wsService;
    @Autowired
    public IEsService esService;
    @Autowired
    public IAsService asService;
    @Autowired
    public IRuleService ruleService;


}