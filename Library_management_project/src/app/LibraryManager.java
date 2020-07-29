package app;

import java.util.Scanner;

import model.*;

public class LibraryManager {
	//scanner is used to read information from standard input device
	static Scanner sc = new Scanner(System.in);
	
	static void mainMenu() {
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
			System.out.println("7. List Books in Library");
			System.out.println("8. Exit");
			
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
			case 7: System.out.println("List Of Books -----------------");
					new LibraryBookDetails().ListAllBooks();
			 		break;
			default:System.out.println("Exiting!!!!"); 
					System.exit(0);
					break;
			}
			
		}while(choice >=1 && choice < 8);
	}
	
	void subMenu_Reports() {
		
		
	}
	
	
	static void login() {
		System.out.println("LIBRARY MANAGEMENT SYSTEM***************");
		System.out.println();
		System.out.print("ID Please: ");
		int id = sc.nextInt();
		System.out.print("Password: ");
		String pass = sc.next();
		
		boolean flag = Librarian.validateCredentials(id, pass);
		if(flag == true) {
			mainMenu();
		}else {
			System.out.println("Wrong ID or Password. Please try again!");
			System.exit(0);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		login();

	}

}
