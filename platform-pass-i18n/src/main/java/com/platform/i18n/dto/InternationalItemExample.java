package com.platform.i18n.dto;

import java.util.ArrayList;
import java.util.List;

public class InternationalItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InternationalItemExample() {
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

        public Criteria andTranslationIdIsNull() {
            addCriterion("TRANSLATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andTranslationIdIsNotNull() {
            addCriterion("TRANSLATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTranslationIdEqualTo(String value) {
            addCriterion("TRANSLATION_ID =", value, "translationId");
            return (Criteria) this;
        }

        public Criteria andTranslationIdNotEqualTo(String value) {
            addCriterion("TRANSLATION_ID <>", value, "translationId");
            return (Criteria) this;
        }

        public Criteria andTranslationIdGreaterThan(String value) {
            addCriterion("TRANSLATION_ID >", value, "translationId");
            return (Criteria) this;
        }

        public Criteria andTranslationIdGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSLATION_ID >=", value, "translationId");
            return (Criteria) this;
        }

        public Criteria andTranslationIdLessThan(String value) {
            addCriterion("TRANSLATION_ID <", value, "translationId");
            return (Criteria) this;
        }

        public Criteria andTranslationIdLessThanOrEqualTo(String value) {
            addCriterion("TRANSLATION_ID <=", value, "translationId");
            return (Criteria) this;
        }

        public Criteria andTranslationIdLike(String value) {
            addCriterion("TRANSLATION_ID like", value, "translationId");
            return (Criteria) this;
        }

        public Criteria andTranslationIdNotLike(String value) {
            addCriterion("TRANSLATION_ID not like", value, "translationId");
            return (Criteria) this;
        }

        public Criteria andTranslationIdIn(List<String> values) {
            addCriterion("TRANSLATION_ID in", values, "translationId");
            return (Criteria) this;
        }

        public Criteria andTranslationIdNotIn(List<String> values) {
            addCriterion("TRANSLATION_ID not in", values, "translationId");
            return (Criteria) this;
        }

        public Criteria andTranslationIdBetween(String value1, String value2) {
            addCriterion("TRANSLATION_ID between", value1, value2, "translationId");
            return (Criteria) this;
        }

        public Criteria andTranslationIdNotBetween(String value1, String value2) {
            addCriterion("TRANSLATION_ID not between", value1, value2, "translationId");
            return (Criteria) this;
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

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNull() {
            addCriterion("COUNTRY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("COUNTRY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("COUNTRY_CODE =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("COUNTRY_CODE <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("COUNTRY_CODE >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY_CODE >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("COUNTRY_CODE <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY_CODE <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("COUNTRY_CODE like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("COUNTRY_CODE not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("COUNTRY_CODE in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("COUNTRY_CODE not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("COUNTRY_CODE between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("COUNTRY_CODE not between", value1, value2, "countryCode");
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