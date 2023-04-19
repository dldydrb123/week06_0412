package Test.method1;

public class MethodTest1 {
	static void printHead(char c, int num) {
		for (int i = 0; i < num; i++) {
			System.out.print(c);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		printHead('♠', 20);
		System.out.println("유한대학교 컴퓨터 소프트웨어공학과.");
		printHead('♥', 30);
		System.out.println("사용자 정의 메소드를 호출했습니다.");
		printHead('◆', 40);
	}
}
