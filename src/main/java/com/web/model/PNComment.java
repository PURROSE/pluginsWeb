package com.web.model;

import java.util.Date;

public class PNComment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_n_comment.ncId
     *
     * @mbg.generated
     */
    private Long ncid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_n_comment.nId
     *
     * @mbg.generated
     */
    private Integer nid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_n_comment.line
     *
     * @mbg.generated
     */
    private String line;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_n_comment.body
     *
     * @mbg.generated
     */
    private String body;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_n_comment.uId
     *
     * @mbg.generated
     */
    private Long uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_n_comment.uName
     *
     * @mbg.generated
     */
    private String uname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_n_comment.ncDate
     *
     * @mbg.generated
     */
    private Date ncdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_n_comment.ncId
     *
     * @return the value of p_n_comment.ncId
     *
     * @mbg.generated
     */
    public Long getNcid() {
        return ncid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_n_comment.ncId
     *
     * @param ncid the value for p_n_comment.ncId
     *
     * @mbg.generated
     */
    public void setNcid(Long ncid) {
        this.ncid = ncid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_n_comment.nId
     *
     * @return the value of p_n_comment.nId
     *
     * @mbg.generated
     */
    public Integer getNid() {
        return nid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_n_comment.nId
     *
     * @param nid the value for p_n_comment.nId
     *
     * @mbg.generated
     */
    public void setNid(Integer nid) {
        this.nid = nid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_n_comment.line
     *
     * @return the value of p_n_comment.line
     *
     * @mbg.generated
     */
    public String getLine() {
        return line;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_n_comment.line
     *
     * @param line the value for p_n_comment.line
     *
     * @mbg.generated
     */
    public void setLine(String line) {
        this.line = line == null ? null : line.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_n_comment.body
     *
     * @return the value of p_n_comment.body
     *
     * @mbg.generated
     */
    public String getBody() {
        return body;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_n_comment.body
     *
     * @param body the value for p_n_comment.body
     *
     * @mbg.generated
     */
    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_n_comment.uId
     *
     * @return the value of p_n_comment.uId
     *
     * @mbg.generated
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_n_comment.uId
     *
     * @param uid the value for p_n_comment.uId
     *
     * @mbg.generated
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_n_comment.uName
     *
     * @return the value of p_n_comment.uName
     *
     * @mbg.generated
     */
    public String getUname() {
        return uname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_n_comment.uName
     *
     * @param uname the value for p_n_comment.uName
     *
     * @mbg.generated
     */
    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_n_comment.ncDate
     *
     * @return the value of p_n_comment.ncDate
     *
     * @mbg.generated
     */
    public Date getNcdate() {
        return ncdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_n_comment.ncDate
     *
     * @param ncdate the value for p_n_comment.ncDate
     *
     * @mbg.generated
     */
    public void setNcdate(Date ncdate) {
        this.ncdate = ncdate;
    }
}