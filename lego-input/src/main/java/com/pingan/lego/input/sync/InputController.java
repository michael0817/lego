package com.pingan.lego.input.sync;

import Utils.GsonUtil;
import com.pingan.lego.processor.ICfgEventProcessor;
import entity.CfgContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @description: 同步响应接口
 * @author: xu min xuan
 * @create: 2020-02-04 22:23
 */
@RestController
@RequestMapping(value="/sync")
public class InputController {

    @Autowired
    ICfgEventProcessor demoEventProcessorB9999;

    @RequestMapping(value = "/process", method = RequestMethod.GET)
    public CfgContext process(@RequestParam(value = "inputContext", required = false) String context, HttpServletRequest
            request) {
        return demoEventProcessorB9999.process(GsonUtil.getBean(context, CfgContext.class));
    }
}