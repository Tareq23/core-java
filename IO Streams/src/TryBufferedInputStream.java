
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TryBufferedInputStream {

	
	
	public static void main(String[] args) throws IOException
	{
		BufferedInputStream bins = new BufferedInputStream(new FileInputStream("E:\\java\\core java\\IO Streams\\src\\test_output1.txt"));
		int i;
		while((i=bins.read())!= -1)
		{
			System.out.print((char)i);
		}
		bins.close();
		
		//System.out.println("Success..");
	}
	
}
