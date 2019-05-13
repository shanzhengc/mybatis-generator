package com.jiuyescm.erp.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ErpJindieOrderItemsEntity {
    /**
     * 编号 id
     */
    private Long id;

    /**
     * 单据编号 order_no
     */
    private String orderNo;

    /**
     * 租户id tenant_id
     */
    private Long tenantId;

    /**
     * 行号 line
     */
    private Short line;

    /**
     * 商品代码 products_extendid
     */
    private String productsExtendid;

    /**
     * 数量 qty
     */
    private BigDecimal qty;

    /**
     * 仓库 warehouse_no
     */
    private String warehouseNo;

    /**
     * 批次号 batch_code
     */
    private String batchCode;

    /**
     * 生产日期 product_time
     */
    private Date productTime;

    /**
     * 失效日期 expiry_time
     */
    private Date expiryTime;

    /**
     * 保质期 shelflife_day
     */
    private Short shelflifeDay;

    /**
     * 明细表备注 order_items_remark
     */
    private String orderItemsRemark;

    /**
     * 货主 owner_code
     */
    private String ownerCode;

    /**
     * 库存类型 inventory_type
     */
    private String inventoryType;

    /**
     * 库存状态 inventory_status
     */
    private String inventoryStatus;

    /**
     * 销售单价 sales_price
     */
    private BigDecimal salesPrice;

    /**
     * 销售税率 tax_rate
     */
    private BigDecimal taxRate;

    /**
     * 销售金额 sales_money
     */
    private BigDecimal salesMoney;

    /**
     * 源单单号 source_no
     */
    private String sourceNo;

    /**
     * 源单行号 source_line
     */
    private Short sourceLine;

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
     *
     * @mbggenerated
     */
    public ErpJindieOrderItemsEntity(Long id, String orderNo, Long tenantId, Short line, String productsExtendid, BigDecimal qty, String warehouseNo, String batchCode, Date productTime, Date expiryTime, Short shelflifeDay, String orderItemsRemark, String ownerCode, String inventoryType, String inventoryStatus, BigDecimal salesPrice, BigDecimal taxRate, BigDecimal salesMoney, String sourceNo, Short sourceLine, String crePersonId, String crePerson, Date creTime, String modPersonId, String modPerson, Date modTime, Long version) {
        this.id = id;
        this.orderNo = orderNo;
        this.tenantId = tenantId;
        this.line = line;
        this.productsExtendid = productsExtendid;
        this.qty = qty;
        this.warehouseNo = warehouseNo;
        this.batchCode = batchCode;
        this.productTime = productTime;
        this.expiryTime = expiryTime;
        this.shelflifeDay = shelflifeDay;
        this.orderItemsRemark = orderItemsRemark;
        this.ownerCode = ownerCode;
        this.inventoryType = inventoryType;
        this.inventoryStatus = inventoryStatus;
        this.salesPrice = salesPrice;
        this.taxRate = taxRate;
        this.salesMoney = salesMoney;
        this.sourceNo = sourceNo;
        this.sourceLine = sourceLine;
        this.crePersonId = crePersonId;
        this.crePerson = crePerson;
        this.creTime = creTime;
        this.modPersonId = modPersonId;
        this.modPerson = modPerson;
        this.modTime = modTime;
        this.version = version;
    }

    /**
     *
     * @mbggenerated
     */
    public ErpJindieOrderItemsEntity() {
        super();
    }

    /**
     * 编号
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return id 编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 编号
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param id 编号
     */
    public void setId(Long id) {
        this.id = id;
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
     * 租户id
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return tenant_id 租户id
     */
    public Long getTenantId() {
        return tenantId;
    }

    /**
     * 租户id
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param tenantId 租户id
     */
    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * 行号
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return line 行号
     */
    public Short getLine() {
        return line;
    }

    /**
     * 行号
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param line 行号
     */
    public void setLine(Short line) {
        this.line = line;
    }

    /**
     * 商品代码
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return products_extendid 商品代码
     */
    public String getProductsExtendid() {
        return productsExtendid;
    }

    /**
     * 商品代码
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param productsExtendid 商品代码
     */
    public void setProductsExtendid(String productsExtendid) {
        this.productsExtendid = productsExtendid == null ? null : productsExtendid.trim();
    }

    /**
     * 数量
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return qty 数量
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * 数量
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param qty 数量
     */
    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    /**
     * 仓库
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return warehouse_no 仓库
     */
    public String getWarehouseNo() {
        return warehouseNo;
    }

    /**
     * 仓库
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param warehouseNo 仓库
     */
    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo == null ? null : warehouseNo.trim();
    }

    /**
     * 批次号
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return batch_code 批次号
     */
    public String getBatchCode() {
        return batchCode;
    }

    /**
     * 批次号
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param batchCode 批次号
     */
    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode == null ? null : batchCode.trim();
    }

    /**
     * 生产日期
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return product_time 生产日期
     */
    public Date getProductTime() {
        return productTime;
    }

    /**
     * 生产日期
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param productTime 生产日期
     */
    public void setProductTime(Date productTime) {
        this.productTime = productTime;
    }

    /**
     * 失效日期
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return expiry_time 失效日期
     */
    public Date getExpiryTime() {
        return expiryTime;
    }

    /**
     * 失效日期
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param expiryTime 失效日期
     */
    public void setExpiryTime(Date expiryTime) {
        this.expiryTime = expiryTime;
    }

    /**
     * 保质期
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return shelflife_day 保质期
     */
    public Short getShelflifeDay() {
        return shelflifeDay;
    }

    /**
     * 保质期
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param shelflifeDay 保质期
     */
    public void setShelflifeDay(Short shelflifeDay) {
        this.shelflifeDay = shelflifeDay;
    }

    /**
     * 明细表备注
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return order_items_remark 明细表备注
     */
    public String getOrderItemsRemark() {
        return orderItemsRemark;
    }

    /**
     * 明细表备注
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param orderItemsRemark 明细表备注
     */
    public void setOrderItemsRemark(String orderItemsRemark) {
        this.orderItemsRemark = orderItemsRemark == null ? null : orderItemsRemark.trim();
    }

    /**
     * 货主
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return owner_code 货主
     */
    public String getOwnerCode() {
        return ownerCode;
    }

    /**
     * 货主
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param ownerCode 货主
     */
    public void setOwnerCode(String ownerCode) {
        this.ownerCode = ownerCode == null ? null : ownerCode.trim();
    }

    /**
     * 库存类型
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return inventory_type 库存类型
     */
    public String getInventoryType() {
        return inventoryType;
    }

    /**
     * 库存类型
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param inventoryType 库存类型
     */
    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType == null ? null : inventoryType.trim();
    }

    /**
     * 库存状态
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return inventory_status 库存状态
     */
    public String getInventoryStatus() {
        return inventoryStatus;
    }

    /**
     * 库存状态
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param inventoryStatus 库存状态
     */
    public void setInventoryStatus(String inventoryStatus) {
        this.inventoryStatus = inventoryStatus == null ? null : inventoryStatus.trim();
    }

    /**
     * 销售单价
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return sales_price 销售单价
     */
    public BigDecimal getSalesPrice() {
        return salesPrice;
    }

    /**
     * 销售单价
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param salesPrice 销售单价
     */
    public void setSalesPrice(BigDecimal salesPrice) {
        this.salesPrice = salesPrice;
    }

    /**
     * 销售税率
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return tax_rate 销售税率
     */
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    /**
     * 销售税率
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param taxRate 销售税率
     */
    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * 销售金额
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return sales_money 销售金额
     */
    public BigDecimal getSalesMoney() {
        return salesMoney;
    }

    /**
     * 销售金额
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param salesMoney 销售金额
     */
    public void setSalesMoney(BigDecimal salesMoney) {
        this.salesMoney = salesMoney;
    }

    /**
     * 源单单号
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return source_no 源单单号
     */
    public String getSourceNo() {
        return sourceNo;
    }

    /**
     * 源单单号
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param sourceNo 源单单号
     */
    public void setSourceNo(String sourceNo) {
        this.sourceNo = sourceNo == null ? null : sourceNo.trim();
    }

    /**
     * 源单行号
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @return source_line 源单行号
     */
    public Short getSourceLine() {
        return sourceLine;
    }

    /**
     * 源单行号
     * @author caishanzheng
     * @date 2019-05-13 17:20:39
     * @param sourceLine 源单行号
     */
    public void setSourceLine(Short sourceLine) {
        this.sourceLine = sourceLine;
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
}