package com.ims.service.imp;

import com.ims.entity.*;
import com.ims.mapper.*;
import com.ims.service.ImsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author asus
 */
@Service
public class ImsProductServiceImpl implements ImsProductService {
    @Resource
    private ImsProductMapper imsProductMapper;
    @Resource
    private VwProductMapper vwProductMapper;
    @Resource
    private ImsStockProductMapper imsStockProductMapper;
    @Autowired
    CommonMethod commonMethod;

    /**
     * 新增商品
     *
     * @param imsProduct
     * @return
     */
    @Override
    public int saveProduct(ImsProduct imsProduct) {
        imsProduct.setIsDeleted("N");
        imsProduct.setCreater(commonMethod.getUser());
        imsProduct.setCrateTime(commonMethod.getDate());
        return imsProductMapper.insert(imsProduct);
    }

    /**
     * 获取所有商品
     *
     * @return
     */
    @Override
    public List<VwProduct> getAllVwProduct() {
        VwProductExample vwProductExample = new VwProductExample();
        vwProductExample.createCriteria().andIsDeletedEqualTo("N");
        List<VwProduct> vwProductList = vwProductMapper.selectByExample(vwProductExample);
        //查询每个产品的库存汇总
        for (VwProduct vwProduct : vwProductList) {
            ImsStockProductExample imsStockProductExample = new ImsStockProductExample();
            imsStockProductExample.createCriteria().andProductNoEqualTo(vwProduct.getProductNo());
            List<ImsStockProduct> imsStockProducts = imsStockProductMapper.selectByExample(imsStockProductExample);
            int sum = 0;
            for (ImsStockProduct ims : imsStockProducts) {
                sum += ims.getStockProductNum();
            }
            vwProduct.setProductSum(sum + "");
        }
        return vwProductList;
    }

    /**
     * 更新商品信息
     *
     * @param imsProduct
     * @return
     */
    @Override
    public int updateProduct(ImsProduct imsProduct) {
        ImsProduct model = imsProductMapper.selectByPrimaryKey(imsProduct.getProductNo());
        imsProduct.setLastModifier(commonMethod.getUser());
        imsProduct.setLastModifyerTime(commonMethod.getDate());
        imsProduct.setIsDeleted("N");
        imsProduct.setCreater(model.getCreater());
        imsProduct.setCrateTime(model.getCrateTime());
        return imsProductMapper.updateByPrimaryKey(imsProduct);
    }

    /**
     * 删除产品
     *
     * @param imsProduct
     * @return
     */
    @Override
    public int deleteProduct(ImsProduct imsProduct) {
        ImsProduct product = imsProductMapper.selectByPrimaryKey(imsProduct.getProductNo());
        product.setLastModifier(commonMethod.getUser());
        product.setLastModifyerTime(commonMethod.getDate());
        product.setIsDeleted("Y");
        return imsProductMapper.updateByPrimaryKey(product);
    }


}
