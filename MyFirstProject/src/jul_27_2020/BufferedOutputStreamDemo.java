package jul_27_2020;

import java.io.*;

//import java.io.FileOutputStream;

public class BufferedOutputStreamDemo {

	public static void main(String[] args) {
		String path = "c:\\users\\labadmin\\Desktop\\newfile1.txt";
		try {
			FileOutputStream fout = new FileOutputStream(path);
			
			BufferedOutputStream bos = new BufferedOutputStream(fout);
			
			//writing into 
			for(int i = 65; i< 75;i++)
				bos.write(i);
			
			byte[] b = {97, 98,99,100,101,102};
			bos.write(b);
			
			bos.flush();
			
			bos.close();
			fout.close();
			
		}catch(FileNotFoundException e ) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
