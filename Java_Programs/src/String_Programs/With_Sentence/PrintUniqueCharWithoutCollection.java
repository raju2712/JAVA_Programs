package String_Programs.With_Sentence;

public class PrintUniqueCharWithoutCollection {

	public static void main(String[] args) {

		String s = "My name is Raju";
		char[] ch = s.toLowerCase().toCharArray();
		for (int i = 0; i <= ch.length - 1; i++) {
			int count = 1;
			for (int j = i + 1; j <= ch.length - 1; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '@';
				}
			}
			if (ch[i] != '@' && count == 1) {
				System.out.print(ch[i]);
			}

		}

	}

}
