package com.jiuyescm.erp.entity;

import java.util.Date;

public class ErpJindieOrderEntity {
    /**
     * id id
     */
    private Long id;

    /**
     * 租户编号 tenant_id
     */
    private Long tenantId;

    /**
     * 单据编号 order_no
     */
    private String orderNo;

    /**
     * 单据类型 order_type
     */
    private String orderType;

    /**
     * 出库日期 order_time
     */
    private Date orderTime;

    /**
     * 制单日期 order_cre_time
     */
    private Date orderCreTime;

    /**
     * 制单人 cre_order_person
     */
    private String creOrderPerson;

    /**
     * 外部单号 reference_no
     */
    private String referenceNo;

    /**
     * 运单信息 waybill_information
     */
    private String waybillInformation;

    /**
     * 店铺名称 shop_name
     */
    private String shopName;

    /**
     * 主表备注 order_remark
     */
    private String orderRemark;

    /**
     * 客户 customer_no
     */
    private String customerNo;

    /**
     * 创建人ID cre_person_id
     */
    private String crePersonId;

    /**
     * 创建人 cre_person
     */
    private String crePerson;

    /**
     * 创建时间 cre_time
     */
    private Date creTime;

    /**
     * 修改人ID mod_person_id
     */
    private String modPersonId;

    /**
     * 修改人 mod_person
     */
    private String modPerson;

    /**
     * 修改时间 mod_time
     */
    private Date modTime;

    /**
     * 数据版本号 version
     */
    private Long version;

    /**
     * 作业时间 work_time
     */
    private Date workTime;

    /**
     *
     * @mbggenerated
     */
    public ErpJindieOrderEntity(Long id, Long tenantId, String orderNo, String orderType, Date orderTime, Date orderCreTime, String creOrderPerson, String referenceNo, String waybillInformation, String shopName, String orderRemark, String customerNo, String crePersonId, String crePerson, Date creTime, String modPersonId, String modPerson, Date modTime, Long version, Date workTime) {
        this.id = id;
        this.tenantId = tenantId;
        this.orderNo = orderNo;
        this.orderType = orderType;
        this.orderTime = orderTime;
        this.orderCreTime = orderCreTime;
        this.creOrderPerson = creOrderPerson;
        this.referenceNo = referenceNo;
        this.waybillInformation = waybillInformation;
        this.shopName = shopName;
        this.orderRemark = orderRemark;
        this.customerNo = customerNo;
        this.crePersonId = crePersonId;
        this.crePerson = crePerson;
        this.creTime = creTime;
        this.modPersonId = modPersonId;
        this.modPerson = modPerson;
        this.modTime = modTime;
        this.version = version;
        this.workTime = workTime;
    }

    /**
     *
     * @mbggenerated
     */
    public ErpJindieOrderEntity() {
        super();
    }

    /**
     * id
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return id id
     */
    public Long getId() {
        return id;
    }

    /**
     * id
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 租户编号
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return tenant_id 租户编号
     */
    public Long getTenantId() {
        return tenantId;
    }

    /**
     * 租户编号
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param tenantId 租户编号
     */
    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * 单据编号
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return order_no 单据编号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 单据编号
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param orderNo 单据编号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * 单据类型
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return order_type 单据类型
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * 单据类型
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param orderType 单据类型
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    /**
     * 出库日期
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return order_time 出库日期
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * 出库日期
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param orderTime 出库日期
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * 制单日期
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return order_cre_time 制单日期
     */
    public Date getOrderCreTime() {
        return orderCreTime;
    }

    /**
     * 制单日期
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param orderCreTime 制单日期
     */
    public void setOrderCreTime(Date orderCreTime) {
        this.orderCreTime = orderCreTime;
    }

    /**
     * 制单人
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return cre_order_person 制单人
     */
    public String getCreOrderPerson() {
        return creOrderPerson;
    }

    /**
     * 制单人
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param creOrderPerson 制单人
     */
    public void setCreOrderPerson(String creOrderPerson) {
        this.creOrderPerson = creOrderPerson == null ? null : creOrderPerson.trim();
    }

    /**
     * 外部单号
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return reference_no 外部单号
     */
    public String getReferenceNo() {
        return referenceNo;
    }

    /**
     * 外部单号
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param referenceNo 外部单号
     */
    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo == null ? null : referenceNo.trim();
    }

    /**
     * 运单信息
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return waybill_information 运单信息
     */
    public String getWaybillInformation() {
        return waybillInformation;
    }

    /**
     * 运单信息
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param waybillInformation 运单信息
     */
    public void setWaybillInformation(String waybillInformation) {
        this.waybillInformation = waybillInformation == null ? null : waybillInformation.trim();
    }

    /**
     * 店铺名称
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return shop_name 店铺名称
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * 店铺名称
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param shopName 店铺名称
     */
    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    /**
     * 主表备注
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return order_remark 主表备注
     */
    public String getOrderRemark() {
        return orderRemark;
    }

    /**
     * 主表备注
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param orderRemark 主表备注
     */
    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark == null ? null : orderRemark.trim();
    }

    /**
     * 客户
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return customer_no 客户
     */
    public String getCustomerNo() {
        return customerNo;
    }

    /**
     * 客户
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param customerNo 客户
     */
    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo == null ? null : customerNo.trim();
    }

    /**
     * 创建人ID
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return cre_person_id 创建人ID
     */
    public String getCrePersonId() {
        return crePersonId;
    }

    /**
     * 创建人ID
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param crePersonId 创建人ID
     */
    public void setCrePersonId(String crePersonId) {
        this.crePersonId = crePersonId == null ? null : crePersonId.trim();
    }

    /**
     * 创建人
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return cre_person 创建人
     */
    public String getCrePerson() {
        return crePerson;
    }

    /**
     * 创建人
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param crePerson 创建人
     */
    public void setCrePerson(String crePerson) {
        this.crePerson = crePerson == null ? null : crePerson.trim();
    }

    /**
     * 创建时间
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return cre_time 创建时间
     */
    public Date getCreTime() {
        return creTime;
    }

    /**
     * 创建时间
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param creTime 创建时间
     */
    public void setCreTime(Date creTime) {
        this.creTime = creTime;
    }

    /**
     * 修改人ID
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return mod_person_id 修改人ID
     */
    public String getModPersonId() {
        return modPersonId;
    }

    /**
     * 修改人ID
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param modPersonId 修改人ID
     */
    public void setModPersonId(String modPersonId) {
        this.modPersonId = modPersonId == null ? null : modPersonId.trim();
    }

    /**
     * 修改人
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return mod_person 修改人
     */
    public String getModPerson() {
        return modPerson;
    }

    /**
     * 修改人
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param modPerson 修改人
     */
    public void setModPerson(String modPerson) {
        this.modPerson = modPerson == null ? null : modPerson.trim();
    }

    /**
     * 修改时间
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return mod_time 修改时间
     */
    public Date getModTime() {
        return modTime;
    }

    /**
     * 修改时间
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param modTime 修改时间
     */
    public void setModTime(Date modTime) {
        this.modTime = modTime;
    }

    /**
     * 数据版本号
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return version 数据版本号
     */
    public Long getVersion() {
        return version;
    }

    /**
     * 数据版本号
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param version 数据版本号
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * 作业时间
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return work_time 作业时间
     */
    public Date getWorkTime() {
        return workTime;
    }

    /**
     * 作业时间
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param workTime 作业时间
     */
    public void setWorkTime(Date workTime) {
        this.workTime = workTime;
    }
}