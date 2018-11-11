package com.ims.entity;

import java.util.ArrayList;
import java.util.List;

public class ImsProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImsProductExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andProductNoIsNull() {
            addCriterion("PRODUCT_NO is null");
            return (Criteria) this;
        }

        public Criteria andProductNoIsNotNull() {
            addCriterion("PRODUCT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andProductNoEqualTo(Integer value) {
            addCriterion("PRODUCT_NO =", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotEqualTo(Integer value) {
            addCriterion("PRODUCT_NO <>", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoGreaterThan(Integer value) {
            addCriterion("PRODUCT_NO >", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_NO >=", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLessThan(Integer value) {
            addCriterion("PRODUCT_NO <", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_NO <=", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoIn(List<Integer> values) {
            addCriterion("PRODUCT_NO in", values, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotIn(List<Integer> values) {
            addCriterion("PRODUCT_NO not in", values, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_NO between", value1, value2, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_NO not between", value1, value2, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("PRODUCT_NAME =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("PRODUCT_NAME <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("PRODUCT_NAME >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("PRODUCT_NAME <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("PRODUCT_NAME like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("PRODUCT_NAME not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("PRODUCT_NAME in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("PRODUCT_NAME not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("PRODUCT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("PRODUCT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(String value) {
            addCriterion("PRODUCT_TYPE =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(String value) {
            addCriterion("PRODUCT_TYPE <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(String value) {
            addCriterion("PRODUCT_TYPE >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TYPE >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(String value) {
            addCriterion("PRODUCT_TYPE <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TYPE <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLike(String value) {
            addCriterion("PRODUCT_TYPE like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotLike(String value) {
            addCriterion("PRODUCT_TYPE not like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<String> values) {
            addCriterion("PRODUCT_TYPE in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<String> values) {
            addCriterion("PRODUCT_TYPE not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(String value1, String value2) {
            addCriterion("PRODUCT_TYPE between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_TYPE not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductAddrIsNull() {
            addCriterion("PRODUCT_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andProductAddrIsNotNull() {
            addCriterion("PRODUCT_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andProductAddrEqualTo(String value) {
            addCriterion("PRODUCT_ADDR =", value, "productAddr");
            return (Criteria) this;
        }

        public Criteria andProductAddrNotEqualTo(String value) {
            addCriterion("PRODUCT_ADDR <>", value, "productAddr");
            return (Criteria) this;
        }

        public Criteria andProductAddrGreaterThan(String value) {
            addCriterion("PRODUCT_ADDR >", value, "productAddr");
            return (Criteria) this;
        }

        public Criteria andProductAddrGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ADDR >=", value, "productAddr");
            return (Criteria) this;
        }

        public Criteria andProductAddrLessThan(String value) {
            addCriterion("PRODUCT_ADDR <", value, "productAddr");
            return (Criteria) this;
        }

        public Criteria andProductAddrLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ADDR <=", value, "productAddr");
            return (Criteria) this;
        }

        public Criteria andProductAddrLike(String value) {
            addCriterion("PRODUCT_ADDR like", value, "productAddr");
            return (Criteria) this;
        }

        public Criteria andProductAddrNotLike(String value) {
            addCriterion("PRODUCT_ADDR not like", value, "productAddr");
            return (Criteria) this;
        }

        public Criteria andProductAddrIn(List<String> values) {
            addCriterion("PRODUCT_ADDR in", values, "productAddr");
            return (Criteria) this;
        }

        public Criteria andProductAddrNotIn(List<String> values) {
            addCriterion("PRODUCT_ADDR not in", values, "productAddr");
            return (Criteria) this;
        }

        public Criteria andProductAddrBetween(String value1, String value2) {
            addCriterion("PRODUCT_ADDR between", value1, value2, "productAddr");
            return (Criteria) this;
        }

        public Criteria andProductAddrNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_ADDR not between", value1, value2, "productAddr");
            return (Criteria) this;
        }

        public Criteria andProductSpecIsNull() {
            addCriterion("PRODUCT_SPEC is null");
            return (Criteria) this;
        }

        public Criteria andProductSpecIsNotNull() {
            addCriterion("PRODUCT_SPEC is not null");
            return (Criteria) this;
        }

        public Criteria andProductSpecEqualTo(String value) {
            addCriterion("PRODUCT_SPEC =", value, "productSpec");
            return (Criteria) this;
        }

        public Criteria andProductSpecNotEqualTo(String value) {
            addCriterion("PRODUCT_SPEC <>", value, "productSpec");
            return (Criteria) this;
        }

        public Criteria andProductSpecGreaterThan(String value) {
            addCriterion("PRODUCT_SPEC >", value, "productSpec");
            return (Criteria) this;
        }

        public Criteria andProductSpecGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SPEC >=", value, "productSpec");
            return (Criteria) this;
        }

        public Criteria andProductSpecLessThan(String value) {
            addCriterion("PRODUCT_SPEC <", value, "productSpec");
            return (Criteria) this;
        }

        public Criteria andProductSpecLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SPEC <=", value, "productSpec");
            return (Criteria) this;
        }

        public Criteria andProductSpecLike(String value) {
            addCriterion("PRODUCT_SPEC like", value, "productSpec");
            return (Criteria) this;
        }

        public Criteria andProductSpecNotLike(String value) {
            addCriterion("PRODUCT_SPEC not like", value, "productSpec");
            return (Criteria) this;
        }

        public Criteria andProductSpecIn(List<String> values) {
            addCriterion("PRODUCT_SPEC in", values, "productSpec");
            return (Criteria) this;
        }

        public Criteria andProductSpecNotIn(List<String> values) {
            addCriterion("PRODUCT_SPEC not in", values, "productSpec");
            return (Criteria) this;
        }

        public Criteria andProductSpecBetween(String value1, String value2) {
            addCriterion("PRODUCT_SPEC between", value1, value2, "productSpec");
            return (Criteria) this;
        }

        public Criteria andProductSpecNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_SPEC not between", value1, value2, "productSpec");
            return (Criteria) this;
        }

        public Criteria andProductGradeIsNull() {
            addCriterion("PRODUCT_GRADE is null");
            return (Criteria) this;
        }

        public Criteria andProductGradeIsNotNull() {
            addCriterion("PRODUCT_GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andProductGradeEqualTo(String value) {
            addCriterion("PRODUCT_GRADE =", value, "productGrade");
            return (Criteria) this;
        }

        public Criteria andProductGradeNotEqualTo(String value) {
            addCriterion("PRODUCT_GRADE <>", value, "productGrade");
            return (Criteria) this;
        }

        public Criteria andProductGradeGreaterThan(String value) {
            addCriterion("PRODUCT_GRADE >", value, "productGrade");
            return (Criteria) this;
        }

        public Criteria andProductGradeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_GRADE >=", value, "productGrade");
            return (Criteria) this;
        }

        public Criteria andProductGradeLessThan(String value) {
            addCriterion("PRODUCT_GRADE <", value, "productGrade");
            return (Criteria) this;
        }

        public Criteria andProductGradeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_GRADE <=", value, "productGrade");
            return (Criteria) this;
        }

        public Criteria andProductGradeLike(String value) {
            addCriterion("PRODUCT_GRADE like", value, "productGrade");
            return (Criteria) this;
        }

        public Criteria andProductGradeNotLike(String value) {
            addCriterion("PRODUCT_GRADE not like", value, "productGrade");
            return (Criteria) this;
        }

        public Criteria andProductGradeIn(List<String> values) {
            addCriterion("PRODUCT_GRADE in", values, "productGrade");
            return (Criteria) this;
        }

        public Criteria andProductGradeNotIn(List<String> values) {
            addCriterion("PRODUCT_GRADE not in", values, "productGrade");
            return (Criteria) this;
        }

        public Criteria andProductGradeBetween(String value1, String value2) {
            addCriterion("PRODUCT_GRADE between", value1, value2, "productGrade");
            return (Criteria) this;
        }

        public Criteria andProductGradeNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_GRADE not between", value1, value2, "productGrade");
            return (Criteria) this;
        }

        public Criteria andProductWeightIsNull() {
            addCriterion("PRODUCT_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andProductWeightIsNotNull() {
            addCriterion("PRODUCT_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andProductWeightEqualTo(String value) {
            addCriterion("PRODUCT_WEIGHT =", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotEqualTo(String value) {
            addCriterion("PRODUCT_WEIGHT <>", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightGreaterThan(String value) {
            addCriterion("PRODUCT_WEIGHT >", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_WEIGHT >=", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightLessThan(String value) {
            addCriterion("PRODUCT_WEIGHT <", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_WEIGHT <=", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightLike(String value) {
            addCriterion("PRODUCT_WEIGHT like", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotLike(String value) {
            addCriterion("PRODUCT_WEIGHT not like", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightIn(List<String> values) {
            addCriterion("PRODUCT_WEIGHT in", values, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotIn(List<String> values) {
            addCriterion("PRODUCT_WEIGHT not in", values, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightBetween(String value1, String value2) {
            addCriterion("PRODUCT_WEIGHT between", value1, value2, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_WEIGHT not between", value1, value2, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductPurcpriceIsNull() {
            addCriterion("PRODUCT_PURCPRICE is null");
            return (Criteria) this;
        }

        public Criteria andProductPurcpriceIsNotNull() {
            addCriterion("PRODUCT_PURCPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andProductPurcpriceEqualTo(String value) {
            addCriterion("PRODUCT_PURCPRICE =", value, "productPurcprice");
            return (Criteria) this;
        }

        public Criteria andProductPurcpriceNotEqualTo(String value) {
            addCriterion("PRODUCT_PURCPRICE <>", value, "productPurcprice");
            return (Criteria) this;
        }

        public Criteria andProductPurcpriceGreaterThan(String value) {
            addCriterion("PRODUCT_PURCPRICE >", value, "productPurcprice");
            return (Criteria) this;
        }

        public Criteria andProductPurcpriceGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PURCPRICE >=", value, "productPurcprice");
            return (Criteria) this;
        }

        public Criteria andProductPurcpriceLessThan(String value) {
            addCriterion("PRODUCT_PURCPRICE <", value, "productPurcprice");
            return (Criteria) this;
        }

        public Criteria andProductPurcpriceLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PURCPRICE <=", value, "productPurcprice");
            return (Criteria) this;
        }

        public Criteria andProductPurcpriceLike(String value) {
            addCriterion("PRODUCT_PURCPRICE like", value, "productPurcprice");
            return (Criteria) this;
        }

        public Criteria andProductPurcpriceNotLike(String value) {
            addCriterion("PRODUCT_PURCPRICE not like", value, "productPurcprice");
            return (Criteria) this;
        }

        public Criteria andProductPurcpriceIn(List<String> values) {
            addCriterion("PRODUCT_PURCPRICE in", values, "productPurcprice");
            return (Criteria) this;
        }

        public Criteria andProductPurcpriceNotIn(List<String> values) {
            addCriterion("PRODUCT_PURCPRICE not in", values, "productPurcprice");
            return (Criteria) this;
        }

        public Criteria andProductPurcpriceBetween(String value1, String value2) {
            addCriterion("PRODUCT_PURCPRICE between", value1, value2, "productPurcprice");
            return (Criteria) this;
        }

        public Criteria andProductPurcpriceNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_PURCPRICE not between", value1, value2, "productPurcprice");
            return (Criteria) this;
        }

        public Criteria andProductUnitIsNull() {
            addCriterion("PRODUCT_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andProductUnitIsNotNull() {
            addCriterion("PRODUCT_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andProductUnitEqualTo(String value) {
            addCriterion("PRODUCT_UNIT =", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotEqualTo(String value) {
            addCriterion("PRODUCT_UNIT <>", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitGreaterThan(String value) {
            addCriterion("PRODUCT_UNIT >", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_UNIT >=", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitLessThan(String value) {
            addCriterion("PRODUCT_UNIT <", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_UNIT <=", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitLike(String value) {
            addCriterion("PRODUCT_UNIT like", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotLike(String value) {
            addCriterion("PRODUCT_UNIT not like", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitIn(List<String> values) {
            addCriterion("PRODUCT_UNIT in", values, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotIn(List<String> values) {
            addCriterion("PRODUCT_UNIT not in", values, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitBetween(String value1, String value2) {
            addCriterion("PRODUCT_UNIT between", value1, value2, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_UNIT not between", value1, value2, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNull() {
            addCriterion("PRODUCT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNotNull() {
            addCriterion("PRODUCT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andProductPriceEqualTo(String value) {
            addCriterion("PRODUCT_PRICE =", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotEqualTo(String value) {
            addCriterion("PRODUCT_PRICE <>", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThan(String value) {
            addCriterion("PRODUCT_PRICE >", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PRICE >=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThan(String value) {
            addCriterion("PRODUCT_PRICE <", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PRICE <=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLike(String value) {
            addCriterion("PRODUCT_PRICE like", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotLike(String value) {
            addCriterion("PRODUCT_PRICE not like", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceIn(List<String> values) {
            addCriterion("PRODUCT_PRICE in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotIn(List<String> values) {
            addCriterion("PRODUCT_PRICE not in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceBetween(String value1, String value2) {
            addCriterion("PRODUCT_PRICE between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_PRICE not between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductManufacturerIsNull() {
            addCriterion("PRODUCT_MANUFACTURER is null");
            return (Criteria) this;
        }

        public Criteria andProductManufacturerIsNotNull() {
            addCriterion("PRODUCT_MANUFACTURER is not null");
            return (Criteria) this;
        }

        public Criteria andProductManufacturerEqualTo(String value) {
            addCriterion("PRODUCT_MANUFACTURER =", value, "productManufacturer");
            return (Criteria) this;
        }

        public Criteria andProductManufacturerNotEqualTo(String value) {
            addCriterion("PRODUCT_MANUFACTURER <>", value, "productManufacturer");
            return (Criteria) this;
        }

        public Criteria andProductManufacturerGreaterThan(String value) {
            addCriterion("PRODUCT_MANUFACTURER >", value, "productManufacturer");
            return (Criteria) this;
        }

        public Criteria andProductManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_MANUFACTURER >=", value, "productManufacturer");
            return (Criteria) this;
        }

        public Criteria andProductManufacturerLessThan(String value) {
            addCriterion("PRODUCT_MANUFACTURER <", value, "productManufacturer");
            return (Criteria) this;
        }

        public Criteria andProductManufacturerLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_MANUFACTURER <=", value, "productManufacturer");
            return (Criteria) this;
        }

        public Criteria andProductManufacturerLike(String value) {
            addCriterion("PRODUCT_MANUFACTURER like", value, "productManufacturer");
            return (Criteria) this;
        }

        public Criteria andProductManufacturerNotLike(String value) {
            addCriterion("PRODUCT_MANUFACTURER not like", value, "productManufacturer");
            return (Criteria) this;
        }

        public Criteria andProductManufacturerIn(List<String> values) {
            addCriterion("PRODUCT_MANUFACTURER in", values, "productManufacturer");
            return (Criteria) this;
        }

        public Criteria andProductManufacturerNotIn(List<String> values) {
            addCriterion("PRODUCT_MANUFACTURER not in", values, "productManufacturer");
            return (Criteria) this;
        }

        public Criteria andProductManufacturerBetween(String value1, String value2) {
            addCriterion("PRODUCT_MANUFACTURER between", value1, value2, "productManufacturer");
            return (Criteria) this;
        }

        public Criteria andProductManufacturerNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_MANUFACTURER not between", value1, value2, "productManufacturer");
            return (Criteria) this;
        }

        public Criteria andProductSumIsNull() {
            addCriterion("PRODUCT_SUM is null");
            return (Criteria) this;
        }

        public Criteria andProductSumIsNotNull() {
            addCriterion("PRODUCT_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andProductSumEqualTo(String value) {
            addCriterion("PRODUCT_SUM =", value, "productSum");
            return (Criteria) this;
        }

        public Criteria andProductSumNotEqualTo(String value) {
            addCriterion("PRODUCT_SUM <>", value, "productSum");
            return (Criteria) this;
        }

        public Criteria andProductSumGreaterThan(String value) {
            addCriterion("PRODUCT_SUM >", value, "productSum");
            return (Criteria) this;
        }

        public Criteria andProductSumGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SUM >=", value, "productSum");
            return (Criteria) this;
        }

        public Criteria andProductSumLessThan(String value) {
            addCriterion("PRODUCT_SUM <", value, "productSum");
            return (Criteria) this;
        }

        public Criteria andProductSumLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SUM <=", value, "productSum");
            return (Criteria) this;
        }

        public Criteria andProductSumLike(String value) {
            addCriterion("PRODUCT_SUM like", value, "productSum");
            return (Criteria) this;
        }

        public Criteria andProductSumNotLike(String value) {
            addCriterion("PRODUCT_SUM not like", value, "productSum");
            return (Criteria) this;
        }

        public Criteria andProductSumIn(List<String> values) {
            addCriterion("PRODUCT_SUM in", values, "productSum");
            return (Criteria) this;
        }

        public Criteria andProductSumNotIn(List<String> values) {
            addCriterion("PRODUCT_SUM not in", values, "productSum");
            return (Criteria) this;
        }

        public Criteria andProductSumBetween(String value1, String value2) {
            addCriterion("PRODUCT_SUM between", value1, value2, "productSum");
            return (Criteria) this;
        }

        public Criteria andProductSumNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_SUM not between", value1, value2, "productSum");
            return (Criteria) this;
        }

        public Criteria andCrateTimeIsNull() {
            addCriterion("CRATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCrateTimeIsNotNull() {
            addCriterion("CRATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCrateTimeEqualTo(String value) {
            addCriterion("CRATE_TIME =", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeNotEqualTo(String value) {
            addCriterion("CRATE_TIME <>", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeGreaterThan(String value) {
            addCriterion("CRATE_TIME >", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CRATE_TIME >=", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeLessThan(String value) {
            addCriterion("CRATE_TIME <", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeLessThanOrEqualTo(String value) {
            addCriterion("CRATE_TIME <=", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeLike(String value) {
            addCriterion("CRATE_TIME like", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeNotLike(String value) {
            addCriterion("CRATE_TIME not like", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeIn(List<String> values) {
            addCriterion("CRATE_TIME in", values, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeNotIn(List<String> values) {
            addCriterion("CRATE_TIME not in", values, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeBetween(String value1, String value2) {
            addCriterion("CRATE_TIME between", value1, value2, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeNotBetween(String value1, String value2) {
            addCriterion("CRATE_TIME not between", value1, value2, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("CREATER is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("CREATER is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("CREATER =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("CREATER <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("CREATER >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("CREATER >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("CREATER <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("CREATER <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("CREATER like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("CREATER not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("CREATER in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("CREATER not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("CREATER between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("CREATER not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andLastModifyerTimeIsNull() {
            addCriterion("LAST_MODIFYER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyerTimeIsNotNull() {
            addCriterion("LAST_MODIFYER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyerTimeEqualTo(String value) {
            addCriterion("LAST_MODIFYER_TIME =", value, "lastModifyerTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyerTimeNotEqualTo(String value) {
            addCriterion("LAST_MODIFYER_TIME <>", value, "lastModifyerTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyerTimeGreaterThan(String value) {
            addCriterion("LAST_MODIFYER_TIME >", value, "lastModifyerTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyerTimeGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_MODIFYER_TIME >=", value, "lastModifyerTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyerTimeLessThan(String value) {
            addCriterion("LAST_MODIFYER_TIME <", value, "lastModifyerTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyerTimeLessThanOrEqualTo(String value) {
            addCriterion("LAST_MODIFYER_TIME <=", value, "lastModifyerTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyerTimeLike(String value) {
            addCriterion("LAST_MODIFYER_TIME like", value, "lastModifyerTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyerTimeNotLike(String value) {
            addCriterion("LAST_MODIFYER_TIME not like", value, "lastModifyerTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyerTimeIn(List<String> values) {
            addCriterion("LAST_MODIFYER_TIME in", values, "lastModifyerTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyerTimeNotIn(List<String> values) {
            addCriterion("LAST_MODIFYER_TIME not in", values, "lastModifyerTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyerTimeBetween(String value1, String value2) {
            addCriterion("LAST_MODIFYER_TIME between", value1, value2, "lastModifyerTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyerTimeNotBetween(String value1, String value2) {
            addCriterion("LAST_MODIFYER_TIME not between", value1, value2, "lastModifyerTime");
            return (Criteria) this;
        }

        public Criteria andLastModifierIsNull() {
            addCriterion("LAST_MODIFIER is null");
            return (Criteria) this;
        }

        public Criteria andLastModifierIsNotNull() {
            addCriterion("LAST_MODIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifierEqualTo(String value) {
            addCriterion("LAST_MODIFIER =", value, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierNotEqualTo(String value) {
            addCriterion("LAST_MODIFIER <>", value, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierGreaterThan(String value) {
            addCriterion("LAST_MODIFIER >", value, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_MODIFIER >=", value, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierLessThan(String value) {
            addCriterion("LAST_MODIFIER <", value, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierLessThanOrEqualTo(String value) {
            addCriterion("LAST_MODIFIER <=", value, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierLike(String value) {
            addCriterion("LAST_MODIFIER like", value, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierNotLike(String value) {
            addCriterion("LAST_MODIFIER not like", value, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierIn(List<String> values) {
            addCriterion("LAST_MODIFIER in", values, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierNotIn(List<String> values) {
            addCriterion("LAST_MODIFIER not in", values, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierBetween(String value1, String value2) {
            addCriterion("LAST_MODIFIER between", value1, value2, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierNotBetween(String value1, String value2) {
            addCriterion("LAST_MODIFIER not between", value1, value2, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("IS_DELETED is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("IS_DELETED is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(String value) {
            addCriterion("IS_DELETED =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(String value) {
            addCriterion("IS_DELETED <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(String value) {
            addCriterion("IS_DELETED >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DELETED >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(String value) {
            addCriterion("IS_DELETED <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(String value) {
            addCriterion("IS_DELETED <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLike(String value) {
            addCriterion("IS_DELETED like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotLike(String value) {
            addCriterion("IS_DELETED not like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<String> values) {
            addCriterion("IS_DELETED in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<String> values) {
            addCriterion("IS_DELETED not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(String value1, String value2) {
            addCriterion("IS_DELETED between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(String value1, String value2) {
            addCriterion("IS_DELETED not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("REMARKS =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("REMARKS <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("REMARKS >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("REMARKS <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("REMARKS <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("REMARKS like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("REMARKS not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("REMARKS in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("REMARKS not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("REMARKS between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("REMARKS not between", value1, value2, "remarks");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}