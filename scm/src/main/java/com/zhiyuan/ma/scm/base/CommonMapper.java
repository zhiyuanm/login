package com.zhiyuan.ma.scm.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.DeleteByIdsMapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface CommonMapper<T> extends DeleteByIdsMapper<T>,Mapper<T>, SelectByIdsMapper<T> {

}
