package metode;

import java.util.Scanner;

public class Zadatak1 {
	
	static int suma(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi N brojeva: ");
		
		int i=1,s=0;
		while(i<=n) {
			int broj=sc.nextInt();
			s+=broj;
			i+=1;
		}
		
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi broj N: ");
		int n=sc.nextInt();
	
		System.out.println("suma brojeva iznosi:" + suma(n));
	
	}

}
