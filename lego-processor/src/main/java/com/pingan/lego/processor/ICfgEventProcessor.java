package com.pingan.lego.processor;


import entity.CfgContext;

/**
 * @program: lego-parent
 * @description: 自定义业务逻辑标准处理接口
 * @author: xu min xuan
 * @create: 2020-02-04 22:36
 */
public interface ICfgEventProcessor {

    public CfgContext process(CfgContext inputContext);

}
