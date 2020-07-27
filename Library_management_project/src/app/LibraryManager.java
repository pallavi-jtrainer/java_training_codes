package app;

import java.util.Scanner;

import model.*;

public class LibraryManager {
	//scanner is used to read information from standard input device
	Scanner sc = new Scanner(System.in);
	
	void mainMenu() {
		int choice = 0;
		do {
			System.out.println("********** Library Management System *************");
			System.out.println();
			System.out.println("1. Add book");
			System.out.println("2. Update Book details");
			System.out.println("3. Remove book");
			System.out.println("4. Generate Report");
			System.out.println("5. Issue Book");
			System.out.println("6. Calculate fine");
			System.out.println("7. Exit");
			
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: System.out.println("adding a book");
					break;
			case 2: System.out.println("updating a book");
					break;
			case 3: System.out.println("removing a book");
					break;
			case 4: System.out.println("Generating");
					break;
			case 5: System.out.println("Issuing");
					break;
			case 6: System.out.println("Calculating");
					break;
			default: System.exit(0);
					break;
			}
			
		}while(choice >=1 && choice < 7);
	}
	
	void subMenu_Reports() {
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		Student s = new Student();
		
	//	for(int i =0;i<3;i++) {
			s.populateStudentFile();
		//}

	}

}
