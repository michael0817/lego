package com.pingan.lego.processor;


import entity.CfgContext;

/**
 * @program: lego-parent
 * @description: 公共事件处理接口
 * @author: xu min xuan
 * @create: 2020-02-04 22:36
 */
public interface ICfgEventProcessor {

    public CfgContext process(CfgContext inputContext) throws Exception;

}
