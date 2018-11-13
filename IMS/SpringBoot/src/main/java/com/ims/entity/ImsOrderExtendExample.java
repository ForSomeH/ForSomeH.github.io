package com.ims.entity;

import java.util.ArrayList;
import java.util.List;

public class ImsOrderExtendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImsOrderExtendExample() {
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

        public Criteria andOrderExtendNoIsNull() {
            addCriterion("ORDER_EXTEND_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrderExtendNoIsNotNull() {
            addCriterion("ORDER_EXTEND_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderExtendNoEqualTo(Integer value) {
            addCriterion("ORDER_EXTEND_NO =", value, "orderExtendNo");
            return (Criteria) this;
        }

        public Criteria andOrderExtendNoNotEqualTo(Integer value) {
            addCriterion("ORDER_EXTEND_NO <>", value, "orderExtendNo");
            return (Criteria) this;
        }

        public Criteria andOrderExtendNoGreaterThan(Integer value) {
            addCriterion("ORDER_EXTEND_NO >", value, "orderExtendNo");
            return (Criteria) this;
        }

        public Criteria andOrderExtendNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_EXTEND_NO >=", value, "orderExtendNo");
            return (Criteria) this;
        }

        public Criteria andOrderExtendNoLessThan(Integer value) {
            addCriterion("ORDER_EXTEND_NO <", value, "orderExtendNo");
            return (Criteria) this;
        }

        public Criteria andOrderExtendNoLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_EXTEND_NO <=", value, "orderExtendNo");
            return (Criteria) this;
        }

        public Criteria andOrderExtendNoIn(List<Integer> values) {
            addCriterion("ORDER_EXTEND_NO in", values, "orderExtendNo");
            return (Criteria) this;
        }

        public Criteria andOrderExtendNoNotIn(List<Integer> values) {
            addCriterion("ORDER_EXTEND_NO not in", values, "orderExtendNo");
            return (Criteria) this;
        }

        public Criteria andOrderExtendNoBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_EXTEND_NO between", value1, value2, "orderExtendNo");
            return (Criteria) this;
        }

        public Criteria andOrderExtendNoNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_EXTEND_NO not between", value1, value2, "orderExtendNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(Integer value) {
            addCriterion("ORDER_NO =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(Integer value) {
            addCriterion("ORDER_NO <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(Integer value) {
            addCriterion("ORDER_NO >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_NO >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(Integer value) {
            addCriterion("ORDER_NO <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_NO <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<Integer> values) {
            addCriterion("ORDER_NO in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<Integer> values) {
            addCriterion("ORDER_NO not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_NO between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_NO not between", value1, value2, "orderNo");
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

        public Criteria andProductDoneNumIsNull() {
            addCriterion("PRODUCT_DONE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andProductDoneNumIsNotNull() {
            addCriterion("PRODUCT_DONE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andProductDoneNumEqualTo(Integer value) {
            addCriterion("PRODUCT_DONE_NUM =", value, "productDoneNum");
            return (Criteria) this;
        }

        public Criteria andProductDoneNumNotEqualTo(Integer value) {
            addCriterion("PRODUCT_DONE_NUM <>", value, "productDoneNum");
            return (Criteria) this;
        }

        public Criteria andProductDoneNumGreaterThan(Integer value) {
            addCriterion("PRODUCT_DONE_NUM >", value, "productDoneNum");
            return (Criteria) this;
        }

        public Criteria andProductDoneNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_DONE_NUM >=", value, "productDoneNum");
            return (Criteria) this;
        }

        public Criteria andProductDoneNumLessThan(Integer value) {
            addCriterion("PRODUCT_DONE_NUM <", value, "productDoneNum");
            return (Criteria) this;
        }

        public Criteria andProductDoneNumLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_DONE_NUM <=", value, "productDoneNum");
            return (Criteria) this;
        }

        public Criteria andProductDoneNumIn(List<Integer> values) {
            addCriterion("PRODUCT_DONE_NUM in", values, "productDoneNum");
            return (Criteria) this;
        }

        public Criteria andProductDoneNumNotIn(List<Integer> values) {
            addCriterion("PRODUCT_DONE_NUM not in", values, "productDoneNum");
            return (Criteria) this;
        }

        public Criteria andProductDoneNumBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_DONE_NUM between", value1, value2, "productDoneNum");
            return (Criteria) this;
        }

        public Criteria andProductDoneNumNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_DONE_NUM not between", value1, value2, "productDoneNum");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNull() {
            addCriterion("PRODUCT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNotNull() {
            addCriterion("PRODUCT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andProductNumEqualTo(Integer value) {
            addCriterion("PRODUCT_NUM =", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotEqualTo(Integer value) {
            addCriterion("PRODUCT_NUM <>", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThan(Integer value) {
            addCriterion("PRODUCT_NUM >", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_NUM >=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThan(Integer value) {
            addCriterion("PRODUCT_NUM <", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_NUM <=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumIn(List<Integer> values) {
            addCriterion("PRODUCT_NUM in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotIn(List<Integer> values) {
            addCriterion("PRODUCT_NUM not in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_NUM between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_NUM not between", value1, value2, "productNum");
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