package DynamicArrayTest.java;

public class DynamicArrayTest {

	public static void main(String[] args) {
		int [][] arr = {{1, 2}, {3, 4, 5, 6, 7}, {8, 9, 10}};
		int cnt=1;
		int []cols= {2,5,3};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < cols[i]; j++) {
				arr[i][j]=cnt++;
			}
		}
		//출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"");
			}
			System.out.println();
			}
		}
	}

