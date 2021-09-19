
public class StringBuiltInMethodCheck {
	public static void main(String[] args)
	{
//		StringBuilder sb = new StringBuilder("tarequl Islam");
		String str = "Tarequl Islam";
		System.out.println("String length : "+str.length());
		
		
		// charAt() method
		
		// Get a single charater at position 1 as zero base indexing
		
		System.out.println(str.charAt(1));
		for(int i=0; i<str.length(); i++)
		{
			System.out.printf("%c  ", str.charAt(i));
		}
		System.out.println();
		
		
		
		// To Compare with other string
		
		String str2 = "tarequl islam";
		String str3 = "Tarequl Islam";
		
		System.out.println("Compare string str with str2 : "+str.compareTo(str2));
		System.out.println("Compare string str with str3 : "+str.compareTo(str3)); // when both strings are same then return 0
		String T = "T";
		String U = "U";
		String Z = "Z";
		System.out.println("Compare string U with T : "+U.compareTo(T)); // here U greater than T for one time so return 1;
		System.out.println("Compare string T with U : "+T.compareTo(U)); // here T less than U for one time so return -1;
		System.out.println("compate string T with Z : "+T.compareTo(Z)); // Here T less than Z for six time so return -6;
		System.out.println("compate string Z with T : "+Z.compareTo(T)); // Here T greater than Z for six time so return 6;
		
		
		
		
		
	}
}
