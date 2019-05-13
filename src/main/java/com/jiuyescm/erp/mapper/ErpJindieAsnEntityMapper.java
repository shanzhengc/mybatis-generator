package com.jiuyescm.erp.mapper;

import com.jiuyescm.erp.entity.ErpJindieAsnEntity;

public interface ErpJindieAsnEntityMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int insert(ErpJindieAsnEntity record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(ErpJindieAsnEntity record);

    /**
     *
     * @mbggenerated
     */
    ErpJindieAsnEntity selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ErpJindieAsnEntity record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ErpJindieAsnEntity record);
}