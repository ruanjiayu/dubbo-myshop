package com.fun.uncle.myshop.commons.mapper;

import com.fun.uncle.myshop.commons.domain.TbUser;
import com.fun.uncle.myshop.commons.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import tk.mybatis.mapper.MyMapper;

/**
* @Description:   
* @Author:         Xian
* @CreateDate:     2020/1/9  10:05
* @Version:        0.0.1-SNAPSHOT
*/
@CacheNamespace(implementation = RedisCache.class)
public interface TbUserMapper extends MyMapper<TbUser> {
}