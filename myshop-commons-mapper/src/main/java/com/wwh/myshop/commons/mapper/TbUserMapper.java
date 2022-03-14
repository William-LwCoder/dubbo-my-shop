package com.wwh.myshop.commons.mapper;

import com.wwh.myshop.commons.domain.TbUser;
import com.wwh.myshop.commons.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import tk.mybatis.mapper.MyMapper;

@CacheNamespace(implementation = RedisCache.class)
public interface TbUserMapper extends MyMapper<TbUser> {
}