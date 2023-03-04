package com.hibernate.Employee.OneToMany;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	@Id @Column(name="employee_id")
	private int empid;
	
	private String empname;
	
	private String empposition;
	
	@ManyToOne/*(mappedBy="employee")*/@JoinColumn(name="department_id")
	private Department department;
	
	//GENERATE GETTER AND SETTER
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpposition() {
		return empposition;
	}

	public void setEmpposition(String empposition) {
		this.empposition = empposition;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	//CONSTRUCTOR
	public Employee(int empid, String empname, String empposition, Department department) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empposition = empposition;
		this.department = department;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}






	


