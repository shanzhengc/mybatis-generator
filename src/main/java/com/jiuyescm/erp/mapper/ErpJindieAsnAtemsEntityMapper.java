package com.jiuyescm.erp.mapper;

import com.jiuyescm.erp.entity.ErpJindieAsnAtemsEntity;

public interface ErpJindieAsnAtemsEntityMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int insert(ErpJindieAsnAtemsEntity record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(ErpJindieAsnAtemsEntity record);

    /**
     *
     * @mbggenerated
     */
    ErpJindieAsnAtemsEntity selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ErpJindieAsnAtemsEntity record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ErpJindieAsnAtemsEntity record);
}