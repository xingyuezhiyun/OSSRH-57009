package com.xingyuezhiyun.common.util;

import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * JSON工具类
 * Created by Administrator on 2017/2/22 0022.
 */
@Slf4j
public final class JsonUtil {
    /**
     * 将POJO转为JSON
     */
    public static <T> String toJson(T obj){
        String json;
        try {
            json = JSONUtil.toJsonStr(obj);
        }catch (Exception e){
            log.error("convert POJO JSON failure",e);
            throw new RuntimeException(e);
        }
        return json;
    }
    /**
     * 将JSON转为POJO
     */
    public static <T> T fromJson(String json,Class<T> type){
        T pojo;
        try {
            pojo = JSONUtil.toBean(json, type);
        }catch (Exception e){
            log.error("convert JSON to POJO  failure",e);
            throw new RuntimeException(e);
        }
        return pojo;
    }
}
