package com.ims.entity;

public class ImsCustomer {
    private Integer customerCode;

    private String customerName;

    private String customerType;

    private String customerTel;

    private String customerAddr;

    private String customerPayType;

    private String customerCompany;

    private String remarks;

    private String crateTime;

    private String creater;

    private String lastModifyerTime;

    private String lastModifier;

    private String isDeleted;

    private String office;

    public Integer getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(Integer customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType == null ? null : customerType.trim();
    }

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel == null ? null : customerTel.trim();
    }

    public String getCustomerAddr() {
        return customerAddr;
    }

    public void setCustomerAddr(String customerAddr) {
        this.customerAddr = customerAddr == null ? null : customerAddr.trim();
    }

    public String getCustomerPayType() {
        return customerPayType;
    }

    public void setCustomerPayType(String customerPayType) {
        this.customerPayType = customerPayType == null ? null : customerPayType.trim();
    }

    public String getCustomerCompany() {
        return customerCompany;
    }

    public void setCustomerCompany(String customerCompany) {
        this.customerCompany = customerCompany == null ? null : customerCompany.trim();
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
}