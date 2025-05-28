package String_Programs.With_Sentence;

public class SumOfNumbersFromString {

	public static void main(String[] args) {

		String s = "Welcome 123 we 324";
		String temp="";
		int sum = 0;
		
//		for(int i=0; i< s.length(); i++) {      //123+324
//			char ch = s.charAt(i);
//			
//			if(Character.isDigit(ch)) {
//				temp+=ch;  //append digit to current number
//			}else {
//				if(!temp.isEmpty()) {
//					sum+=Integer.parseInt(temp);
//					temp="";  //reset after adding
//				}
//			}
//		}
//		//Add any remaining number at end
//		if(!temp.isEmpty()) {
//			sum+=Integer.parseInt(temp);
//		}
//		System.out.println(sum);
		
		//-----------------------------------------------------------
		
		char[] arr = s.toCharArray();
		for(char ch : arr ) {    //1+2+3+3+2+4
			if(Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		System.out.println(sum);
		
		//---------------------------------------------------------
		
//		char[] ch = s.toCharArray();
//		for(int i=0; i<=s.length(); i++) {
//			for(int j=0; j<=s.length(); j++) {
//				if(ch[i].isDigit && ch[j].isDigit) {
//					int total = ch[i] + ch[j];
//				}
//			}
//		}
//		System.out.println(sum);
		
		}
	}


