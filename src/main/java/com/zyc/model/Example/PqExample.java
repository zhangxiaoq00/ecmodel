package com.zyc.model.Example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PqExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PqExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andPqidIsNull() {
            addCriterion("PQid is null");
            return (Criteria) this;
        }

        public Criteria andPqidIsNotNull() {
            addCriterion("PQid is not null");
            return (Criteria) this;
        }

        public Criteria andPqidEqualTo(Integer value) {
            addCriterion("PQid =", value, "pqid");
            return (Criteria) this;
        }

        public Criteria andPqidNotEqualTo(Integer value) {
            addCriterion("PQid <>", value, "pqid");
            return (Criteria) this;
        }

        public Criteria andPqidGreaterThan(Integer value) {
            addCriterion("PQid >", value, "pqid");
            return (Criteria) this;
        }

        public Criteria andPqidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PQid >=", value, "pqid");
            return (Criteria) this;
        }

        public Criteria andPqidLessThan(Integer value) {
            addCriterion("PQid <", value, "pqid");
            return (Criteria) this;
        }

        public Criteria andPqidLessThanOrEqualTo(Integer value) {
            addCriterion("PQid <=", value, "pqid");
            return (Criteria) this;
        }

        public Criteria andPqidIn(List<Integer> values) {
            addCriterion("PQid in", values, "pqid");
            return (Criteria) this;
        }

        public Criteria andPqidNotIn(List<Integer> values) {
            addCriterion("PQid not in", values, "pqid");
            return (Criteria) this;
        }

        public Criteria andPqidBetween(Integer value1, Integer value2) {
            addCriterion("PQid between", value1, value2, "pqid");
            return (Criteria) this;
        }

        public Criteria andPqidNotBetween(Integer value1, Integer value2) {
            addCriterion("PQid not between", value1, value2, "pqid");
            return (Criteria) this;
        }

        public Criteria andPqtextIsNull() {
            addCriterion("PQtext is null");
            return (Criteria) this;
        }

        public Criteria andPqtextIsNotNull() {
            addCriterion("PQtext is not null");
            return (Criteria) this;
        }

        public Criteria andPqtextEqualTo(String value) {
            addCriterion("PQtext =", value, "pqtext");
            return (Criteria) this;
        }

        public Criteria andPqtextNotEqualTo(String value) {
            addCriterion("PQtext <>", value, "pqtext");
            return (Criteria) this;
        }

        public Criteria andPqtextGreaterThan(String value) {
            addCriterion("PQtext >", value, "pqtext");
            return (Criteria) this;
        }

        public Criteria andPqtextGreaterThanOrEqualTo(String value) {
            addCriterion("PQtext >=", value, "pqtext");
            return (Criteria) this;
        }

        public Criteria andPqtextLessThan(String value) {
            addCriterion("PQtext <", value, "pqtext");
            return (Criteria) this;
        }

        public Criteria andPqtextLessThanOrEqualTo(String value) {
            addCriterion("PQtext <=", value, "pqtext");
            return (Criteria) this;
        }

        public Criteria andPqtextLike(String value) {
            addCriterion("PQtext like", value, "pqtext");
            return (Criteria) this;
        }

        public Criteria andPqtextNotLike(String value) {
            addCriterion("PQtext not like", value, "pqtext");
            return (Criteria) this;
        }

        public Criteria andPqtextIn(List<String> values) {
            addCriterion("PQtext in", values, "pqtext");
            return (Criteria) this;
        }

        public Criteria andPqtextNotIn(List<String> values) {
            addCriterion("PQtext not in", values, "pqtext");
            return (Criteria) this;
        }

        public Criteria andPqtextBetween(String value1, String value2) {
            addCriterion("PQtext between", value1, value2, "pqtext");
            return (Criteria) this;
        }

        public Criteria andPqtextNotBetween(String value1, String value2) {
            addCriterion("PQtext not between", value1, value2, "pqtext");
            return (Criteria) this;
        }

        public Criteria andPqanswerIsNull() {
            addCriterion("PQanswer is null");
            return (Criteria) this;
        }

        public Criteria andPqanswerIsNotNull() {
            addCriterion("PQanswer is not null");
            return (Criteria) this;
        }

        public Criteria andPqanswerEqualTo(String value) {
            addCriterion("PQanswer =", value, "pqanswer");
            return (Criteria) this;
        }

        public Criteria andPqanswerNotEqualTo(String value) {
            addCriterion("PQanswer <>", value, "pqanswer");
            return (Criteria) this;
        }

        public Criteria andPqanswerGreaterThan(String value) {
            addCriterion("PQanswer >", value, "pqanswer");
            return (Criteria) this;
        }

        public Criteria andPqanswerGreaterThanOrEqualTo(String value) {
            addCriterion("PQanswer >=", value, "pqanswer");
            return (Criteria) this;
        }

        public Criteria andPqanswerLessThan(String value) {
            addCriterion("PQanswer <", value, "pqanswer");
            return (Criteria) this;
        }

        public Criteria andPqanswerLessThanOrEqualTo(String value) {
            addCriterion("PQanswer <=", value, "pqanswer");
            return (Criteria) this;
        }

        public Criteria andPqanswerLike(String value) {
            addCriterion("PQanswer like", value, "pqanswer");
            return (Criteria) this;
        }

        public Criteria andPqanswerNotLike(String value) {
            addCriterion("PQanswer not like", value, "pqanswer");
            return (Criteria) this;
        }

        public Criteria andPqanswerIn(List<String> values) {
            addCriterion("PQanswer in", values, "pqanswer");
            return (Criteria) this;
        }

        public Criteria andPqanswerNotIn(List<String> values) {
            addCriterion("PQanswer not in", values, "pqanswer");
            return (Criteria) this;
        }

        public Criteria andPqanswerBetween(String value1, String value2) {
            addCriterion("PQanswer between", value1, value2, "pqanswer");
            return (Criteria) this;
        }

        public Criteria andPqanswerNotBetween(String value1, String value2) {
            addCriterion("PQanswer not between", value1, value2, "pqanswer");
            return (Criteria) this;
        }

        public Criteria andPqpathIsNull() {
            addCriterion("PQpath is null");
            return (Criteria) this;
        }

        public Criteria andPqpathIsNotNull() {
            addCriterion("PQpath is not null");
            return (Criteria) this;
        }

        public Criteria andPqpathEqualTo(String value) {
            addCriterion("PQpath =", value, "pqpath");
            return (Criteria) this;
        }

        public Criteria andPqpathNotEqualTo(String value) {
            addCriterion("PQpath <>", value, "pqpath");
            return (Criteria) this;
        }

        public Criteria andPqpathGreaterThan(String value) {
            addCriterion("PQpath >", value, "pqpath");
            return (Criteria) this;
        }

        public Criteria andPqpathGreaterThanOrEqualTo(String value) {
            addCriterion("PQpath >=", value, "pqpath");
            return (Criteria) this;
        }

        public Criteria andPqpathLessThan(String value) {
            addCriterion("PQpath <", value, "pqpath");
            return (Criteria) this;
        }

        public Criteria andPqpathLessThanOrEqualTo(String value) {
            addCriterion("PQpath <=", value, "pqpath");
            return (Criteria) this;
        }

        public Criteria andPqpathLike(String value) {
            addCriterion("PQpath like", value, "pqpath");
            return (Criteria) this;
        }

        public Criteria andPqpathNotLike(String value) {
            addCriterion("PQpath not like", value, "pqpath");
            return (Criteria) this;
        }

        public Criteria andPqpathIn(List<String> values) {
            addCriterion("PQpath in", values, "pqpath");
            return (Criteria) this;
        }

        public Criteria andPqpathNotIn(List<String> values) {
            addCriterion("PQpath not in", values, "pqpath");
            return (Criteria) this;
        }

        public Criteria andPqpathBetween(String value1, String value2) {
            addCriterion("PQpath between", value1, value2, "pqpath");
            return (Criteria) this;
        }

        public Criteria andPqpathNotBetween(String value1, String value2) {
            addCriterion("PQpath not between", value1, value2, "pqpath");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startdate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startdate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("startdate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("startdate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("startdate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("startdate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("startdate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("startdate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("startdate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("startdate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("startdate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("startdate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("enddate not between", value1, value2, "enddate");
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

        public Criterion(){
            super();
        }
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
    public void setOredCriteria(List<Criteria> oredCriteria) {
        this.oredCriteria = oredCriteria;
    }
}