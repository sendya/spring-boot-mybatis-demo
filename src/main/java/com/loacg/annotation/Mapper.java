package com.loacg.annotation;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.Marker;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.common.RowBoundsMapper;

/**
 * Project: spring-boot-mybatis
 * Author: Sendya <18x@loacg.com>
 * Date: 2017/4/19 14:46
 */
public interface Mapper<T> extends BaseMapper<T>, RowBoundsMapper<T>, Marker, MySqlMapper<T> {
}
