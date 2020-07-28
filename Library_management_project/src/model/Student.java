package model;

import java.io.*;
import java.util.*;

public class Student implements Serializable{
	//member variables
	private int student_id;
	private String student_name;
	private String student_password;
	private int book_count;
	private String student_phone;
	
	ArrayList<Student> students = new ArrayList<Student>();
	
	transient Scanner sc = new Scanner(System.in);
	
	static String path = "c:\\users\\labadmin\\desktop\\project\\students.txt";
	
	/**
	 * Methods
	 */
	
	//getter methods
	int getStudentId() {
		return student_id;
	}
	
	String getStudentName() {
		return student_name;
	}
	
	String getStudentPassword() {
		return student_password;
	}
	
	int getBookCount() {
		return book_count;
	}
	
	String getStudentPhone() {
		return student_phone;
	}
	
	
	//setters
	void setStudentId(int id) {
		student_id=id;
	}
	
	void setStudentName(String name) {
		student_name = name;
	}
	
	void setBookCount(int count) {
		book_count = count;
	}
	
	void setStudentPhone(String phone) {
		student_phone = phone;
	}
	
	void setStudentPassword(String pass) {
		student_password = pass;
	}
	
//	private Student populateStudentArray() {
//		Student s = new Student();
//		System.out.println("ID: ");
//		int id = sc.nextInt();
//		s.setStudentId(id);
//		//s.setStudentId(sc.nextInt());
//		System.out.println("Name: ");
//		s.setStudentName(sc.next());
//		System.out.println("Password: ");
//		s.setStudentPassword(sc.next());
//		System.out.println("Phone: ");
//		s.setStudentPhone(sc.next());
//		System.out.println("Book Count: ");
//		s.setBookCount(sc.nextInt());
//		
//		return s;
//		
//	}
	
	public void populateStudentFile() {
		Student s = new Student();
		System.out.println("ID: ");
		int id = sc.nextInt();
		s.setStudentId(id);
		//s.setStudentId(sc.nextInt());
		System.out.println("Name: ");
		String name = sc.next();
		s.setStudentName(name);
		System.out.println("Password: ");
		String pass = sc.next();
		s.setStudentPassword(pass);
		System.out.println("Phone: ");
		String ph = sc.next();
		s.setStudentPhone(ph);
		System.out.println("Book Count: ");
		int count = sc.nextInt();
		s.setBookCount(count);
		
		writeToStudentsFile(s);
		
	}
	
	public void displayAllStudents() {
		Student s;
		try {
			FileInputStream fin = new FileInputStream(path);
			while((fin.available()) != 0)
			{
				   ObjectInputStream out = new ObjectInputStream(fin);
			       s =(Student)out.readObject();
			       System.out.println(s.getStudentId()+" : "+s.getStudentName()+" : "+s.getStudentPhone());
			}
			fin.close();
			}catch (IOException e) {
				System.out.println(e.getMessage());
			}catch(ClassNotFoundException e) {
				System.out.println(e.getMessage());
			}
		
//		for(int i = 0; i< 3; i++) {
//			Student s = populateStudentArray();
//			students.add(s);
//		}
//		
//		
//		for(Student std : students)
//			System.out.println("ID: " + std.student_id + " Name: " + std.student_name);
//	
//		File file = new File(path);
//		
//		long fileLength = file.length();
//		for(long i=0; i< fileLength; i++) {
//			readFromStudentsFile();
//			//System.out.println("ID: " + s.getStudentId()+ " : Student Name: " 
//				//	+ s.getStudentName() );
//		}
	}
	
	static void writeToStudentsFile(Student s) {
		try {
			FileOutputStream fout = new FileOutputStream(path,true);
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			if(s != null)
				out.writeObject(s);
			else
				System.out.println("Empty object");
			out.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try {
//			FileWriter fw = new FileWriter(path, true);
//			
//			BufferedWriter bw = new BufferedWriter(fw);
//			
//			String student = String.join(" : ", String.valueOf(s.getStudentId()),
//					s.getStudentName(), s.getStudentPassword(), s.getStudentPhone(),
//					String.valueOf(s.getBookCount()));
//			//System.out.println(student);
//			bw.write(student);
//			bw.flush();
//			bw.close();
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}
	
	static void readFromStudentsFile() {
		Student s = new Student();
		
		try {
			FileInputStream fin = new FileInputStream(path);
			
			ObjectInputStream in = new ObjectInputStream(fin);
			
			s = (Student) in.readObject();
			
			System.out.println(s.getStudentId() + " : " +s.getStudentName());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try {
//			FileReader fr = new FileReader(path);
//			
//			BufferedReader br = new BufferedReader(fr);
//			
//			String student = br.readLine();
//			
//			System.out.println(student);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		//return s;
	}
}
	
	
