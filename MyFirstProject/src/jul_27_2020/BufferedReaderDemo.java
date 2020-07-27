package jul_27_2020;

import java.io.*;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		String path = "c:\\users\\labadmin\\Desktop\\newfile.txt";
		try {
			FileReader fr = new FileReader(path);
			
			BufferedReader br = new BufferedReader(fr);
			
			char[] c = new char[20];
			
			if(br.ready()) {
				
				//read a line at a time
				System.out.print(br.readLine());
				
				br.read(c);
				
				//read into a char buffer
				for(int i = 0; i< 20; i++)
					System.out.print(c[i]);
			}
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
