package entity;

import Utils.GsonUtil;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * @program: lego-parent
 * @description: 基本对象类型
 * @author: xu min xuan
 * @create: 2020-02-05 09:33
 */
public class BaseEntity implements Serializable,Cloneable {

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public int compareTo(Object obj){
        return CompareToBuilder.reflectionCompare(this,obj);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this,obj);
    }

    public String toJson(){
        return GsonUtil.toJson(this);
    }

    public static <T> T getBean(String json, Class<T> cls){
        return GsonUtil.getBean(json, cls);
    }
}