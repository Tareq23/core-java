
public class StringBuiltInMethodCheck {
	public static void main(String[] args)
	{
		// catcat method
		
		String str = "Hello";
		str.concat(" world");
		System.out.println(str); // here string str not be changed because String class being immutable
		
		StringBuffer sb = new StringBuffer(str);
//		sb.concat(" world"); // concat method doesn't exists in StringBuffer class
		
		// string will be changed because StringBuffer class is mutable
		sb.append(" world"); //instead of concat method StringBuffer used append method for string concatenation
		System.out.println(sb);
		sb.append(10.4);  // integer value 10 concatenate as string value same as double, char , float
		System.out.println(sb);
		
		for(int i=0; i<sb.length(); i++)
		{
			System.out.printf("%c ", sb.charAt(i));
		}
		System.out.println();
		sb.insert(0, 'T');
		System.out.println(sb);
		
		char x = 'A' + 1 ;
		System.out.println(x);
		
		for(int i=0; i<sb.length(); i++)
		{
			sb.replace(i, i+1, "x");
		}
		System.out.println(sb);
	}
}
