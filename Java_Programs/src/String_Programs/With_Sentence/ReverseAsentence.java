package String_Programs.With_Sentence;

public class ReverseAsentence {

	public static void main(String[] args) {

		String s = "I am Raju";
		
		String[] str = s.split(" ");
		for(int i=str.length-1; i>=0; i--) {
			System.out.print(str[i] + " ");
		}
	}

}
