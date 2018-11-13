package com.ims.entity;

public class ImsOrder extends BasModel{
    private Integer orderNo;

    private String orderType;

    private String orderStatus;

    private String orderCost;

    private String orderCustomer;

    private String crateTime;

    private String creater;

    private String lastModifyerTime;

    private String lastModifier;

    private String isDeleted;

    private String remarks;

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getOrderCost() {
        return orderCost;
    }

    public void setOrderCost(String orderCost) {
        this.orderCost = orderCost == null ? null : orderCost.trim();
    }

    public String getOrderCustomer() {
        return orderCustomer;
    }

    public void setOrderCustomer(String orderCustomer) {
        this.orderCustomer = orderCustomer == null ? null : orderCustomer.trim();
    }

    @Override
    public String getCrateTime() {
        return crateTime;
    }

    @Override
    public void setCrateTime(String crateTime) {
        this.crateTime = crateTime == null ? null : crateTime.trim();
    }

    @Override
    public String getCreater() {
        return creater;
    }

    @Override
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    @Override
    public String getLastModifyerTime() {
        return lastModifyerTime;
    }

    @Override
    public void setLastModifyerTime(String lastModifyerTime) {
        this.lastModifyerTime = lastModifyerTime == null ? null : lastModifyerTime.trim();
    }

    @Override
    public String getLastModifier() {
        return lastModifier;
    }

    @Override
    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier == null ? null : lastModifier.trim();
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted == null ? null : isDeleted.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}