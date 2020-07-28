package reflectionAPIPack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Driver {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Pratap", 120000, "Developer");
		Employee e2 = new Employee(2, "Vishal", 96000, "Developer");
		Employee e3 = new Employee(3, "Komal", 45000, "Intern");
		Employee e4 = new Employee(4, "Nitya", 34000, "Fresher");
		
		ArrayList<Employee> eList = new ArrayList<Employee>();
		
		eList.add(e1);
		eList.add(e2);
		eList.add(e3);
		eList.add(e4);
		
//		Collections.sort(eList, new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return o1.compareTo(o2);
//			}
//			
//		});
		
		//Collections.sort(eList, (o1, o2)->o1.compareTo(o2));
		
		Collections.sort(eList, Employee::compareTo);
		
		System.out.println(eList);

	}

}
