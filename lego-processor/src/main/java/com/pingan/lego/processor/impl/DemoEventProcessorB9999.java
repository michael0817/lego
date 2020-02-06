package com.pingan.lego.processor.impl;

import com.pingan.lego.processor.ICfgEventProcessor;
import com.pingan.lego.processor.service.CommandService;
import com.pingan.lego.processor.service.DataService;
import entity.CfgContext;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: lego-parent
 * @description: DemoEventProcessorB9999
 * @author: xu min xuan
 * @create: 2020-02-05 16:44
 */
public class DemoEventProcessorB9999 implements ICfgEventProcessor {

    @Autowired
    private DataService dataService;
    @Autowired
    private CommandService commandService;

    @Override
    public CfgContext process(CfgContext inputContext) throws Exception {

        return null;
    }
}