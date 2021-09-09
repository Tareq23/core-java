import java.io.FileInputStream;

import java.io.IOException;
import java.io.SequenceInputStream;

public class TrySequenceInputStream {
	
	public static void main(String[] args) throws IOException
	{
		FileInputStream fins_1 = new FileInputStream("E:\\java\\core java\\IO Streams\\src\\test_output.txt");
		FileInputStream fins_2 = new FileInputStream("E:\\java\\core java\\IO Streams\\src\\test_output1.txt");
		
		/*
		 * SequenceInputStream class used for read data from multiple file
		 * */
		SequenceInputStream sins = new SequenceInputStream(fins_1,fins_2);
		
		int i;
		while((i=sins.read())!=-1)
		{
			System.out.print((char)i);
		}
		sins.close();
		fins_1.close();
		fins_2.close();
	}
}
