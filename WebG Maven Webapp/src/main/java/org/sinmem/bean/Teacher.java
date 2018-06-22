package org.sinmem.bean;

public class Teacher  extends User{

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column teacher.userID
	 * @mbggenerated
	 */
	private String userid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column teacher.pwd
	 * @mbggenerated
	 */
	private String pwd;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column teacher.name
	 * @mbggenerated
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column teacher.userType
	 * @mbggenerated
	 */
	private Integer usertype;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column teacher.Gname
	 * @mbggenerated
	 */
	private String gname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column teacher.title
	 * @mbggenerated
	 */
	private String title;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column teacher.degree
	 * @mbggenerated
	 */
	private String degree;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column teacher.instituteNo
	 * @mbggenerated
	 */
	private String instituteno;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column teacher.majorNo
	 * @mbggenerated
	 */
	private String majorno;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column teacher.userID
	 * @return  the value of teacher.userID
	 * @mbggenerated
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column teacher.userID
	 * @param userid  the value for teacher.userID
	 * @mbggenerated
	 */
	public void setUserid(String userid) {
		this.userid = userid == null ? null : userid.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column teacher.pwd
	 * @return  the value of teacher.pwd
	 * @mbggenerated
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column teacher.pwd
	 * @param pwd  the value for teacher.pwd
	 * @mbggenerated
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd == null ? null : pwd.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column teacher.name
	 * @return  the value of teacher.name
	 * @mbggenerated
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column teacher.name
	 * @param name  the value for teacher.name
	 * @mbggenerated
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column teacher.userType
	 * @return  the value of teacher.userType
	 * @mbggenerated
	 */
	public Integer getUsertype() {
		return usertype;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column teacher.userType
	 * @param usertype  the value for teacher.userType
	 * @mbggenerated
	 */
	public void setUsertype(Integer usertype) {
		this.usertype = usertype;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column teacher.Gname
	 * @return  the value of teacher.Gname
	 * @mbggenerated
	 */
	public String getGname() {
		return gname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column teacher.Gname
	 * @param gname  the value for teacher.Gname
	 * @mbggenerated
	 */
	public void setGname(String gname) {
		this.gname = gname == null ? null : gname.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column teacher.title
	 * @return  the value of teacher.title
	 * @mbggenerated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column teacher.title
	 * @param title  the value for teacher.title
	 * @mbggenerated
	 */
	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column teacher.degree
	 * @return  the value of teacher.degree
	 * @mbggenerated
	 */
	public String getDegree() {
		return degree;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column teacher.degree
	 * @param degree  the value for teacher.degree
	 * @mbggenerated
	 */
	public void setDegree(String degree) {
		this.degree = degree == null ? null : degree.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column teacher.instituteNo
	 * @return  the value of teacher.instituteNo
	 * @mbggenerated
	 */
	public String getInstituteno() {
		return instituteno;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column teacher.instituteNo
	 * @param instituteno  the value for teacher.instituteNo
	 * @mbggenerated
	 */
	public void setInstituteno(String instituteno) {
		this.instituteno = instituteno == null ? null : instituteno.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column teacher.majorNo
	 * @return  the value of teacher.majorNo
	 * @mbggenerated
	 */
	public String getMajorno() {
		return majorno;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column teacher.majorNo
	 * @param majorno  the value for teacher.majorNo
	 * @mbggenerated
	 */
	public void setMajorno(String majorno) {
		this.majorno = majorno == null ? null : majorno.trim();
	}
}