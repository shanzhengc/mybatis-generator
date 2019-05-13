package com.jiuyescm.erp.entity;

import java.util.Date;

public class ErpJindieAsnEntity {
    /**
     * id id
     */
    private Long id;

    /**
     * 租户编号 tenant_id
     */
    private Long tenantId;

    /**
     * 单据编号 asn_no
     */
    private String asnNo;

    /**
     * 单据类型 asn_type
     */
    private String asnType;

    /**
     * 入库日期 asn_time
     */
    private Date asnTime;

    /**
     * 制单日期 asn_cre_time
     */
    private Date asnCreTime;

    /**
     * 制单人 cre_asn_person
     */
    private String creAsnPerson;

    /**
     * 外部单号 reference_no
     */
    private String referenceNo;

    /**
     * 主表备注 asn_remark
     */
    private String asnRemark;

    /**
     * 供应商 supplier_no
     */
    private String supplierNo;

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
    public ErpJindieAsnEntity(Long id, Long tenantId, String asnNo, String asnType, Date asnTime, Date asnCreTime, String creAsnPerson, String referenceNo, String asnRemark, String supplierNo, String crePersonId, String crePerson, Date creTime, String modPersonId, String modPerson, Date modTime, Long version, Date workTime) {
        this.id = id;
        this.tenantId = tenantId;
        this.asnNo = asnNo;
        this.asnType = asnType;
        this.asnTime = asnTime;
        this.asnCreTime = asnCreTime;
        this.creAsnPerson = creAsnPerson;
        this.referenceNo = referenceNo;
        this.asnRemark = asnRemark;
        this.supplierNo = supplierNo;
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
    public ErpJindieAsnEntity() {
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
     * @return asn_no 单据编号
     */
    public String getAsnNo() {
        return asnNo;
    }

    /**
     * 单据编号
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param asnNo 单据编号
     */
    public void setAsnNo(String asnNo) {
        this.asnNo = asnNo == null ? null : asnNo.trim();
    }

    /**
     * 单据类型
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return asn_type 单据类型
     */
    public String getAsnType() {
        return asnType;
    }

    /**
     * 单据类型
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param asnType 单据类型
     */
    public void setAsnType(String asnType) {
        this.asnType = asnType == null ? null : asnType.trim();
    }

    /**
     * 入库日期
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return asn_time 入库日期
     */
    public Date getAsnTime() {
        return asnTime;
    }

    /**
     * 入库日期
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param asnTime 入库日期
     */
    public void setAsnTime(Date asnTime) {
        this.asnTime = asnTime;
    }

    /**
     * 制单日期
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return asn_cre_time 制单日期
     */
    public Date getAsnCreTime() {
        return asnCreTime;
    }

    /**
     * 制单日期
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param asnCreTime 制单日期
     */
    public void setAsnCreTime(Date asnCreTime) {
        this.asnCreTime = asnCreTime;
    }

    /**
     * 制单人
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return cre_asn_person 制单人
     */
    public String getCreAsnPerson() {
        return creAsnPerson;
    }

    /**
     * 制单人
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param creAsnPerson 制单人
     */
    public void setCreAsnPerson(String creAsnPerson) {
        this.creAsnPerson = creAsnPerson == null ? null : creAsnPerson.trim();
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
     * 主表备注
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return asn_remark 主表备注
     */
    public String getAsnRemark() {
        return asnRemark;
    }

    /**
     * 主表备注
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param asnRemark 主表备注
     */
    public void setAsnRemark(String asnRemark) {
        this.asnRemark = asnRemark == null ? null : asnRemark.trim();
    }

    /**
     * 供应商
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return supplier_no 供应商
     */
    public String getSupplierNo() {
        return supplierNo;
    }

    /**
     * 供应商
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param supplierNo 供应商
     */
    public void setSupplierNo(String supplierNo) {
        this.supplierNo = supplierNo == null ? null : supplierNo.trim();
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