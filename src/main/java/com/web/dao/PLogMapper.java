package com.web.dao;

import com.web.model.PLog;

public interface PLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_log
     *
     * @mbg.generated
     */
    int insert(PLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_log
     *
     * @mbg.generated
     */
    int insertSelective(PLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_log
     *
     * @mbg.generated
     */
    PLog selectByPrimaryKey(Long logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(PLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PLog record);
}