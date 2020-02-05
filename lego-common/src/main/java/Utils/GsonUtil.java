package Utils;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import lombok.Getter;

import java.lang.reflect.Type;
import java.util.Map;

/**
 * @program: lego-parent
 * @description: gson工具类
 * @author: xu min xuan
 * @create: 2020-02-05 09:48
 */
public class GsonUtil {

    @Getter
    private static final GsonBuilder builder = new GsonBuilder();

    private static Gson gson = null;

    static {
        builder.enableComplexMapKeySerialization()
                .setDateFormat("yyyy-MM-dd HH:mm:ss")
                .disableHtmlEscaping()
                .setVersion(1.0);
        gson = builder.create();
    }

    public static String toJson(Object obj) {
        return gson.toJson(obj);
    }

    public static <T> T getBean(JsonElement element, Type type){
        return gson.fromJson(element,type);
    }

    public static <T> T getBean(String json, Type type){
        return gson.fromJson(json,type);
    }

    public static <T> T getBean(String json, Class<T> cls){
        return gson.fromJson(json, cls);
    }

    public static void main(String[] args) {
        Map map = Maps.newHashMap();
        map.put("a","123");
        System.out.println(GsonUtil.toJson(map));
    }
}