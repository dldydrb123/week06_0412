package Test.method1;

public class MethodTest4 {
	static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
		
	}
	
	
	public static void main(String[] args) {
		
		int n1 = 1000;
		int n2 = 2000;
		int result =add(n1, n2);
		System.out.printf("%d + %d = %d\n", n1, n2, result);
		System.out.println();
		n1 = 1234;
		n2 = 2345;
		int a1 =add(n1, n2);
		System.out.printf("%d + %d = %d\n", n1, n2, a1);
		
		
		
	}

}
