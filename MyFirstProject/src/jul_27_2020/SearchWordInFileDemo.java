package jul_27_2020;

import java.io.*;
import java.util.*;

public class SearchWordInFileDemo {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String path = "c:\\users\\labadmin\\Desktop\\newfile.txt";
		
		//creating the file descriptor for input file
		File file = new File(path);
		
		//initialize array for storing words
		String[] words = null;
				
		try {
			FileReader fr = new FileReader(file);
			
			BufferedReader br = new BufferedReader(fr);
			
			//search string
			//String input = "Types";
			String input = sc.next();
			String str;
			int counter = 0;
			
			while((str = br.readLine())!= null) {
				words = str.split(" ");
				for(String s: words) {
					if(s.equals(input)) {
						counter++;
					}
				}
			}
			
			if(counter > 0) {
				System.out.println("The given input word is " + input +
						" and exists " + counter + " times");
			}else
				System.out.println("The given input word " + input + " does not exist");
			
			br.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
