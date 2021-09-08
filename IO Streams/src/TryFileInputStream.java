import java.io.FileInputStream;
import java.io.IOException;

public class TryFileInputStream {

	public static void main(String[] args) {
		
		
		try {
			FileInputStream fins = new FileInputStream("E:\\\\java\\\\core java\\\\IO Streams\\\\src\\\\test_output.txt");
			/*
			 * Read Single character
			 * 
				int val = fins.read();
				System.out.println((char)val);
				fins.close();
			*/
			
			// Read full string
			
			int i=0;
			while((i = fins.read()) != -1)
			{
				System.out.print((char)i);
			}
			
			fins.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
