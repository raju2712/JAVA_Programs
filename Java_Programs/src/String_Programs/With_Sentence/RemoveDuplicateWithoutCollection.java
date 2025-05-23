package String_Programs.With_Sentence;

public class RemoveDuplicateWithoutCollection {

	public static void main(String[] args) {
		
		 String s= "Java is a programming language";
	       char[] ch = s.toLowerCase().toCharArray();
	       for(int i=0; i<=ch.length-1;i++){
	           for(int j=i+1; j<=ch.length-1; j++){
	               if(ch[i]==ch[j]){
	                   ch[j]='@';
	               }
	           }
	           if(ch[i]!='@'){
	               System.out.print(ch[i]);
	           }
	       }

	}

}
