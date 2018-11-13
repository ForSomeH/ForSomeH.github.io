package com.ims.service.imp;

import com.ims.entity.ImsProduct;
import com.ims.entity.ImsStock;
import com.ims.entity.ImsStockProduct;
import com.ims.entity.ImsStockProductExample;
import com.ims.mapper.ImsStockProductMapper;
import com.ims.service.ImsStockProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author asus
 */
@Service
public class ImsStockProductServiceImpl implements ImsStockProductService {
    @Resource
    ImsStockProductMapper imsStockProductMapper;
    @Autowired
    CommonMethod commonMethod;

    /**
     * 更新仓库商品的数量
     *
     * @param stock
     * @param product
     * @param Num
     */
    @Override
    public void updateProducts(ImsStock stock, ImsProduct product, String Num) {
        ImsStockProductExample imsStockProductExample = new ImsStockProductExample();
        imsStockProductExample.createCriteria().andStockCodeEqualTo(stock.getStockCode()).andProductNoEqualTo(product.getProductNo());
        List<ImsStockProduct> imsStockProducts = imsStockProductMapper.selectByExample(imsStockProductExample);
        //如果该仓库不存在该种商品，则创建
        if (imsStockProducts.size() == 0) {
            ImsStockProduct imsStockProduct = new ImsStockProduct();
            imsStockProduct.setStockCode(stock.getStockCode());
            imsStockProduct.setProductNo(product.getProductNo());
            imsStockProduct.setStockProductNum(Integer.parseInt(Num));
            //创建人的信息赋值
            commonMethod.setCreator(imsStockProduct);
            imsStockProductMapper.insert(imsStockProduct);
        }
        //如存在，则进行数量的修改
        else if (imsStockProducts.size() == 1) {
            ImsStockProduct imsStockProduct = imsStockProducts.get(0);
            imsStockProduct.setStockProductNum(imsStockProduct.getStockProductNum().intValue() + Integer
                    .parseInt(Num));
            //修改人的信息赋值
            commonMethod.setModifier(imsStockProduct);
            imsStockProductMapper.updateByPrimaryKey(imsStockProduct);
        }
    }

    /**
     * 获取全部仓库的商品信息
     *
     * @param stockNo
     * @return
     */
    @Override
    public List<ImsStockProduct> getAllStockProducts(Integer stockNo) {
        List<ImsStockProduct> imsStockProducts = new ArrayList<>();
        ImsStockProductExample imsStockProductExample = new ImsStockProductExample();
        if (stockNo == null) {
            imsStockProductExample.createCriteria().andStockCodeIsNotNull();
            imsStockProducts = imsStockProductMapper.selectByExample(imsStockProductExample);
        }
        return imsStockProducts;
    }
}
