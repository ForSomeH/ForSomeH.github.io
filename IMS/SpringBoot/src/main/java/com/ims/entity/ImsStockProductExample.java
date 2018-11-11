package com.ims.entity;

import java.util.ArrayList;
import java.util.List;

public class ImsStockProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImsStockProductExample() {
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

        public Criteria andImsStockProductIdIsNull() {
            addCriterion("IMS_STOCK_PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andImsStockProductIdIsNotNull() {
            addCriterion("IMS_STOCK_PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andImsStockProductIdEqualTo(Integer value) {
            addCriterion("IMS_STOCK_PRODUCT_ID =", value, "imsStockProductId");
            return (Criteria) this;
        }

        public Criteria andImsStockProductIdNotEqualTo(Integer value) {
            addCriterion("IMS_STOCK_PRODUCT_ID <>", value, "imsStockProductId");
            return (Criteria) this;
        }

        public Criteria andImsStockProductIdGreaterThan(Integer value) {
            addCriterion("IMS_STOCK_PRODUCT_ID >", value, "imsStockProductId");
            return (Criteria) this;
        }

        public Criteria andImsStockProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("IMS_STOCK_PRODUCT_ID >=", value, "imsStockProductId");
            return (Criteria) this;
        }

        public Criteria andImsStockProductIdLessThan(Integer value) {
            addCriterion("IMS_STOCK_PRODUCT_ID <", value, "imsStockProductId");
            return (Criteria) this;
        }

        public Criteria andImsStockProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("IMS_STOCK_PRODUCT_ID <=", value, "imsStockProductId");
            return (Criteria) this;
        }

        public Criteria andImsStockProductIdIn(List<Integer> values) {
            addCriterion("IMS_STOCK_PRODUCT_ID in", values, "imsStockProductId");
            return (Criteria) this;
        }

        public Criteria andImsStockProductIdNotIn(List<Integer> values) {
            addCriterion("IMS_STOCK_PRODUCT_ID not in", values, "imsStockProductId");
            return (Criteria) this;
        }

        public Criteria andImsStockProductIdBetween(Integer value1, Integer value2) {
            addCriterion("IMS_STOCK_PRODUCT_ID between", value1, value2, "imsStockProductId");
            return (Criteria) this;
        }

        public Criteria andImsStockProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("IMS_STOCK_PRODUCT_ID not between", value1, value2, "imsStockProductId");
            return (Criteria) this;
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

        public Criteria andStockCodeIsNull() {
            addCriterion("STOCK_CODE is null");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNotNull() {
            addCriterion("STOCK_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andStockCodeEqualTo(Integer value) {
            addCriterion("STOCK_CODE =", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotEqualTo(Integer value) {
            addCriterion("STOCK_CODE <>", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThan(Integer value) {
            addCriterion("STOCK_CODE >", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("STOCK_CODE >=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThan(Integer value) {
            addCriterion("STOCK_CODE <", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThanOrEqualTo(Integer value) {
            addCriterion("STOCK_CODE <=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeIn(List<Integer> values) {
            addCriterion("STOCK_CODE in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotIn(List<Integer> values) {
            addCriterion("STOCK_CODE not in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_CODE between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_CODE not between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockProductNumIsNull() {
            addCriterion("STOCK_PRODUCT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andStockProductNumIsNotNull() {
            addCriterion("STOCK_PRODUCT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andStockProductNumEqualTo(Integer value) {
            addCriterion("STOCK_PRODUCT_NUM =", value, "stockProductNum");
            return (Criteria) this;
        }

        public Criteria andStockProductNumNotEqualTo(Integer value) {
            addCriterion("STOCK_PRODUCT_NUM <>", value, "stockProductNum");
            return (Criteria) this;
        }

        public Criteria andStockProductNumGreaterThan(Integer value) {
            addCriterion("STOCK_PRODUCT_NUM >", value, "stockProductNum");
            return (Criteria) this;
        }

        public Criteria andStockProductNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("STOCK_PRODUCT_NUM >=", value, "stockProductNum");
            return (Criteria) this;
        }

        public Criteria andStockProductNumLessThan(Integer value) {
            addCriterion("STOCK_PRODUCT_NUM <", value, "stockProductNum");
            return (Criteria) this;
        }

        public Criteria andStockProductNumLessThanOrEqualTo(Integer value) {
            addCriterion("STOCK_PRODUCT_NUM <=", value, "stockProductNum");
            return (Criteria) this;
        }

        public Criteria andStockProductNumIn(List<Integer> values) {
            addCriterion("STOCK_PRODUCT_NUM in", values, "stockProductNum");
            return (Criteria) this;
        }

        public Criteria andStockProductNumNotIn(List<Integer> values) {
            addCriterion("STOCK_PRODUCT_NUM not in", values, "stockProductNum");
            return (Criteria) this;
        }

        public Criteria andStockProductNumBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_PRODUCT_NUM between", value1, value2, "stockProductNum");
            return (Criteria) this;
        }

        public Criteria andStockProductNumNotBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_PRODUCT_NUM not between", value1, value2, "stockProductNum");
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