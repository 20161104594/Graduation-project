package com.autolight.entity;

import java.util.ArrayList;
import java.util.List;

public class DianlustatusExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_dianlustatus
     *
     * @mbg.generated Wed Mar 18 21:18:20 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_dianlustatus
     *
     * @mbg.generated Wed Mar 18 21:18:20 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_dianlustatus
     *
     * @mbg.generated Wed Mar 18 21:18:20 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dianlustatus
     *
     * @mbg.generated Wed Mar 18 21:18:20 CST 2020
     */
    public DianlustatusExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dianlustatus
     *
     * @mbg.generated Wed Mar 18 21:18:20 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dianlustatus
     *
     * @mbg.generated Wed Mar 18 21:18:20 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dianlustatus
     *
     * @mbg.generated Wed Mar 18 21:18:20 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dianlustatus
     *
     * @mbg.generated Wed Mar 18 21:18:20 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dianlustatus
     *
     * @mbg.generated Wed Mar 18 21:18:20 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dianlustatus
     *
     * @mbg.generated Wed Mar 18 21:18:20 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dianlustatus
     *
     * @mbg.generated Wed Mar 18 21:18:20 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dianlustatus
     *
     * @mbg.generated Wed Mar 18 21:18:20 CST 2020
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
     * This method corresponds to the database table tb_dianlustatus
     *
     * @mbg.generated Wed Mar 18 21:18:20 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dianlustatus
     *
     * @mbg.generated Wed Mar 18 21:18:20 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_dianlustatus
     *
     * @mbg.generated Wed Mar 18 21:18:20 CST 2020
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

        public Criteria andDianlutype_idIsNull() {
            addCriterion("dianlutype_id is null");
            return (Criteria) this;
        }

        public Criteria andDianlutype_idIsNotNull() {
            addCriterion("dianlutype_id is not null");
            return (Criteria) this;
        }

        public Criteria andDianlutype_idEqualTo(Integer value) {
            addCriterion("dianlutype_id =", value, "dianlutype_id");
            return (Criteria) this;
        }

        public Criteria andDianlutype_idNotEqualTo(Integer value) {
            addCriterion("dianlutype_id <>", value, "dianlutype_id");
            return (Criteria) this;
        }

        public Criteria andDianlutype_idGreaterThan(Integer value) {
            addCriterion("dianlutype_id >", value, "dianlutype_id");
            return (Criteria) this;
        }

        public Criteria andDianlutype_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("dianlutype_id >=", value, "dianlutype_id");
            return (Criteria) this;
        }

        public Criteria andDianlutype_idLessThan(Integer value) {
            addCriterion("dianlutype_id <", value, "dianlutype_id");
            return (Criteria) this;
        }

        public Criteria andDianlutype_idLessThanOrEqualTo(Integer value) {
            addCriterion("dianlutype_id <=", value, "dianlutype_id");
            return (Criteria) this;
        }

        public Criteria andDianlutype_idIn(List<Integer> values) {
            addCriterion("dianlutype_id in", values, "dianlutype_id");
            return (Criteria) this;
        }

        public Criteria andDianlutype_idNotIn(List<Integer> values) {
            addCriterion("dianlutype_id not in", values, "dianlutype_id");
            return (Criteria) this;
        }

        public Criteria andDianlutype_idBetween(Integer value1, Integer value2) {
            addCriterion("dianlutype_id between", value1, value2, "dianlutype_id");
            return (Criteria) this;
        }

        public Criteria andDianlutype_idNotBetween(Integer value1, Integer value2) {
            addCriterion("dianlutype_id not between", value1, value2, "dianlutype_id");
            return (Criteria) this;
        }

        public Criteria andDianlustatus_idIsNull() {
            addCriterion("dianlustatus_id is null");
            return (Criteria) this;
        }

        public Criteria andDianlustatus_idIsNotNull() {
            addCriterion("dianlustatus_id is not null");
            return (Criteria) this;
        }

        public Criteria andDianlustatus_idEqualTo(Integer value) {
            addCriterion("dianlustatus_id =", value, "dianlustatus_id");
            return (Criteria) this;
        }

        public Criteria andDianlustatus_idNotEqualTo(Integer value) {
            addCriterion("dianlustatus_id <>", value, "dianlustatus_id");
            return (Criteria) this;
        }

        public Criteria andDianlustatus_idGreaterThan(Integer value) {
            addCriterion("dianlustatus_id >", value, "dianlustatus_id");
            return (Criteria) this;
        }

        public Criteria andDianlustatus_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("dianlustatus_id >=", value, "dianlustatus_id");
            return (Criteria) this;
        }

        public Criteria andDianlustatus_idLessThan(Integer value) {
            addCriterion("dianlustatus_id <", value, "dianlustatus_id");
            return (Criteria) this;
        }

        public Criteria andDianlustatus_idLessThanOrEqualTo(Integer value) {
            addCriterion("dianlustatus_id <=", value, "dianlustatus_id");
            return (Criteria) this;
        }

        public Criteria andDianlustatus_idIn(List<Integer> values) {
            addCriterion("dianlustatus_id in", values, "dianlustatus_id");
            return (Criteria) this;
        }

        public Criteria andDianlustatus_idNotIn(List<Integer> values) {
            addCriterion("dianlustatus_id not in", values, "dianlustatus_id");
            return (Criteria) this;
        }

        public Criteria andDianlustatus_idBetween(Integer value1, Integer value2) {
            addCriterion("dianlustatus_id between", value1, value2, "dianlustatus_id");
            return (Criteria) this;
        }

        public Criteria andDianlustatus_idNotBetween(Integer value1, Integer value2) {
            addCriterion("dianlustatus_id not between", value1, value2, "dianlustatus_id");
            return (Criteria) this;
        }

        public Criteria andDianlustatus_nameIsNull() {
            addCriterion("dianlustatus_name is null");
            return (Criteria) this;
        }

        public Criteria andDianlustatus_nameIsNotNull() {
            addCriterion("dianlustatus_name is not null");
            return (Criteria) this;
        }

        public Criteria andDianlustatus_nameEqualTo(String value) {
            addCriterion("dianlustatus_name =", value, "dianlustatus_name");
            return (Criteria) this;
        }

        public Criteria andDianlustatus_nameNotEqualTo(String value) {
            addCriterion("dianlustatus_name <>", value, "dianlustatus_name");
            return (Criteria) this;
        }

        public Criteria andDianlustatus_nameGreaterThan(String value) {
            addCriterion("dianlustatus_name >", value, "dianlustatus_name");
            return (Criteria) this;
        }

        public Criteria andDianlustatus_nameGreaterThanOrEqualTo(String value) {
            addCriterion("dianlustatus_name >=", value, "dianlustatus_name");
            return (Criteria) this;
        }

        public Criteria andDianlustatus_nameLessThan(String value) {
            addCriterion("dianlustatus_name <", value, "dianlustatus_name");
            return (Criteria) this;
        }

        public Criteria andDianlustatus_nameLessThanOrEqualTo(String value) {
            addCriterion("dianlustatus_name <=", value, "dianlustatus_name");
            return (Criteria) this;
        }

        public Criteria andDianlustatus_nameLike(String value) {
            addCriterion("dianlustatus_name like", value, "dianlustatus_name");
            return (Criteria) this;
        }

        public Criteria andDianlustatus_nameNotLike(String value) {
            addCriterion("dianlustatus_name not like", value, "dianlustatus_name");
            return (Criteria) this;
        }

        public Criteria andDianlustatus_nameIn(List<String> values) {
            addCriterion("dianlustatus_name in", values, "dianlustatus_name");
            return (Criteria) this;
        }

        public Criteria andDianlustatus_nameNotIn(List<String> values) {
            addCriterion("dianlustatus_name not in", values, "dianlustatus_name");
            return (Criteria) this;
        }

        public Criteria andDianlustatus_nameBetween(String value1, String value2) {
            addCriterion("dianlustatus_name between", value1, value2, "dianlustatus_name");
            return (Criteria) this;
        }

        public Criteria andDianlustatus_nameNotBetween(String value1, String value2) {
            addCriterion("dianlustatus_name not between", value1, value2, "dianlustatus_name");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_dianlustatus
     *
     * @mbg.generated do_not_delete_during_merge Wed Mar 18 21:18:20 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_dianlustatus
     *
     * @mbg.generated Wed Mar 18 21:18:20 CST 2020
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