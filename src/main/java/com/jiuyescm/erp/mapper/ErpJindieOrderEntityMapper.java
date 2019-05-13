package com.jiuyescm.erp.mapper;

import com.jiuyescm.erp.entity.ErpJindieOrderEntity;

public interface ErpJindieOrderEntityMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int insert(ErpJindieOrderEntity record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(ErpJindieOrderEntity record);

    /**
     *
     * @mbggenerated
     */
    ErpJindieOrderEntity selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ErpJindieOrderEntity record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ErpJindieOrderEntity record);
}