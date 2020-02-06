package com.pingan.lego.processor.impl;

import com.pingan.lego.output.ICfgMqProducer;
import com.pingan.lego.processor.ICfgEventProcessor;
import com.pingan.lego.processor.service.CommandService;
import com.pingan.lego.processor.service.DataService;
import entity.CfgContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @description: 业务逻辑处理程序示例
 * @author: xu min xuan
 * @create: 2020-02-05 16:44
 */
@Service
public class DemoEventProcessorB9999 implements ICfgEventProcessor {

    @Autowired
    private DataService dataService;
    @Autowired
    private CommandService commandService;
    @Autowired
    private ICfgMqProducer cfgMqProducer;

    @Override
    public CfgContext process(CfgContext inputContext) {

        //获取上一个事件下传的参数
        Map<String,Object> paramters = inputContext.getParameters();
        //获取待执行任务
        commandService.getCommandInfo();
        //如涉及累计运算，执行累计事件，例如接收一个交易事件，但是需要统计一段时间的累计交易金额
        dataService.wsService.flowPush();
        //查询外部指标、累计运算指标等，类似join的操作
        dataService.dwService.queryVariable();
        //执行决策规则
        dataService.ruleService.executeRule();
        //发送计算结果
        cfgMqProducer.sendMq();
        return null;
    }
}