package com.pingan.lego.output;

import org.springframework.stereotype.Service;

/**
 * @description: 消息生产者
 * @author: xu min xuan
 * @create: 2020-02-06 12:28
 **/
public interface ICfgMqProducer {

    /**
     * 发送事件
     */
    public void sendMq();
}
