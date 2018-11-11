package com.ims.service;


import com.ims.entity.ImsUser;


public interface ImsUserService {

    /**
     * 检查登陆信息
     * @param userName
     * @param userPassword
     * @return
     */
    ImsUser checkUser(String userName, String userPassword);
}
