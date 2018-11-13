package com.ims.service.imp;

import com.ims.entity.ImsStock;
import com.ims.entity.ImsStockExample;
import com.ims.entity.ImsType;
import com.ims.mapper.ImsProductMapper;
import com.ims.mapper.ImsStockMapper;
import com.ims.service.ImsStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 洪政伟
 */
@Service
public class ImsStockServiceImpl implements ImsStockService {
    @Resource
    private ImsStockMapper imsStockMapper;
    @Autowired
    CommonMethod commonMethod;

    /**
     * 新增
     *
     * @param imsStock
     * @return
     */
    @Override
    public int saveStock(ImsStock imsStock) {
        imsStock.setCreater(commonMethod.getUser());
        imsStock.setCrateTime(commonMethod.getDate());
        imsStock.setIsDeleted("N");
        return imsStockMapper.insert(imsStock);
    }

    /**
     * 删除
     *
     * @param imsStock
     * @return
     */
    @Override
    public int deleteStock(ImsStock imsStock) {
        ImsStock Stock = imsStockMapper.selectByPrimaryKey(imsStock.getStockCode());
        Stock.setIsDeleted("Y");
        return imsStockMapper.updateByPrimaryKey(Stock);
    }

    /**
     * 更改
     *
     * @param imsStock
     * @return
     */
    @Override
    public int updateStock(ImsStock imsStock) {
        ImsStock Stock = imsStockMapper.selectByPrimaryKey(imsStock.getStockCode());
        imsStock.setIsDeleted("N");
        imsStock.setCreater(Stock.getCreater());
        imsStock.setCrateTime(Stock.getCrateTime());
        imsStock.setLastModifier(commonMethod.getUser());
        imsStock.setLastModifyerTime(commonMethod.getDate());
        return imsStockMapper.updateByPrimaryKey(imsStock);
    }

    /**
     * 查询
     *
     * @return
     */
    @Override
    public List<ImsStock> getAllStocks() {
        ImsStockExample imsStockExample = new ImsStockExample();
        imsStockExample.createCriteria().andStockCodeIsNotNull();
        return imsStockMapper.selectByExample(imsStockExample);
    }
}
