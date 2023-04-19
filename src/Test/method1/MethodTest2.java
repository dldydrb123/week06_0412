package Test.method1;

import java.util.Scanner;
public class MethodTest2 {
	static void add(int n1, int n2) {
		int result = n1 + n2;
		System.out.printf("%d + %d = %d\n", n1, n2, result);
		
	}
	
	
	public static void main(String[] args) {
		Scanner s2 = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		while(true)
		{

		System.out.print("정수입력1:");
		int n1 = s.nextInt();
		System.out.print("정수입력2:");
		int n2 = s.nextInt();
		add(n1, n2);
		
		System.out.println("그만두고 싶다면 n 입력:");
		String cont = s2.nextLine();
		if(cont.equals("n"))
			break;
		}
		
		System.out.println("프로그램 종료됨...");
		s.close();
		s2.close();
	}
	
}
