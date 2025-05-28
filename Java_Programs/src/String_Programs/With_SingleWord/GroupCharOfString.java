package String_Programs.With_SingleWord;

import java.util.Iterator;

public class GroupCharOfString {

	public static void main(String[] args) {

//		String s = "Apitesting";
//		int length = s.length();
//		StringBuilder sb = new StringBuilder();
//		int i = 0;
//		while (i < length - 3) {
//			sb.append(s, i, i + 3).append("-");
//			i += 3;
//		}
//		sb.append(s.substring(i));	
//		System.out.println(sb.toString());

		// -------------------------------------------------------------

//		String s = "ApiTesting";
//		
//		System.out.print(s.substring(0, 3));
//		
//		for (int i = 3; i < s.length(); i+=3) {
//			if (i + 1 >= s.length() - 1) {
//				s.substring(i);
//				System.out.print(s.substring(i));
//				break;
//			}
//			System.out.print("-" + s.substring(i, i + 3));
//		}

		// ---------------------------------------------------------------------

//		String s = "ApiTesting";
//		System.out.print(s.substring(0, 3));
//		for (int i = 3; i < s.length(); i += 3) {
//			if (i + 1 >= s.length() - 1) {
//				s.substring(i);
//				System.out.print(s.substring(i));
//				break;
//			} else {
//				System.out.print("-" + s.substring(i, i + 3));
//
//			}
//		}
		
		//------------------------------------------------------------------------
		
		String str = "ApiTesting";
		String s= ""+str.charAt(0);
		for(int i=1;i<str.length();i++) 
		{
			if(i%3==0 && i+1!=str.length()) 
			{
				s+="-"+str.charAt(i);
			}
			else 
			{
				s+=str.charAt(i);
			}
		}
		System.out.println(s);
		
		
	}
}
