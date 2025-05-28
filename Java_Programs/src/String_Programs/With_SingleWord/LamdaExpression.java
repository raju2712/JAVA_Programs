package String_Programs.With_SingleWord;

interface A {
	void m1(int a, int b);
}

public interface LamdaExpression {
	public static void main(String[] args) {
		A obj = (a, b) -> System.out.println(a + b);
		obj.m1(10, 20);
	}
}
