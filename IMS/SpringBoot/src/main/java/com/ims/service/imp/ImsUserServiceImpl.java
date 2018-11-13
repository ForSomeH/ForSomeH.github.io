package com.ims.service.imp;


import com.ims.entity.ImsUser;
import com.ims.entity.ImsUserExample;
import com.ims.mapper.ImsUserMapper;
import com.ims.service.ImsUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author asus
 */
@Service
public class ImsUserServiceImpl implements ImsUserService {
    @Resource
    private ImsUserMapper imsUserMapper;

    /**
     * 验证用户账号和密码
     *
     * @param userName
     * @param userPassword
     * @return
     */
    @Override
    public ImsUser checkUser(String userName, String userPassword) {
        ImsUserExample imsUserExample = new ImsUserExample();
        imsUserExample.createCriteria().andUserNameEqualTo(userName).andUserPasswordEqualTo(userPassword);
        List<ImsUser> imsUsers = imsUserMapper.selectByExample(imsUserExample);
        if (imsUsers.size() == 1) {
            return imsUsers.get(0);
        }
        return null;
    }
}
