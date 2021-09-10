import java.util.Scanner;

public class TryString {

	public static void main(String[] args) {

		
		/* Java String class is immutable and more memory allocate and not thread safe
		 * 
		 * */

		Scanner input = new Scanner(System.in);
		String str ;
		
////		str = input.next();
//		str = input.nextLine();
////		System.out.println(str);
//		
//		str = str.concat("$");
//		
//		for(int i=0; i<str.length(); i++)
//		{
//			System.out.print(str.charAt(i));
//		}
		
		
//		char[] ch = {'a','b','c'};
//		str = new String(ch);
//		System.out.println(str);
		
		char ch[] = new char[20];
		for(int i=0; i<5; i++)
		{
			ch[i] = input.next().charAt(0);
		}
		str = new String(ch);
		System.out.println(str);
		
	}

}
