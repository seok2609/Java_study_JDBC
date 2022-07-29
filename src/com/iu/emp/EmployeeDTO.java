package com.iu.emp;

import java.sql.Date;

public class EmployeeDTO {
	private Integer Employee_id;
	private String First_Name;
	private String Last_Name;
	private String email;
	private Integer Phone_Number;
	private Date Hire_Date;
	private String Job_id;
	private Integer Salary;
	private Double Commission_pct;
	private Integer Manager_id;
	private Integer Department_id;
	
	
	public Integer getEmployee_id() {
		return Employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		Employee_id = employee_id;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getPhone_Number() {
		return Phone_Number;
	}
	public void setPhone_Number(Integer phone_Number) {
		Phone_Number = phone_Number;
	}
	public Date getHire_Date() {
		return Hire_Date;
	}
	public void setHire_Date(Date hire_Date) {
		Hire_Date = hire_Date;
	}
	public String getJob_id() {
		return Job_id;
	}
	public void setJob_id(String job_id) {
		Job_id = job_id;
	}
	public Integer getSalary() {
		return Salary;
	}
	public void setSalary(Integer salary) {
		Salary = salary;
	}
	public Double getCommission_pct() {
		return Commission_pct;
	}
	public void setCommission_pct(Double commission_pct) {
		Commission_pct = commission_pct;
	}
	public Integer getManager_id() {
		return Manager_id;
	}
	public void setManager_id(Integer manager_id) {
		Manager_id = manager_id;
	}
	public Integer getDepartment_id() {
		return Department_id;
	}
	public void setDepartment_id(Integer department_id) {
		Department_id = department_id;
	}
	
	
}
