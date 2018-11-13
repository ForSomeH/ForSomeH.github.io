package com.ims.entity;

public class VwOperation {
    private Integer operationNo;

    private String operationStock;

    private String operationType;

    private String orderNo;

    private String remarks;

    private String crateTime;

    private String creater;

    private String lastModifyerTime;

    private String lastModifier;

    private String isDeleted;

    private String office;

    private String codeDisplay;

    private String stockName;

    private String orderCustomer;

    public Integer getOperationNo() {
        return operationNo;
    }

    public void setOperationNo(Integer operationNo) {
        this.operationNo = operationNo;
    }

    public String getOperationStock() {
        return operationStock;
    }

    public void setOperationStock(String operationStock) {
        this.operationStock = operationStock == null ? null : operationStock.trim();
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType == null ? null : operationType.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getCrateTime() {
        return crateTime;
    }

    public void setCrateTime(String crateTime) {
        this.crateTime = crateTime == null ? null : crateTime.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public String getLastModifyerTime() {
        return lastModifyerTime;
    }

    public void setLastModifyerTime(String lastModifyerTime) {
        this.lastModifyerTime = lastModifyerTime == null ? null : lastModifyerTime.trim();
    }

    public String getLastModifier() {
        return lastModifier;
    }

    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier == null ? null : lastModifier.trim();
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted == null ? null : isDeleted.trim();
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office == null ? null : office.trim();
    }

    public String getCodeDisplay() {
        return codeDisplay;
    }

    public void setCodeDisplay(String codeDisplay) {
        this.codeDisplay = codeDisplay == null ? null : codeDisplay.trim();
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName == null ? null : stockName.trim();
    }

    public String getOrderCustomer() {
        return orderCustomer;
    }

    public void setOrderCustomer(String orderCustomer) {
        this.orderCustomer = orderCustomer == null ? null : orderCustomer.trim();
    }
}