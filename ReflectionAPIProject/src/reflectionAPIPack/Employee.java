package reflectionAPIPack;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String job_title;
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	
	
	//Parameterized Constructor
	public Employee(int id, String name, double salary, String job_title) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.job_title = job_title;
	}
	
	//toString Method
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", job_title=" + job_title + "]";
	}
	
	public int compareTo(Employee e) {
		if(this.salary == e.salary) {
			return 1;
		}else {
			return -1;
		}
	}
}
