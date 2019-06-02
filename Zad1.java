package metode2;

import java.util.Scanner;

public class Zadatak1 {

	static int suma(int n) {

		int s = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				s += i;
			}
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi broj N: ");
		int n = sc.nextInt();
		System.out.println("Suma brojeva koji su delioci unetog broja N iznosi: " + suma(n));

	}

}
