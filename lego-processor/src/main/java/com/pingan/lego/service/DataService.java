package com.pingan.lego.service;

import com.pingan.lego.service.external.AsService;
import com.pingan.lego.service.external.DwService;
import com.pingan.lego.service.external.EsService;
import com.pingan.lego.service.external.WsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: lego-parent
 * @description: 数据统一服务
 * @author: xuminxuan
 * @create: 2020-02-05 14:26
 */
@Service
public class DataService {

    @Autowired
    public DwService dwServcie;
    @Autowired
    public WsService wsService;
    @Autowired
    public EsService esService;
    @Autowired
    public AsService asService;


}