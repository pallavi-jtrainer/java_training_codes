package jul_27_2020;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectWriterDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		e1.setEmpId(1001);
		e1.setEmpName("Kannan");
		
		try {
			FileOutputStream fout = new FileOutputStream("employee.txt");
			
			//used to write objects into a file
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(e1);
			
			out.flush();
			System.out.println("Write successful");
			
			out.close();
			fout.close();
			
			
			//read from file
			FileInputStream fin = new FileInputStream("employee.txt");
			
			ObjectInputStream in = new ObjectInputStream(fin);
			Employee e2 = (Employee) in.readObject();
			
			System.out.println(e2.getEmpId() + " : " + e2.getEmpName());
			in.close();
			
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
