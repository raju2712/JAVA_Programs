package String_Programs_With_SingleWord;

public class SwapVariableUsing3rdVariable {

	public static void main(String[] args) {

		String s1 ="Ramesh";
		String s2 = "Raju";
		
		String temp = s1;
		s1=s2;
		s2=temp;
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
