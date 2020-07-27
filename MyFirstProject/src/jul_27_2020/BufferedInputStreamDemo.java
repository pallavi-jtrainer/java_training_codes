package jul_27_2020;

import java.io.*;

public class BufferedInputStreamDemo {

	public static void main(String[] args) {
		String path = "c:\\users\\labadmin\\Desktop\\newfile.txt";
		try {
			FileInputStream f_in = new FileInputStream(path);
			
			//BufferedInputStream takes a f_in object
			BufferedInputStream bis = new BufferedInputStream(f_in);
			
			System.out.println("number of bytes: " + bis.available());
			
			boolean marksupported = bis.markSupported();
			if(marksupported == true) {
				bis.mark(bis.available());
			}
			
			//reading from text file (input stream)
			int ch;
			bis.mark(25);
			while((ch = bis.read()) != -1) {
				System.out.print((char)ch);
			}
			
			bis.reset();
			while((ch = bis.read()) != -1) {
				System.out.print((char)ch);
			}
			
			bis.close();
			f_in.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
