package com.mine.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssignmentlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssignmentlistExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andSubIdIsNull() {
            addCriterion("sub_id is null");
            return (Criteria) this;
        }

        public Criteria andSubIdIsNotNull() {
            addCriterion("sub_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubIdEqualTo(Integer value) {
            addCriterion("sub_id =", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdNotEqualTo(Integer value) {
            addCriterion("sub_id <>", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdGreaterThan(Integer value) {
            addCriterion("sub_id >", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_id >=", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdLessThan(Integer value) {
            addCriterion("sub_id <", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdLessThanOrEqualTo(Integer value) {
            addCriterion("sub_id <=", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdIn(List<Integer> values) {
            addCriterion("sub_id in", values, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdNotIn(List<Integer> values) {
            addCriterion("sub_id not in", values, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdBetween(Integer value1, Integer value2) {
            addCriterion("sub_id between", value1, value2, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_id not between", value1, value2, "subId");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sID is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sID is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(String value) {
            addCriterion("sID =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(String value) {
            addCriterion("sID <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(String value) {
            addCriterion("sID >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(String value) {
            addCriterion("sID >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(String value) {
            addCriterion("sID <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(String value) {
            addCriterion("sID <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLike(String value) {
            addCriterion("sID like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotLike(String value) {
            addCriterion("sID not like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<String> values) {
            addCriterion("sID in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<String> values) {
            addCriterion("sID not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(String value1, String value2) {
            addCriterion("sID between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(String value1, String value2) {
            addCriterion("sID not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sName is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sName is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sName =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sName <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sName >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sName >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sName <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sName <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sName like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sName not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sName in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sName not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sName between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sName not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSubdateIsNull() {
            addCriterion("subDate is null");
            return (Criteria) this;
        }

        public Criteria andSubdateIsNotNull() {
            addCriterion("subDate is not null");
            return (Criteria) this;
        }

        public Criteria andSubdateEqualTo(Date value) {
            addCriterion("subDate =", value, "subdate");
            return (Criteria) this;
        }

        public Criteria andSubdateNotEqualTo(Date value) {
            addCriterion("subDate <>", value, "subdate");
            return (Criteria) this;
        }

        public Criteria andSubdateGreaterThan(Date value) {
            addCriterion("subDate >", value, "subdate");
            return (Criteria) this;
        }

        public Criteria andSubdateGreaterThanOrEqualTo(Date value) {
            addCriterion("subDate >=", value, "subdate");
            return (Criteria) this;
        }

        public Criteria andSubdateLessThan(Date value) {
            addCriterion("subDate <", value, "subdate");
            return (Criteria) this;
        }

        public Criteria andSubdateLessThanOrEqualTo(Date value) {
            addCriterion("subDate <=", value, "subdate");
            return (Criteria) this;
        }

        public Criteria andSubdateIn(List<Date> values) {
            addCriterion("subDate in", values, "subdate");
            return (Criteria) this;
        }

        public Criteria andSubdateNotIn(List<Date> values) {
            addCriterion("subDate not in", values, "subdate");
            return (Criteria) this;
        }

        public Criteria andSubdateBetween(Date value1, Date value2) {
            addCriterion("subDate between", value1, value2, "subdate");
            return (Criteria) this;
        }

        public Criteria andSubdateNotBetween(Date value1, Date value2) {
            addCriterion("subDate not between", value1, value2, "subdate");
            return (Criteria) this;
        }

        public Criteria andIdencodeIsNull() {
            addCriterion("idenCode is null");
            return (Criteria) this;
        }

        public Criteria andIdencodeIsNotNull() {
            addCriterion("idenCode is not null");
            return (Criteria) this;
        }

        public Criteria andIdencodeEqualTo(String value) {
            addCriterion("idenCode =", value, "idencode");
            return (Criteria) this;
        }

        public Criteria andIdencodeNotEqualTo(String value) {
            addCriterion("idenCode <>", value, "idencode");
            return (Criteria) this;
        }

        public Criteria andIdencodeGreaterThan(String value) {
            addCriterion("idenCode >", value, "idencode");
            return (Criteria) this;
        }

        public Criteria andIdencodeGreaterThanOrEqualTo(String value) {
            addCriterion("idenCode >=", value, "idencode");
            return (Criteria) this;
        }

        public Criteria andIdencodeLessThan(String value) {
            addCriterion("idenCode <", value, "idencode");
            return (Criteria) this;
        }

        public Criteria andIdencodeLessThanOrEqualTo(String value) {
            addCriterion("idenCode <=", value, "idencode");
            return (Criteria) this;
        }

        public Criteria andIdencodeLike(String value) {
            addCriterion("idenCode like", value, "idencode");
            return (Criteria) this;
        }

        public Criteria andIdencodeNotLike(String value) {
            addCriterion("idenCode not like", value, "idencode");
            return (Criteria) this;
        }

        public Criteria andIdencodeIn(List<String> values) {
            addCriterion("idenCode in", values, "idencode");
            return (Criteria) this;
        }

        public Criteria andIdencodeNotIn(List<String> values) {
            addCriterion("idenCode not in", values, "idencode");
            return (Criteria) this;
        }

        public Criteria andIdencodeBetween(String value1, String value2) {
            addCriterion("idenCode between", value1, value2, "idencode");
            return (Criteria) this;
        }

        public Criteria andIdencodeNotBetween(String value1, String value2) {
            addCriterion("idenCode not between", value1, value2, "idencode");
            return (Criteria) this;
        }

        public Criteria andDocumentIsNull() {
            addCriterion("document is null");
            return (Criteria) this;
        }

        public Criteria andDocumentIsNotNull() {
            addCriterion("document is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentEqualTo(String value) {
            addCriterion("document =", value, "document");
            return (Criteria) this;
        }

        public Criteria andDocumentNotEqualTo(String value) {
            addCriterion("document <>", value, "document");
            return (Criteria) this;
        }

        public Criteria andDocumentGreaterThan(String value) {
            addCriterion("document >", value, "document");
            return (Criteria) this;
        }

        public Criteria andDocumentGreaterThanOrEqualTo(String value) {
            addCriterion("document >=", value, "document");
            return (Criteria) this;
        }

        public Criteria andDocumentLessThan(String value) {
            addCriterion("document <", value, "document");
            return (Criteria) this;
        }

        public Criteria andDocumentLessThanOrEqualTo(String value) {
            addCriterion("document <=", value, "document");
            return (Criteria) this;
        }

        public Criteria andDocumentLike(String value) {
            addCriterion("document like", value, "document");
            return (Criteria) this;
        }

        public Criteria andDocumentNotLike(String value) {
            addCriterion("document not like", value, "document");
            return (Criteria) this;
        }

        public Criteria andDocumentIn(List<String> values) {
            addCriterion("document in", values, "document");
            return (Criteria) this;
        }

        public Criteria andDocumentNotIn(List<String> values) {
            addCriterion("document not in", values, "document");
            return (Criteria) this;
        }

        public Criteria andDocumentBetween(String value1, String value2) {
            addCriterion("document between", value1, value2, "document");
            return (Criteria) this;
        }

        public Criteria andDocumentNotBetween(String value1, String value2) {
            addCriterion("document not between", value1, value2, "document");
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