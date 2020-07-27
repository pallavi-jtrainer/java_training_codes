package jul_27_2020;

import java.util.ArrayList;
import java.util.Collections;

public class DriverClass {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(4, "Suhas"));
		empList.add(new Employee(1, "Komal"));
		empList.add(new Employee(3, "Ravi"));
		empList.add(new Employee(2, "Manoj"));
		
		System.out.println("Unsorted");
		for(Employee e: empList) {
			System.out.println(e.getEmpId() + " : " + e.getEmpName());
		}
		
		Collections.sort(empList, new SortById());
		
		System.out.println("Sorted by Employee Id");
		for(int i = 0; i < empList.size(); i++)
			System.out.println(empList.get(i));
		
		
		
	}

}
