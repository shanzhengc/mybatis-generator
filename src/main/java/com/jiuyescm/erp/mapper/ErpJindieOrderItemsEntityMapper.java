package com.jiuyescm.erp.mapper;

import com.jiuyescm.erp.entity.ErpJindieOrderItemsEntity;

public interface ErpJindieOrderItemsEntityMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int insert(ErpJindieOrderItemsEntity record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(ErpJindieOrderItemsEntity record);

    /**
     *
     * @mbggenerated
     */
    ErpJindieOrderItemsEntity selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ErpJindieOrderItemsEntity record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ErpJindieOrderItemsEntity record);
}