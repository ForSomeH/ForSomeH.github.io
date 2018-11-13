package com.ims.entity;

/**
 * 实体类基础
 *
 * @author 洪政伟
 */
public class BasModel {
    /**
     * 创建时间
     */
    private String crateTime;
    private String isDeleted;

    /**
     * 创建人
     */
    private String creater;
    /**
     * 最后操作时间
     */
    private String lastModifyerTime;
    /**
     * 最后操作人
     */
    private String lastModifier;


    public String getLastModifyerTime() {
        return lastModifyerTime;
    }

    /**
     * 更新最后操作时间
     *
     * @return
     */
    public void setLastModifyerTime(String lastModifyerTime) {
        this.lastModifyerTime = lastModifyerTime;
    }

    public String getLastModifier() {
        return lastModifier;
    }

    public String getCrateTime() {
        return crateTime;
    }

    public void setCrateTime(String crateTime) {
        this.crateTime = crateTime;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    /**
     * 更新最后操作人
     *
     * @return
     */
    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier;
    }


    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }
}
