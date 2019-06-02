package nizovi3;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n:");
		int n = sc.nextInt();
		int[] a = new int[n];
		ucitajNiz(a);
		ispisiNiz(a);
		if(rastuciNiz(a))
          System.out.println("Niz je rastuci");
		else System.out.println("Niz nije rastuci");
	}

	static void ucitajNiz(int[] niz) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesi " + i + " element: ");
			niz[i] = sc.nextInt();
		}
		System.out.println();
	}

	static void ispisiNiz(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
		System.out.println();
		System.out.println();
	}

	static boolean rastuciNiz(int[] niz) {
		boolean veci = true;
		int i = 0;
		while (i < niz.length - 1) {
			if (niz[i] >= niz[i + 1]) {
				veci = false;
			}
			i++;

		}
		return veci;

	}

}
