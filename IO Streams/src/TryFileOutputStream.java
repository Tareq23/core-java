import java.io.FileOutputStream;
import java.io.IOException;

public class TryFileOutputStream {

	public static void main(String[] args){
		
		
		try {
			FileOutputStream fous = new FileOutputStream("E:\\java\\core java\\IO Streams\\src\\test_output.txt");
			/*
			// write single character
			fous.write(65); // ASCII value 65 means 'A' character;
			
			fous.close();
			System.out.println("success....");
			*/
			
			String str = "welcome to my home";
			byte b[] = str.getBytes(); // convert string to byte
			fous.write(b);
			fous.close();
			System.out.println("String Byte code print");
			
		} catch (IOException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
