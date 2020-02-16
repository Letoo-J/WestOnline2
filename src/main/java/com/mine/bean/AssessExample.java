package com.mine.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssessExample() {
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

        public Criteria andAssesIdIsNull() {
            addCriterion("asses_id is null");
            return (Criteria) this;
        }

        public Criteria andAssesIdIsNotNull() {
            addCriterion("asses_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssesIdEqualTo(Integer value) {
            addCriterion("asses_id =", value, "assesId");
            return (Criteria) this;
        }

        public Criteria andAssesIdNotEqualTo(Integer value) {
            addCriterion("asses_id <>", value, "assesId");
            return (Criteria) this;
        }

        public Criteria andAssesIdGreaterThan(Integer value) {
            addCriterion("asses_id >", value, "assesId");
            return (Criteria) this;
        }

        public Criteria andAssesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("asses_id >=", value, "assesId");
            return (Criteria) this;
        }

        public Criteria andAssesIdLessThan(Integer value) {
            addCriterion("asses_id <", value, "assesId");
            return (Criteria) this;
        }

        public Criteria andAssesIdLessThanOrEqualTo(Integer value) {
            addCriterion("asses_id <=", value, "assesId");
            return (Criteria) this;
        }

        public Criteria andAssesIdIn(List<Integer> values) {
            addCriterion("asses_id in", values, "assesId");
            return (Criteria) this;
        }

        public Criteria andAssesIdNotIn(List<Integer> values) {
            addCriterion("asses_id not in", values, "assesId");
            return (Criteria) this;
        }

        public Criteria andAssesIdBetween(Integer value1, Integer value2) {
            addCriterion("asses_id between", value1, value2, "assesId");
            return (Criteria) this;
        }

        public Criteria andAssesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("asses_id not between", value1, value2, "assesId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andShowdateIsNull() {
            addCriterion("showDate is null");
            return (Criteria) this;
        }

        public Criteria andShowdateIsNotNull() {
            addCriterion("showDate is not null");
            return (Criteria) this;
        }

        public Criteria andShowdateEqualTo(Date value) {
            addCriterion("showDate =", value, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateNotEqualTo(Date value) {
            addCriterion("showDate <>", value, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateGreaterThan(Date value) {
            addCriterion("showDate >", value, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateGreaterThanOrEqualTo(Date value) {
            addCriterion("showDate >=", value, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateLessThan(Date value) {
            addCriterion("showDate <", value, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateLessThanOrEqualTo(Date value) {
            addCriterion("showDate <=", value, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateIn(List<Date> values) {
            addCriterion("showDate in", values, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateNotIn(List<Date> values) {
            addCriterion("showDate not in", values, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateBetween(Date value1, Date value2) {
            addCriterion("showDate between", value1, value2, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateNotBetween(Date value1, Date value2) {
            addCriterion("showDate not between", value1, value2, "showdate");
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

        public Criteria andDeadlineIsNull() {
            addCriterion("deadline is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("deadline is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(Date value) {
            addCriterion("deadline =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(Date value) {
            addCriterion("deadline <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(Date value) {
            addCriterion("deadline >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("deadline >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(Date value) {
            addCriterion("deadline <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("deadline <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<Date> values) {
            addCriterion("deadline in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<Date> values) {
            addCriterion("deadline not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(Date value1, Date value2) {
            addCriterion("deadline between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("deadline not between", value1, value2, "deadline");
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