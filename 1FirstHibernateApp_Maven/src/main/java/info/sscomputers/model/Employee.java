package info.sscomputers.model;

public class Employee {
	private Integer empno;
	private String ename;
	private Integer salary;
	
	
	public Employee() {
		super();
	}
	public Employee(Integer empno, String ename, Integer salary) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}
	
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	

}
