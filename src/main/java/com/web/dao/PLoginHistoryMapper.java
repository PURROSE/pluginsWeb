package com.web.dao;

import com.web.model.PLoginHistory;

public interface PLoginHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_login_history
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long lid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_login_history
     *
     * @mbg.generated
     */
    int insert(PLoginHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_login_history
     *
     * @mbg.generated
     */
    int insertSelective(PLoginHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_login_history
     *
     * @mbg.generated
     */
    PLoginHistory selectByPrimaryKey(Long lid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_login_history
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(PLoginHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_login_history
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PLoginHistory record);
}