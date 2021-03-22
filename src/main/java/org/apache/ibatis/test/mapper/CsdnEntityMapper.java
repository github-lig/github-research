package org.apache.ibatis.test.mapper;


import org.apache.ibatis.test.entity.CsdnEntityDO;

/**
 * 文章
 * @author ligang25@58.com
 * @date 2020/11/3 19:42
 */
public interface CsdnEntityMapper {
    int insert(CsdnEntityDO entityDO);
}
