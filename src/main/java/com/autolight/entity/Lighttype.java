package com.autolight.entity;

public class Lighttype {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_lighttype.lighttype_id
     *
     * @mbg.generated Wed Mar 18 21:18:20 CST 2020
     */
    private Integer lighttype_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_lighttype.ltype_id
     *
     * @mbg.generated Wed Mar 18 21:18:20 CST 2020
     */
    private Integer ltype_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_lighttype.lighttype_name
     *
     * @mbg.generated Wed Mar 18 21:18:20 CST 2020
     */
    private String lighttype_name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_lighttype.lighttype_id
     *
     * @return the value of tb_lighttype.lighttype_id
     *
     * @mbg.generated Wed Mar 18 21:18:20 CST 2020
     */
    public Integer getLighttype_id() {
        return lighttype_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_lighttype.lighttype_id
     *
     * @param lighttype_id the value for tb_lighttype.lighttype_id
     *
     * @mbg.generated Wed Mar 18 21:18:20 CST 2020
     */
    public void setLighttype_id(Integer lighttype_id) {
        this.lighttype_id = lighttype_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_lighttype.ltype_id
     *
     * @return the value of tb_lighttype.ltype_id
     *
     * @mbg.generated Wed Mar 18 21:18:20 CST 2020
     */
    public Integer getLtype_id() {
        return ltype_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_lighttype.ltype_id
     *
     * @param ltype_id the value for tb_lighttype.ltype_id
     *
     * @mbg.generated Wed Mar 18 21:18:20 CST 2020
     */
    public void setLtype_id(Integer ltype_id) {
        this.ltype_id = ltype_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_lighttype.lighttype_name
     *
     * @return the value of tb_lighttype.lighttype_name
     *
     * @mbg.generated Wed Mar 18 21:18:20 CST 2020
     */
    public String getLighttype_name() {
        return lighttype_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_lighttype.lighttype_name
     *
     * @param lighttype_name the value for tb_lighttype.lighttype_name
     *
     * @mbg.generated Wed Mar 18 21:18:20 CST 2020
     */
    public void setLighttype_name(String lighttype_name) {
        this.lighttype_name = lighttype_name == null ? null : lighttype_name.trim();
    }
}