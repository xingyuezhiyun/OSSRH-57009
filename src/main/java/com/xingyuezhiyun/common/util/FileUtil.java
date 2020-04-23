package com.xingyuezhiyun.common.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import java.io.File;

/**
 * 文件操作工具类
 * Created by Administrator on 2017/4/17 0017.
 */
@Slf4j
public final class FileUtil {
    /**
     * 获取真实文件名(自动去掉文件路径)
     */
    public static String getRealFileName(String fileName){
        return FilenameUtils.getName(fileName);
    }
    /**
     * 创建文件
     */
    public static File createFile(String filePath){
       File file;
        try {
            file = new File(filePath);
            File parentDir = file.getParentFile();
            if (!parentDir.exists()){
                FileUtils.forceMkdir(parentDir);
            }
        }catch (Exception e){
            log.error("create file failure",e);
            throw new RuntimeException(e);
        }
        return file;
    }
}
