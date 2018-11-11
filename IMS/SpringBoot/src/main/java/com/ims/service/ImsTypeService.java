package com.ims.service;


import com.ims.entity.ImsType;
import com.ims.entity.ImsUser;

import java.util.List;

/**
 * @author 洪政伟
 */
public interface ImsTypeService {
      int saveType(ImsType imsType);

      List<ImsType> getAllTypes();

    /**
     * 删除商品类别
     * @param imsType
     * @return
     */
    int deleteType(ImsType imsType);

    /**
     * 编辑商品类别
     * @param imsType
     * @return
     */
    int updateType(ImsType imsType);
}
