package com.fun.uncle.myshop.service.search.provider.mapper;

import com.fun.uncle.myshop.service.search.domain.TbItemResult;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/16  10:00
 * @Version: 0.0.1-SNAPSHOT
 */
@Repository
public interface TbItemResultMapper {

    /**
     * 将MySQL内的数据提取出来
     *
     * @return
     */
    List<TbItemResult> selectAll();
}
