package com.web.model;

import java.util.Date;

public class PLoginHistory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_login_history.lid
     *
     * @mbg.generated
     */
    private Long lid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_login_history.uid
     *
     * @mbg.generated
     */
    private Integer uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_login_history.uName
     *
     * @mbg.generated
     */
    private String uname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_login_history.login_ip
     *
     * @mbg.generated
     */
    private String loginIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_login_history.login_time
     *
     * @mbg.generated
     */
    private Date loginTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_login_history.lid
     *
     * @return the value of p_login_history.lid
     *
     * @mbg.generated
     */
    public Long getLid() {
        return lid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_login_history.lid
     *
     * @param lid the value for p_login_history.lid
     *
     * @mbg.generated
     */
    public void setLid(Long lid) {
        this.lid = lid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_login_history.uid
     *
     * @return the value of p_login_history.uid
     *
     * @mbg.generated
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_login_history.uid
     *
     * @param uid the value for p_login_history.uid
     *
     * @mbg.generated
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_login_history.uName
     *
     * @return the value of p_login_history.uName
     *
     * @mbg.generated
     */
    public String getUname() {
        return uname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_login_history.uName
     *
     * @param uname the value for p_login_history.uName
     *
     * @mbg.generated
     */
    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_login_history.login_ip
     *
     * @return the value of p_login_history.login_ip
     *
     * @mbg.generated
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_login_history.login_ip
     *
     * @param loginIp the value for p_login_history.login_ip
     *
     * @mbg.generated
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_login_history.login_time
     *
     * @return the value of p_login_history.login_time
     *
     * @mbg.generated
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_login_history.login_time
     *
     * @param loginTime the value for p_login_history.login_time
     *
     * @mbg.generated
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}