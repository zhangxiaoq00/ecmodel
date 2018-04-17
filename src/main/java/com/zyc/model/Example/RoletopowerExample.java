package com.zyc.model.Example;

import java.util.ArrayList;
import java.util.List;

public class RoletopowerExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table RoleToPower
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table RoleToPower
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table RoleToPower
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RoleToPower
     *
     * @mbg.generated
     */
    public RoletopowerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RoleToPower
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RoleToPower
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RoleToPower
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RoleToPower
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RoleToPower
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RoleToPower
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RoleToPower
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RoleToPower
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RoleToPower
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RoleToPower
     *
     * @mbg.generated
     */
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

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table RoleToPower
     *
     * @mbg.generated
     */
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

        public Criteria andRtpidIsNull() {
            addCriterion("rtpid is null");
            return (Criteria) this;
        }

        public Criteria andRtpidIsNotNull() {
            addCriterion("rtpid is not null");
            return (Criteria) this;
        }

        public Criteria andRtpidEqualTo(Integer value) {
            addCriterion("rtpid =", value, "rtpid");
            return (Criteria) this;
        }

        public Criteria andRtpidNotEqualTo(Integer value) {
            addCriterion("rtpid <>", value, "rtpid");
            return (Criteria) this;
        }

        public Criteria andRtpidGreaterThan(Integer value) {
            addCriterion("rtpid >", value, "rtpid");
            return (Criteria) this;
        }

        public Criteria andRtpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rtpid >=", value, "rtpid");
            return (Criteria) this;
        }

        public Criteria andRtpidLessThan(Integer value) {
            addCriterion("rtpid <", value, "rtpid");
            return (Criteria) this;
        }

        public Criteria andRtpidLessThanOrEqualTo(Integer value) {
            addCriterion("rtpid <=", value, "rtpid");
            return (Criteria) this;
        }

        public Criteria andRtpidIn(List<Integer> values) {
            addCriterion("rtpid in", values, "rtpid");
            return (Criteria) this;
        }

        public Criteria andRtpidNotIn(List<Integer> values) {
            addCriterion("rtpid not in", values, "rtpid");
            return (Criteria) this;
        }

        public Criteria andRtpidBetween(Integer value1, Integer value2) {
            addCriterion("rtpid between", value1, value2, "rtpid");
            return (Criteria) this;
        }

        public Criteria andRtpidNotBetween(Integer value1, Integer value2) {
            addCriterion("rtpid not between", value1, value2, "rtpid");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNull() {
            addCriterion("roleid is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("roleid is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(Integer value) {
            addCriterion("roleid =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(Integer value) {
            addCriterion("roleid <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(Integer value) {
            addCriterion("roleid >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roleid >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(Integer value) {
            addCriterion("roleid <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(Integer value) {
            addCriterion("roleid <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<Integer> values) {
            addCriterion("roleid in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<Integer> values) {
            addCriterion("roleid not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(Integer value1, Integer value2) {
            addCriterion("roleid between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(Integer value1, Integer value2) {
            addCriterion("roleid not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andPoweridIsNull() {
            addCriterion("powerid is null");
            return (Criteria) this;
        }

        public Criteria andPoweridIsNotNull() {
            addCriterion("powerid is not null");
            return (Criteria) this;
        }

        public Criteria andPoweridEqualTo(Integer value) {
            addCriterion("powerid =", value, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridNotEqualTo(Integer value) {
            addCriterion("powerid <>", value, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridGreaterThan(Integer value) {
            addCriterion("powerid >", value, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridGreaterThanOrEqualTo(Integer value) {
            addCriterion("powerid >=", value, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridLessThan(Integer value) {
            addCriterion("powerid <", value, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridLessThanOrEqualTo(Integer value) {
            addCriterion("powerid <=", value, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridIn(List<Integer> values) {
            addCriterion("powerid in", values, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridNotIn(List<Integer> values) {
            addCriterion("powerid not in", values, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridBetween(Integer value1, Integer value2) {
            addCriterion("powerid between", value1, value2, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridNotBetween(Integer value1, Integer value2) {
            addCriterion("powerid not between", value1, value2, "powerid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table RoleToPower
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table RoleToPower
     *
     * @mbg.generated
     */
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
        public Criterion(){
            super();
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