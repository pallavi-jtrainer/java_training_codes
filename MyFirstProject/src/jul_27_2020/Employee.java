package jul_27_2020;

public class Employee implements java.io.Serializable{
	private int empId;
	private String empName;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	//default constructor
	public Employee() {}
	
	//parameterized constructor
	public Employee(int id, String name) {
		empId = id;
		empName = name;
	}
	
	@Override
	public String toString() {
		return this.empId + " : " + this.empName;
	}
}
