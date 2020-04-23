package com.xingyuezhiyun.common.util;

import org.apache.commons.lang3.ArrayUtils;

/**
 * 数组工具类
 * Created by Administrator on 2017/2/22 0022.
 */
public final class ArrayUtil {
    /**
     * 判断数组是否非空
     * @param array
     * @return
     */
    public static boolean isNotEmpty(Object[] array){
        return !ArrayUtils.isEmpty(array);
    }

    /**
     * 判断数组是否为空
     * @param array
     * @return
     */
    public static boolean isEmpty(Object[] array){
        return ArrayUtils.isEmpty(array);
    }
}
