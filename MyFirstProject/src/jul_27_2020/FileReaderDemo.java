package jul_27_2020;


import java.io.*;

public class FileReaderDemo {

	public static void main(String[] args) {
		String path = "c:\\users\\labadmin\\Desktop\\newfile.txt";
		try {
			FileReader fr = new FileReader(path);
			
			int ch;
			while((ch = fr.read())!= -1)
				System.out.print((char)ch);
			
			fr.close();

		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
