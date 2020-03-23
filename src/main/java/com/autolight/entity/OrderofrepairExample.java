package com.autolight.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderofrepairExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_orderofrepair
     *
     * @mbg.generated Mon Mar 23 21:37:01 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_orderofrepair
     *
     * @mbg.generated Mon Mar 23 21:37:01 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_orderofrepair
     *
     * @mbg.generated Mon Mar 23 21:37:01 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_orderofrepair
     *
     * @mbg.generated Mon Mar 23 21:37:01 CST 2020
     */
    public OrderofrepairExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_orderofrepair
     *
     * @mbg.generated Mon Mar 23 21:37:01 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_orderofrepair
     *
     * @mbg.generated Mon Mar 23 21:37:01 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_orderofrepair
     *
     * @mbg.generated Mon Mar 23 21:37:01 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_orderofrepair
     *
     * @mbg.generated Mon Mar 23 21:37:01 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_orderofrepair
     *
     * @mbg.generated Mon Mar 23 21:37:01 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_orderofrepair
     *
     * @mbg.generated Mon Mar 23 21:37:01 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_orderofrepair
     *
     * @mbg.generated Mon Mar 23 21:37:01 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_orderofrepair
     *
     * @mbg.generated Mon Mar 23 21:37:01 CST 2020
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
     * This method corresponds to the database table tb_orderofrepair
     *
     * @mbg.generated Mon Mar 23 21:37:01 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_orderofrepair
     *
     * @mbg.generated Mon Mar 23 21:37:01 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_orderofrepair
     *
     * @mbg.generated Mon Mar 23 21:37:01 CST 2020
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

        public Criteria andOrderofrepair_idIsNull() {
            addCriterion("orderofrepair_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_idIsNotNull() {
            addCriterion("orderofrepair_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_idEqualTo(Integer value) {
            addCriterion("orderofrepair_id =", value, "orderofrepair_id");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_idNotEqualTo(Integer value) {
            addCriterion("orderofrepair_id <>", value, "orderofrepair_id");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_idGreaterThan(Integer value) {
            addCriterion("orderofrepair_id >", value, "orderofrepair_id");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderofrepair_id >=", value, "orderofrepair_id");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_idLessThan(Integer value) {
            addCriterion("orderofrepair_id <", value, "orderofrepair_id");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_idLessThanOrEqualTo(Integer value) {
            addCriterion("orderofrepair_id <=", value, "orderofrepair_id");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_idIn(List<Integer> values) {
            addCriterion("orderofrepair_id in", values, "orderofrepair_id");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_idNotIn(List<Integer> values) {
            addCriterion("orderofrepair_id not in", values, "orderofrepair_id");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_idBetween(Integer value1, Integer value2) {
            addCriterion("orderofrepair_id between", value1, value2, "orderofrepair_id");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_idNotBetween(Integer value1, Integer value2) {
            addCriterion("orderofrepair_id not between", value1, value2, "orderofrepair_id");
            return (Criteria) this;
        }

        public Criteria andRoom_nameIsNull() {
            addCriterion("room_name is null");
            return (Criteria) this;
        }

        public Criteria andRoom_nameIsNotNull() {
            addCriterion("room_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoom_nameEqualTo(String value) {
            addCriterion("room_name =", value, "room_name");
            return (Criteria) this;
        }

        public Criteria andRoom_nameNotEqualTo(String value) {
            addCriterion("room_name <>", value, "room_name");
            return (Criteria) this;
        }

        public Criteria andRoom_nameGreaterThan(String value) {
            addCriterion("room_name >", value, "room_name");
            return (Criteria) this;
        }

        public Criteria andRoom_nameGreaterThanOrEqualTo(String value) {
            addCriterion("room_name >=", value, "room_name");
            return (Criteria) this;
        }

        public Criteria andRoom_nameLessThan(String value) {
            addCriterion("room_name <", value, "room_name");
            return (Criteria) this;
        }

        public Criteria andRoom_nameLessThanOrEqualTo(String value) {
            addCriterion("room_name <=", value, "room_name");
            return (Criteria) this;
        }

        public Criteria andRoom_nameLike(String value) {
            addCriterion("room_name like", value, "room_name");
            return (Criteria) this;
        }

        public Criteria andRoom_nameNotLike(String value) {
            addCriterion("room_name not like", value, "room_name");
            return (Criteria) this;
        }

        public Criteria andRoom_nameIn(List<String> values) {
            addCriterion("room_name in", values, "room_name");
            return (Criteria) this;
        }

        public Criteria andRoom_nameNotIn(List<String> values) {
            addCriterion("room_name not in", values, "room_name");
            return (Criteria) this;
        }

        public Criteria andRoom_nameBetween(String value1, String value2) {
            addCriterion("room_name between", value1, value2, "room_name");
            return (Criteria) this;
        }

        public Criteria andRoom_nameNotBetween(String value1, String value2) {
            addCriterion("room_name not between", value1, value2, "room_name");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(Integer value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Integer value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Integer value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<Integer> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_nameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUser_nameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUser_nameEqualTo(String value) {
            addCriterion("user_name =", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameGreaterThan(String value) {
            addCriterion("user_name >", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLessThan(String value) {
            addCriterion("user_name <", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLike(String value) {
            addCriterion("user_name like", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotLike(String value) {
            addCriterion("user_name not like", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameIn(List<String> values) {
            addCriterion("user_name in", values, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "user_name");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_textIsNull() {
            addCriterion("orderofrepair_text is null");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_textIsNotNull() {
            addCriterion("orderofrepair_text is not null");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_textEqualTo(String value) {
            addCriterion("orderofrepair_text =", value, "orderofrepair_text");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_textNotEqualTo(String value) {
            addCriterion("orderofrepair_text <>", value, "orderofrepair_text");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_textGreaterThan(String value) {
            addCriterion("orderofrepair_text >", value, "orderofrepair_text");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_textGreaterThanOrEqualTo(String value) {
            addCriterion("orderofrepair_text >=", value, "orderofrepair_text");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_textLessThan(String value) {
            addCriterion("orderofrepair_text <", value, "orderofrepair_text");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_textLessThanOrEqualTo(String value) {
            addCriterion("orderofrepair_text <=", value, "orderofrepair_text");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_textLike(String value) {
            addCriterion("orderofrepair_text like", value, "orderofrepair_text");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_textNotLike(String value) {
            addCriterion("orderofrepair_text not like", value, "orderofrepair_text");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_textIn(List<String> values) {
            addCriterion("orderofrepair_text in", values, "orderofrepair_text");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_textNotIn(List<String> values) {
            addCriterion("orderofrepair_text not in", values, "orderofrepair_text");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_textBetween(String value1, String value2) {
            addCriterion("orderofrepair_text between", value1, value2, "orderofrepair_text");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_textNotBetween(String value1, String value2) {
            addCriterion("orderofrepair_text not between", value1, value2, "orderofrepair_text");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_timeIsNull() {
            addCriterion("orderofrepair_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_timeIsNotNull() {
            addCriterion("orderofrepair_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_timeEqualTo(Date value) {
            addCriterion("orderofrepair_time =", value, "orderofrepair_time");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_timeNotEqualTo(Date value) {
            addCriterion("orderofrepair_time <>", value, "orderofrepair_time");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_timeGreaterThan(Date value) {
            addCriterion("orderofrepair_time >", value, "orderofrepair_time");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("orderofrepair_time >=", value, "orderofrepair_time");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_timeLessThan(Date value) {
            addCriterion("orderofrepair_time <", value, "orderofrepair_time");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_timeLessThanOrEqualTo(Date value) {
            addCriterion("orderofrepair_time <=", value, "orderofrepair_time");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_timeIn(List<Date> values) {
            addCriterion("orderofrepair_time in", values, "orderofrepair_time");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_timeNotIn(List<Date> values) {
            addCriterion("orderofrepair_time not in", values, "orderofrepair_time");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_timeBetween(Date value1, Date value2) {
            addCriterion("orderofrepair_time between", value1, value2, "orderofrepair_time");
            return (Criteria) this;
        }

        public Criteria andOrderofrepair_timeNotBetween(Date value1, Date value2) {
            addCriterion("orderofrepair_time not between", value1, value2, "orderofrepair_time");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_orderofrepair
     *
     * @mbg.generated do_not_delete_during_merge Mon Mar 23 21:37:01 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_orderofrepair
     *
     * @mbg.generated Mon Mar 23 21:37:01 CST 2020
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