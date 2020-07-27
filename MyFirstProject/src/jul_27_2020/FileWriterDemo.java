package jul_27_2020;

import java.io.*;

public class FileWriterDemo {

	public static void main(String[] args) {
		String path = "c:\\users\\labadmin\\Desktop\\newfile1.txt";
		
		String str = "Filewriter Demo in java";
		
		try {
			FileWriter fw = new FileWriter(path, true);
			for(int i = 0; i<str.length();i++)
				fw.append(str.charAt(i));
			
			System.out.println("Writing successful");
			
			fw.close();
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
