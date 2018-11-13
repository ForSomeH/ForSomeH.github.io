package com.ims.entity;

public class ImsStockProduct extends BasModel {
    private Integer imsStockProductId;

    private Integer productNo;

    private Integer stockCode;

    private Integer stockProductNum;

    private String crateTime;

    private String creater;

    private String lastModifyerTime;

    private String lastModifier;

    private String isDeleted;

    private String remarks;

    public Integer getImsStockProductId() {
        return imsStockProductId;
    }

    public void setImsStockProductId(Integer imsStockProductId) {
        this.imsStockProductId = imsStockProductId;
    }

    public Integer getProductNo() {
        return productNo;
    }

    public void setProductNo(Integer productNo) {
        this.productNo = productNo;
    }

    public Integer getStockCode() {
        return stockCode;
    }

    public void setStockCode(Integer stockCode) {
        this.stockCode = stockCode;
    }

    public Integer getStockProductNum() {
        return stockProductNum;
    }

    public void setStockProductNum(Integer stockProductNum) {
        this.stockProductNum = stockProductNum;
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}