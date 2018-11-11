package com.ims.service.imp;


import com.ims.entity.*;
import com.ims.mapper.ImsTypeMapper;
import com.ims.mapper.ImsUserMapper;
import com.ims.service.ImsTypeService;
import com.ims.service.ImsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author asus
 */
@Service
public class ImsTypeServiceImpl implements ImsTypeService {
    @Resource
    private ImsTypeMapper imsTypeMapper;
    @Autowired
    CommonMethod commonMethod;

    @Override
    public int saveType(ImsType imsType) {
        imsType.setIsDeleted("N");
        imsType.setCreater(commonMethod.getUser());
        imsType.setCrateTime(commonMethod.getDate());
        return imsTypeMapper.insert(imsType);
    }

    @Override
    public List<ImsType> getAllTypes() {
        ImsTypeExample imsTypeExample = new ImsTypeExample();
        imsTypeExample.createCriteria().andTypeCodeIsNotNull().andIsDeletedEqualTo("N");
        return imsTypeMapper.selectByExample(imsTypeExample);
    }

    /**
     * 删除商品类别
     *
     * @param imsType
     * @return
     */
    @Override
    public int deleteType(ImsType imsType) {
        ImsType type = imsTypeMapper.selectByPrimaryKey(imsType.getTypeCode());
        type.setLastModifier(commonMethod.getUser());
        type.setLastModifyerTime(commonMethod.getDate());
        type.setIsDeleted("Y");
        return imsTypeMapper.updateByPrimaryKey(type);
    }

    /**
     * 更新商品类别
     * @param imsType
     * @return
     */
    @Override
    public int updateType(ImsType imsType) {
        ImsType type = imsTypeMapper.selectByPrimaryKey(imsType.getTypeCode());
        imsType.setLastModifier(commonMethod.getUser());
        imsType.setLastModifyerTime(commonMethod.getDate());
        imsType.setIsDeleted("N");
        imsType.setCrateTime(type.getCrateTime());
        imsType.setCreater(type.getCreater());
        return imsTypeMapper.updateByPrimaryKey(imsType);
    }


}
