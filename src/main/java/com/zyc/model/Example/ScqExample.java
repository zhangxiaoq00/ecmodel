package com.zyc.model.Example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScqExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ScqExample() {
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

        public Criteria andScqidIsNull() {
            addCriterion("SCQId is null");
            return (Criteria) this;
        }

        public Criteria andScqidIsNotNull() {
            addCriterion("SCQId is not null");
            return (Criteria) this;
        }

        public Criteria andScqidEqualTo(Integer value) {
            addCriterion("SCQId =", value, "scqid");
            return (Criteria) this;
        }

        public Criteria andScqidNotEqualTo(Integer value) {
            addCriterion("SCQId <>", value, "scqid");
            return (Criteria) this;
        }

        public Criteria andScqidGreaterThan(Integer value) {
            addCriterion("SCQId >", value, "scqid");
            return (Criteria) this;
        }

        public Criteria andScqidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SCQId >=", value, "scqid");
            return (Criteria) this;
        }

        public Criteria andScqidLessThan(Integer value) {
            addCriterion("SCQId <", value, "scqid");
            return (Criteria) this;
        }

        public Criteria andScqidLessThanOrEqualTo(Integer value) {
            addCriterion("SCQId <=", value, "scqid");
            return (Criteria) this;
        }

        public Criteria andScqidIn(List<Integer> values) {
            addCriterion("SCQId in", values, "scqid");
            return (Criteria) this;
        }

        public Criteria andScqidNotIn(List<Integer> values) {
            addCriterion("SCQId not in", values, "scqid");
            return (Criteria) this;
        }

        public Criteria andScqidBetween(Integer value1, Integer value2) {
            addCriterion("SCQId between", value1, value2, "scqid");
            return (Criteria) this;
        }

        public Criteria andScqidNotBetween(Integer value1, Integer value2) {
            addCriterion("SCQId not between", value1, value2, "scqid");
            return (Criteria) this;
        }

        public Criteria andScqtextIsNull() {
            addCriterion("SCQText is null");
            return (Criteria) this;
        }

        public Criteria andScqtextIsNotNull() {
            addCriterion("SCQText is not null");
            return (Criteria) this;
        }

        public Criteria andScqtextEqualTo(String value) {
            addCriterion("SCQText =", value, "scqtext");
            return (Criteria) this;
        }

        public Criteria andScqtextNotEqualTo(String value) {
            addCriterion("SCQText <>", value, "scqtext");
            return (Criteria) this;
        }

        public Criteria andScqtextGreaterThan(String value) {
            addCriterion("SCQText >", value, "scqtext");
            return (Criteria) this;
        }

        public Criteria andScqtextGreaterThanOrEqualTo(String value) {
            addCriterion("SCQText >=", value, "scqtext");
            return (Criteria) this;
        }

        public Criteria andScqtextLessThan(String value) {
            addCriterion("SCQText <", value, "scqtext");
            return (Criteria) this;
        }

        public Criteria andScqtextLessThanOrEqualTo(String value) {
            addCriterion("SCQText <=", value, "scqtext");
            return (Criteria) this;
        }

        public Criteria andScqtextLike(String value) {
            addCriterion("SCQText like", value, "scqtext");
            return (Criteria) this;
        }

        public Criteria andScqtextNotLike(String value) {
            addCriterion("SCQText not like", value, "scqtext");
            return (Criteria) this;
        }

        public Criteria andScqtextIn(List<String> values) {
            addCriterion("SCQText in", values, "scqtext");
            return (Criteria) this;
        }

        public Criteria andScqtextNotIn(List<String> values) {
            addCriterion("SCQText not in", values, "scqtext");
            return (Criteria) this;
        }

        public Criteria andScqtextBetween(String value1, String value2) {
            addCriterion("SCQText between", value1, value2, "scqtext");
            return (Criteria) this;
        }

        public Criteria andScqtextNotBetween(String value1, String value2) {
            addCriterion("SCQText not between", value1, value2, "scqtext");
            return (Criteria) this;
        }

        public Criteria andAnsweraIsNull() {
            addCriterion("AnswerA is null");
            return (Criteria) this;
        }

        public Criteria andAnsweraIsNotNull() {
            addCriterion("AnswerA is not null");
            return (Criteria) this;
        }

        public Criteria andAnsweraEqualTo(String value) {
            addCriterion("AnswerA =", value, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraNotEqualTo(String value) {
            addCriterion("AnswerA <>", value, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraGreaterThan(String value) {
            addCriterion("AnswerA >", value, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraGreaterThanOrEqualTo(String value) {
            addCriterion("AnswerA >=", value, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraLessThan(String value) {
            addCriterion("AnswerA <", value, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraLessThanOrEqualTo(String value) {
            addCriterion("AnswerA <=", value, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraLike(String value) {
            addCriterion("AnswerA like", value, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraNotLike(String value) {
            addCriterion("AnswerA not like", value, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraIn(List<String> values) {
            addCriterion("AnswerA in", values, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraNotIn(List<String> values) {
            addCriterion("AnswerA not in", values, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraBetween(String value1, String value2) {
            addCriterion("AnswerA between", value1, value2, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraNotBetween(String value1, String value2) {
            addCriterion("AnswerA not between", value1, value2, "answera");
            return (Criteria) this;
        }

        public Criteria andAnswerbIsNull() {
            addCriterion("AnswerB is null");
            return (Criteria) this;
        }

        public Criteria andAnswerbIsNotNull() {
            addCriterion("AnswerB is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerbEqualTo(String value) {
            addCriterion("AnswerB =", value, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbNotEqualTo(String value) {
            addCriterion("AnswerB <>", value, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbGreaterThan(String value) {
            addCriterion("AnswerB >", value, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbGreaterThanOrEqualTo(String value) {
            addCriterion("AnswerB >=", value, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbLessThan(String value) {
            addCriterion("AnswerB <", value, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbLessThanOrEqualTo(String value) {
            addCriterion("AnswerB <=", value, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbLike(String value) {
            addCriterion("AnswerB like", value, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbNotLike(String value) {
            addCriterion("AnswerB not like", value, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbIn(List<String> values) {
            addCriterion("AnswerB in", values, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbNotIn(List<String> values) {
            addCriterion("AnswerB not in", values, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbBetween(String value1, String value2) {
            addCriterion("AnswerB between", value1, value2, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbNotBetween(String value1, String value2) {
            addCriterion("AnswerB not between", value1, value2, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswercIsNull() {
            addCriterion("AnswerC is null");
            return (Criteria) this;
        }

        public Criteria andAnswercIsNotNull() {
            addCriterion("AnswerC is not null");
            return (Criteria) this;
        }

        public Criteria andAnswercEqualTo(String value) {
            addCriterion("AnswerC =", value, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercNotEqualTo(String value) {
            addCriterion("AnswerC <>", value, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercGreaterThan(String value) {
            addCriterion("AnswerC >", value, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercGreaterThanOrEqualTo(String value) {
            addCriterion("AnswerC >=", value, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercLessThan(String value) {
            addCriterion("AnswerC <", value, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercLessThanOrEqualTo(String value) {
            addCriterion("AnswerC <=", value, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercLike(String value) {
            addCriterion("AnswerC like", value, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercNotLike(String value) {
            addCriterion("AnswerC not like", value, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercIn(List<String> values) {
            addCriterion("AnswerC in", values, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercNotIn(List<String> values) {
            addCriterion("AnswerC not in", values, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercBetween(String value1, String value2) {
            addCriterion("AnswerC between", value1, value2, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercNotBetween(String value1, String value2) {
            addCriterion("AnswerC not between", value1, value2, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswerdIsNull() {
            addCriterion("AnswerD is null");
            return (Criteria) this;
        }

        public Criteria andAnswerdIsNotNull() {
            addCriterion("AnswerD is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerdEqualTo(String value) {
            addCriterion("AnswerD =", value, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdNotEqualTo(String value) {
            addCriterion("AnswerD <>", value, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdGreaterThan(String value) {
            addCriterion("AnswerD >", value, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdGreaterThanOrEqualTo(String value) {
            addCriterion("AnswerD >=", value, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdLessThan(String value) {
            addCriterion("AnswerD <", value, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdLessThanOrEqualTo(String value) {
            addCriterion("AnswerD <=", value, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdLike(String value) {
            addCriterion("AnswerD like", value, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdNotLike(String value) {
            addCriterion("AnswerD not like", value, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdIn(List<String> values) {
            addCriterion("AnswerD in", values, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdNotIn(List<String> values) {
            addCriterion("AnswerD not in", values, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdBetween(String value1, String value2) {
            addCriterion("AnswerD between", value1, value2, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdNotBetween(String value1, String value2) {
            addCriterion("AnswerD not between", value1, value2, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("Answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("Answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("Answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("Answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("Answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("Answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("Answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("Answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("Answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("Answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("Answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("Answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("Answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("Answer not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("StartDate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("StartDate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("StartDate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("StartDate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("StartDate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("StartDate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("StartDate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("StartDate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("StartDate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("StartDate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("StartDate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("StartDate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("EndDate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("EndDate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("EndDate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("EndDate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("EndDate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("EndDate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("EndDate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("EndDate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("EndDate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("EndDate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("EndDate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("EndDate not between", value1, value2, "enddate");
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