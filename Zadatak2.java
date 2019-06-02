package metode;

import java.util.Scanner;

public class Zadatak2 {
	static int faktorijel(int n, int k) {

		int i = 1, j = 1, fakt = 1, fakt1 = 1, fakt2;
		while (i <= n) {

			fakt *= i;
			i += 1;
		}

		while (j <= k) {

			fakt1 *= j;
			j += 1;
		}
		fakt2 = fakt * fakt1;
		return fakt2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesi broj n: ");
		int broj = sc.nextInt();
		System.out.println("Unesi broj k: ");
		int broj1 = sc.nextInt();
		System.out.println("Proizvod faktorijela za unete brojeve N i K iznosi: " + faktorijel(broj, broj1));

	}

}
