package com.web.model;

import java.util.Date;

public class PSlqLog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_slq_log.pId
     *
     * @mbg.generated
     */
    private Long pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_slq_log.sqlType
     *
     * @mbg.generated
     */
    private String sqltype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_slq_log.sqlValue
     *
     * @mbg.generated
     */
    private String sqlvalue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_slq_log.sqlWhere
     *
     * @mbg.generated
     */
    private String sqlwhere;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_slq_log.starDate
     *
     * @mbg.generated
     */
    private Date stardate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_slq_log.stopDate
     *
     * @mbg.generated
     */
    private Date stopdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_slq_log.state
     *
     * @mbg.generated
     */
    private String state;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_slq_log.pId
     *
     * @return the value of p_slq_log.pId
     *
     * @mbg.generated
     */
    public Long getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_slq_log.pId
     *
     * @param pid the value for p_slq_log.pId
     *
     * @mbg.generated
     */
    public void setPid(Long pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_slq_log.sqlType
     *
     * @return the value of p_slq_log.sqlType
     *
     * @mbg.generated
     */
    public String getSqltype() {
        return sqltype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_slq_log.sqlType
     *
     * @param sqltype the value for p_slq_log.sqlType
     *
     * @mbg.generated
     */
    public void setSqltype(String sqltype) {
        this.sqltype = sqltype == null ? null : sqltype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_slq_log.sqlValue
     *
     * @return the value of p_slq_log.sqlValue
     *
     * @mbg.generated
     */
    public String getSqlvalue() {
        return sqlvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_slq_log.sqlValue
     *
     * @param sqlvalue the value for p_slq_log.sqlValue
     *
     * @mbg.generated
     */
    public void setSqlvalue(String sqlvalue) {
        this.sqlvalue = sqlvalue == null ? null : sqlvalue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_slq_log.sqlWhere
     *
     * @return the value of p_slq_log.sqlWhere
     *
     * @mbg.generated
     */
    public String getSqlwhere() {
        return sqlwhere;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_slq_log.sqlWhere
     *
     * @param sqlwhere the value for p_slq_log.sqlWhere
     *
     * @mbg.generated
     */
    public void setSqlwhere(String sqlwhere) {
        this.sqlwhere = sqlwhere == null ? null : sqlwhere.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_slq_log.starDate
     *
     * @return the value of p_slq_log.starDate
     *
     * @mbg.generated
     */
    public Date getStardate() {
        return stardate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_slq_log.starDate
     *
     * @param stardate the value for p_slq_log.starDate
     *
     * @mbg.generated
     */
    public void setStardate(Date stardate) {
        this.stardate = stardate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_slq_log.stopDate
     *
     * @return the value of p_slq_log.stopDate
     *
     * @mbg.generated
     */
    public Date getStopdate() {
        return stopdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_slq_log.stopDate
     *
     * @param stopdate the value for p_slq_log.stopDate
     *
     * @mbg.generated
     */
    public void setStopdate(Date stopdate) {
        this.stopdate = stopdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_slq_log.state
     *
     * @return the value of p_slq_log.state
     *
     * @mbg.generated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_slq_log.state
     *
     * @param state the value for p_slq_log.state
     *
     * @mbg.generated
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}