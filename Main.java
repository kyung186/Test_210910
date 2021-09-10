package test1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double[] ar = new double[] { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		double sum = ar[a - 1] + ar[b - 1];
		System.out.printf("%.1f", sum);
	}
}
