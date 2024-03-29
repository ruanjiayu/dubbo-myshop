package com.fun.uncle.myshop.service.upload.fastdfs;

/**
 * @Description: 存储文件服务接口
 * @Author: Xian
 * @CreateDate: 2020/1/14  11:19
 * @Version: 0.0.1-SNAPSHOT
 */
public interface StorageService {
    /**
     * 上传文件
     *
     * @param data    文件的二进制内容
     * @param extName 扩展名
     * @return 上传成功后返回生成的文件id；失败，返回null
     */
     String upload(byte[] data, String extName);

    /**
     * 删除文件
     *
     * @param fileId 被删除的文件id
     * @return 删除成功后返回0，失败后返回错误代码
     */
     int delete(String fileId);
}
