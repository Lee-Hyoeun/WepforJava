package easy2000s;

import java.util.Scanner;

public class no2439{

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for (int i = 0; i < count; i++) {
			for (int j = count; j > i+1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
