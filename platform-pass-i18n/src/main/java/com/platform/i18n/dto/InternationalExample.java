package com.platform.i18n.dto;

import java.util.ArrayList;
import java.util.List;

public class InternationalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InternationalExample() {
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

        public Criteria andInternationalIdIsNull() {
            addCriterion("INTERNATIONAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andInternationalIdIsNotNull() {
            addCriterion("INTERNATIONAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInternationalIdEqualTo(String value) {
            addCriterion("INTERNATIONAL_ID =", value, "internationalId");
            return (Criteria) this;
        }

        public Criteria andInternationalIdNotEqualTo(String value) {
            addCriterion("INTERNATIONAL_ID <>", value, "internationalId");
            return (Criteria) this;
        }

        public Criteria andInternationalIdGreaterThan(String value) {
            addCriterion("INTERNATIONAL_ID >", value, "internationalId");
            return (Criteria) this;
        }

        public Criteria andInternationalIdGreaterThanOrEqualTo(String value) {
            addCriterion("INTERNATIONAL_ID >=", value, "internationalId");
            return (Criteria) this;
        }

        public Criteria andInternationalIdLessThan(String value) {
            addCriterion("INTERNATIONAL_ID <", value, "internationalId");
            return (Criteria) this;
        }

        public Criteria andInternationalIdLessThanOrEqualTo(String value) {
            addCriterion("INTERNATIONAL_ID <=", value, "internationalId");
            return (Criteria) this;
        }

        public Criteria andInternationalIdLike(String value) {
            addCriterion("INTERNATIONAL_ID like", value, "internationalId");
            return (Criteria) this;
        }

        public Criteria andInternationalIdNotLike(String value) {
            addCriterion("INTERNATIONAL_ID not like", value, "internationalId");
            return (Criteria) this;
        }

        public Criteria andInternationalIdIn(List<String> values) {
            addCriterion("INTERNATIONAL_ID in", values, "internationalId");
            return (Criteria) this;
        }

        public Criteria andInternationalIdNotIn(List<String> values) {
            addCriterion("INTERNATIONAL_ID not in", values, "internationalId");
            return (Criteria) this;
        }

        public Criteria andInternationalIdBetween(String value1, String value2) {
            addCriterion("INTERNATIONAL_ID between", value1, value2, "internationalId");
            return (Criteria) this;
        }

        public Criteria andInternationalIdNotBetween(String value1, String value2) {
            addCriterion("INTERNATIONAL_ID not between", value1, value2, "internationalId");
            return (Criteria) this;
        }

        public Criteria andInternationalKeyIsNull() {
            addCriterion("INTERNATIONAL_KEY is null");
            return (Criteria) this;
        }

        public Criteria andInternationalKeyIsNotNull() {
            addCriterion("INTERNATIONAL_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andInternationalKeyEqualTo(String value) {
            addCriterion("INTERNATIONAL_KEY =", value, "internationalKey");
            return (Criteria) this;
        }

        public Criteria andInternationalKeyNotEqualTo(String value) {
            addCriterion("INTERNATIONAL_KEY <>", value, "internationalKey");
            return (Criteria) this;
        }

        public Criteria andInternationalKeyGreaterThan(String value) {
            addCriterion("INTERNATIONAL_KEY >", value, "internationalKey");
            return (Criteria) this;
        }

        public Criteria andInternationalKeyGreaterThanOrEqualTo(String value) {
            addCriterion("INTERNATIONAL_KEY >=", value, "internationalKey");
            return (Criteria) this;
        }

        public Criteria andInternationalKeyLessThan(String value) {
            addCriterion("INTERNATIONAL_KEY <", value, "internationalKey");
            return (Criteria) this;
        }

        public Criteria andInternationalKeyLessThanOrEqualTo(String value) {
            addCriterion("INTERNATIONAL_KEY <=", value, "internationalKey");
            return (Criteria) this;
        }

        public Criteria andInternationalKeyLike(String value) {
            addCriterion("INTERNATIONAL_KEY like", value, "internationalKey");
            return (Criteria) this;
        }

        public Criteria andInternationalKeyNotLike(String value) {
            addCriterion("INTERNATIONAL_KEY not like", value, "internationalKey");
            return (Criteria) this;
        }

        public Criteria andInternationalKeyIn(List<String> values) {
            addCriterion("INTERNATIONAL_KEY in", values, "internationalKey");
            return (Criteria) this;
        }

        public Criteria andInternationalKeyNotIn(List<String> values) {
            addCriterion("INTERNATIONAL_KEY not in", values, "internationalKey");
            return (Criteria) this;
        }

        public Criteria andInternationalKeyBetween(String value1, String value2) {
            addCriterion("INTERNATIONAL_KEY between", value1, value2, "internationalKey");
            return (Criteria) this;
        }

        public Criteria andInternationalKeyNotBetween(String value1, String value2) {
            addCriterion("INTERNATIONAL_KEY not between", value1, value2, "internationalKey");
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

        public Criteria andModuleIsNull() {
            addCriterion("MODULE is null");
            return (Criteria) this;
        }

        public Criteria andModuleIsNotNull() {
            addCriterion("MODULE is not null");
            return (Criteria) this;
        }

        public Criteria andModuleEqualTo(String value) {
            addCriterion("MODULE =", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotEqualTo(String value) {
            addCriterion("MODULE <>", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThan(String value) {
            addCriterion("MODULE >", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE >=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThan(String value) {
            addCriterion("MODULE <", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThanOrEqualTo(String value) {
            addCriterion("MODULE <=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLike(String value) {
            addCriterion("MODULE like", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotLike(String value) {
            addCriterion("MODULE not like", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleIn(List<String> values) {
            addCriterion("MODULE in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotIn(List<String> values) {
            addCriterion("MODULE not in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleBetween(String value1, String value2) {
            addCriterion("MODULE between", value1, value2, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotBetween(String value1, String value2) {
            addCriterion("MODULE not between", value1, value2, "module");
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