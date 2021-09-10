
import java.util.Scanner;

public class TryStringBuffer {

	public static void main(String[] args) {
		
		/*
		 * Java StringBuffer class mutable and Thread safe
		 * 
		 * */
		
		
//		StringBuffer sb = new StringBuffer("Hello");
//		sb.append(" World");
//		System.out.println(sb+" : "+sb.length());
		StringBuffer sb = new StringBuffer(1000000000);
		
		Scanner input = new Scanner(System.in);
		sb.append(input.nextLine());
		
		System.out.println("current capacity : "+sb.capacity());
		
		sb.replace(sb.length()-2, sb.length()-1, "T");
		System.out.println(sb);
		
//		System.out.println("Reversed String :  " +sb.reverse());
		
//		for(int i=0; i<sb.length(); i++)
//		{
//			char ch = (char)( sb.charAt(i) + 1);
//			
////			sb.replace(i,i+1,  );
//			
////			System.out.println((char)(ch+1));
//		}
		
	}

}
