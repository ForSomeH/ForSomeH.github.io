package com.ims.entity;

import java.util.ArrayList;
import java.util.List;

public class ImsCustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImsCustomerExample() {
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

        public Criteria andCustomerCodeIsNull() {
            addCriterion("CUSTOMER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIsNotNull() {
            addCriterion("CUSTOMER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeEqualTo(Integer value) {
            addCriterion("CUSTOMER_CODE =", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotEqualTo(Integer value) {
            addCriterion("CUSTOMER_CODE <>", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeGreaterThan(Integer value) {
            addCriterion("CUSTOMER_CODE >", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CUSTOMER_CODE >=", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLessThan(Integer value) {
            addCriterion("CUSTOMER_CODE <", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLessThanOrEqualTo(Integer value) {
            addCriterion("CUSTOMER_CODE <=", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIn(List<Integer> values) {
            addCriterion("CUSTOMER_CODE in", values, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotIn(List<Integer> values) {
            addCriterion("CUSTOMER_CODE not in", values, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOMER_CODE between", value1, value2, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOMER_CODE not between", value1, value2, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("CUSTOMER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("CUSTOMER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("CUSTOMER_NAME =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("CUSTOMER_NAME >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("CUSTOMER_NAME <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("CUSTOMER_NAME like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("CUSTOMER_NAME not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("CUSTOMER_NAME in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("CUSTOMER_NAME not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNull() {
            addCriterion("CUSTOMER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNotNull() {
            addCriterion("CUSTOMER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeEqualTo(String value) {
            addCriterion("CUSTOMER_TYPE =", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotEqualTo(String value) {
            addCriterion("CUSTOMER_TYPE <>", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThan(String value) {
            addCriterion("CUSTOMER_TYPE >", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_TYPE >=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThan(String value) {
            addCriterion("CUSTOMER_TYPE <", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_TYPE <=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLike(String value) {
            addCriterion("CUSTOMER_TYPE like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotLike(String value) {
            addCriterion("CUSTOMER_TYPE not like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIn(List<String> values) {
            addCriterion("CUSTOMER_TYPE in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotIn(List<String> values) {
            addCriterion("CUSTOMER_TYPE not in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeBetween(String value1, String value2) {
            addCriterion("CUSTOMER_TYPE between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_TYPE not between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTelIsNull() {
            addCriterion("CUSTOMER_TEL is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTelIsNotNull() {
            addCriterion("CUSTOMER_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTelEqualTo(String value) {
            addCriterion("CUSTOMER_TEL =", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotEqualTo(String value) {
            addCriterion("CUSTOMER_TEL <>", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelGreaterThan(String value) {
            addCriterion("CUSTOMER_TEL >", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_TEL >=", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelLessThan(String value) {
            addCriterion("CUSTOMER_TEL <", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_TEL <=", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelLike(String value) {
            addCriterion("CUSTOMER_TEL like", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotLike(String value) {
            addCriterion("CUSTOMER_TEL not like", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelIn(List<String> values) {
            addCriterion("CUSTOMER_TEL in", values, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotIn(List<String> values) {
            addCriterion("CUSTOMER_TEL not in", values, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelBetween(String value1, String value2) {
            addCriterion("CUSTOMER_TEL between", value1, value2, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_TEL not between", value1, value2, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerAddrIsNull() {
            addCriterion("CUSTOMER_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAddrIsNotNull() {
            addCriterion("CUSTOMER_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAddrEqualTo(String value) {
            addCriterion("CUSTOMER_ADDR =", value, "customerAddr");
            return (Criteria) this;
        }

        public Criteria andCustomerAddrNotEqualTo(String value) {
            addCriterion("CUSTOMER_ADDR <>", value, "customerAddr");
            return (Criteria) this;
        }

        public Criteria andCustomerAddrGreaterThan(String value) {
            addCriterion("CUSTOMER_ADDR >", value, "customerAddr");
            return (Criteria) this;
        }

        public Criteria andCustomerAddrGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ADDR >=", value, "customerAddr");
            return (Criteria) this;
        }

        public Criteria andCustomerAddrLessThan(String value) {
            addCriterion("CUSTOMER_ADDR <", value, "customerAddr");
            return (Criteria) this;
        }

        public Criteria andCustomerAddrLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ADDR <=", value, "customerAddr");
            return (Criteria) this;
        }

        public Criteria andCustomerAddrLike(String value) {
            addCriterion("CUSTOMER_ADDR like", value, "customerAddr");
            return (Criteria) this;
        }

        public Criteria andCustomerAddrNotLike(String value) {
            addCriterion("CUSTOMER_ADDR not like", value, "customerAddr");
            return (Criteria) this;
        }

        public Criteria andCustomerAddrIn(List<String> values) {
            addCriterion("CUSTOMER_ADDR in", values, "customerAddr");
            return (Criteria) this;
        }

        public Criteria andCustomerAddrNotIn(List<String> values) {
            addCriterion("CUSTOMER_ADDR not in", values, "customerAddr");
            return (Criteria) this;
        }

        public Criteria andCustomerAddrBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ADDR between", value1, value2, "customerAddr");
            return (Criteria) this;
        }

        public Criteria andCustomerAddrNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ADDR not between", value1, value2, "customerAddr");
            return (Criteria) this;
        }

        public Criteria andCustomerPayTypeIsNull() {
            addCriterion("CUSTOMER_PAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPayTypeIsNotNull() {
            addCriterion("CUSTOMER_PAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPayTypeEqualTo(String value) {
            addCriterion("CUSTOMER_PAY_TYPE =", value, "customerPayType");
            return (Criteria) this;
        }

        public Criteria andCustomerPayTypeNotEqualTo(String value) {
            addCriterion("CUSTOMER_PAY_TYPE <>", value, "customerPayType");
            return (Criteria) this;
        }

        public Criteria andCustomerPayTypeGreaterThan(String value) {
            addCriterion("CUSTOMER_PAY_TYPE >", value, "customerPayType");
            return (Criteria) this;
        }

        public Criteria andCustomerPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_PAY_TYPE >=", value, "customerPayType");
            return (Criteria) this;
        }

        public Criteria andCustomerPayTypeLessThan(String value) {
            addCriterion("CUSTOMER_PAY_TYPE <", value, "customerPayType");
            return (Criteria) this;
        }

        public Criteria andCustomerPayTypeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_PAY_TYPE <=", value, "customerPayType");
            return (Criteria) this;
        }

        public Criteria andCustomerPayTypeLike(String value) {
            addCriterion("CUSTOMER_PAY_TYPE like", value, "customerPayType");
            return (Criteria) this;
        }

        public Criteria andCustomerPayTypeNotLike(String value) {
            addCriterion("CUSTOMER_PAY_TYPE not like", value, "customerPayType");
            return (Criteria) this;
        }

        public Criteria andCustomerPayTypeIn(List<String> values) {
            addCriterion("CUSTOMER_PAY_TYPE in", values, "customerPayType");
            return (Criteria) this;
        }

        public Criteria andCustomerPayTypeNotIn(List<String> values) {
            addCriterion("CUSTOMER_PAY_TYPE not in", values, "customerPayType");
            return (Criteria) this;
        }

        public Criteria andCustomerPayTypeBetween(String value1, String value2) {
            addCriterion("CUSTOMER_PAY_TYPE between", value1, value2, "customerPayType");
            return (Criteria) this;
        }

        public Criteria andCustomerPayTypeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_PAY_TYPE not between", value1, value2, "customerPayType");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyIsNull() {
            addCriterion("CUSTOMER_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyIsNotNull() {
            addCriterion("CUSTOMER_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyEqualTo(String value) {
            addCriterion("CUSTOMER_COMPANY =", value, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyNotEqualTo(String value) {
            addCriterion("CUSTOMER_COMPANY <>", value, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyGreaterThan(String value) {
            addCriterion("CUSTOMER_COMPANY >", value, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_COMPANY >=", value, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyLessThan(String value) {
            addCriterion("CUSTOMER_COMPANY <", value, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_COMPANY <=", value, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyLike(String value) {
            addCriterion("CUSTOMER_COMPANY like", value, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyNotLike(String value) {
            addCriterion("CUSTOMER_COMPANY not like", value, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyIn(List<String> values) {
            addCriterion("CUSTOMER_COMPANY in", values, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyNotIn(List<String> values) {
            addCriterion("CUSTOMER_COMPANY not in", values, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyBetween(String value1, String value2) {
            addCriterion("CUSTOMER_COMPANY between", value1, value2, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_COMPANY not between", value1, value2, "customerCompany");
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

        public Criteria andOfficeIsNull() {
            addCriterion("OFFICE is null");
            return (Criteria) this;
        }

        public Criteria andOfficeIsNotNull() {
            addCriterion("OFFICE is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeEqualTo(String value) {
            addCriterion("OFFICE =", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeNotEqualTo(String value) {
            addCriterion("OFFICE <>", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeGreaterThan(String value) {
            addCriterion("OFFICE >", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICE >=", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeLessThan(String value) {
            addCriterion("OFFICE <", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeLessThanOrEqualTo(String value) {
            addCriterion("OFFICE <=", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeLike(String value) {
            addCriterion("OFFICE like", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeNotLike(String value) {
            addCriterion("OFFICE not like", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeIn(List<String> values) {
            addCriterion("OFFICE in", values, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeNotIn(List<String> values) {
            addCriterion("OFFICE not in", values, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeBetween(String value1, String value2) {
            addCriterion("OFFICE between", value1, value2, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeNotBetween(String value1, String value2) {
            addCriterion("OFFICE not between", value1, value2, "office");
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