package entity;

import com.google.common.collect.Maps;
import enums.CfgResponse;
import lombok.Data;

import java.util.Map;

/**
 * @program: lego-parent
 * @description: 跨领域上下文
 * @author: xu min xuan
 * @create: 2020-02-05 10:17
 */
@Data
public class CfgContext extends BaseEntity {

    private static final long serialVersionUID = 5541845276470226240L;

    //线程ID 不可修改
    private String traceNo;

    //事件源ID 不可修改
    private String instanceCode;

    //当前事件类型 随事件变化而变化
    private String eventNo;

    //上一个事件类型 随事件变化而变化
    private String prevEventNo;

    //下一个事件类型 随事件变化而变化
    private String nextEventNo;

    //事件执行结果
    private CfgResponse response = CfgResponse.SUCCESS;

    //事件参数
    private Map<String,Object> parameters = Maps.newHashMap();

    public CfgContext(){};

    //事件中心上下文初始化构造方法
    public CfgContext(String traceNo, String instanceCode, CfgResponse response, Object param){
        this.traceNo = traceNo;
        this.instanceCode = instanceCode;
        this.response = response;
        this.parameters.put(eventNo,param);
    };

}