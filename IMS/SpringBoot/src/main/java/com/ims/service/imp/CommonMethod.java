package com.ims.service.imp;

import com.ims.entity.BasModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 基础的方法和系统设置
 */
@Service
public class CommonMethod {
    @Autowired
    HttpServletRequest request;

    /**
     * 获取当前时间
     *
     * @return
     */
    public String getDate() {
        long timeMillis = System.currentTimeMillis();
        Date date = new Date(timeMillis);
        //转换日期输出格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        return dateFormat.format(date);
    }

    /**
     * 获取当前用户
     */
    public String getUser() {
        return request.getSession().getAttribute("userName").toString();
    }

    /**
     * 设置最后更新和操作时间
     *
     * @param basModel
     */
    public void setModifier(BasModel basModel) {
        basModel.setLastModifier(getUser());
        basModel.setLastModifyerTime(getDate());
    }

    /**
     * 设置创建和操作时间
     *
     * @param basModel
     */
    public void setCreator(BasModel basModel) {
        basModel.setCreater(getUser());
        basModel.setCrateTime(getDate());
        basModel.setIsDeleted("N");
    }
}
