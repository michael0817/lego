package com.pingan.lego.processor.service;

import com.pingan.lego.processor.service.external.EsService;
import com.pingan.lego.processor.service.external.WsService;
import com.pingan.lego.processor.service.external.AsService;
import com.pingan.lego.processor.service.external.DwService;
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
    public DwService dwService;
    @Autowired
    public WsService wsService;
    @Autowired
    public EsService esService;
    @Autowired
    public AsService asService;


}