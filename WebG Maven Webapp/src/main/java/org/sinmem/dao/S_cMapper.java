package org.sinmem.dao;

import org.apache.ibatis.annotations.Param;
import org.sinmem.bean.S_c;

public interface S_cMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_c
	 * @mbggenerated
	 */int deleteByPrimaryKey(@Param("studentid") String studentid,@Param("cclassno") String cclassno,@Param("courseno") String courseno);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_c
	 * @mbggenerated
	 */
	int insert(S_c record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_c
	 * @mbggenerated
	 */
	int insertSelective(S_c record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_c
	 * @mbggenerated
	 */S_c selectByPrimaryKey(@Param("studentid") String studentid,@Param("cclassno") String cclassno,@Param("courseno") String courseno);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_c
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(S_c record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_c
	 * @mbggenerated
	 */
	int updateByPrimaryKey(S_c record);
}