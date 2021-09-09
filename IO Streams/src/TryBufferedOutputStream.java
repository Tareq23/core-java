

import java.io.BufferedOutputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryBufferedOutputStream {

	public static void main(String[] args) {
		try {
			FileOutputStream fous = new FileOutputStream("E:\\java\\core java\\IO Streams\\src\\test_output1.txt");
			
			BufferedOutputStream bous = new BufferedOutputStream(fous);
			
			String str = "Hello world\nwelcome to my home";
			
			byte b[] = str.getBytes();
			
			bous.write(b);
			bous.flush();
			bous.close();
			fous.close();
			System.out.println("success....");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
