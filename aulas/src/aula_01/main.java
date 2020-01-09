//package teste;
//
//import java.util.Scanner;
//
//public class main {
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Digite um número:");
//		int a = sc.nextInt();
//		
//		int fator = 1;
//		for (int i = 0; i <= a; i++) {
//		
//		if (i == 0 || i == 1)
//			System.out.println("O fatorial de " + i + " é " + fator);
//		
//			else {
//				fator = fator * i;
//					System.out.println("O fatorial de " + i + " é " + fator);
//			}
//		}
//	}
//}

package aula_01;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
		int x;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número maior que zero:");
			x = sc.nextInt();
		}
		while (x<=0);
		
		while (x >= 1) {	
			if (x % 2 == 0) {
						x = x / 2;				
						if (x == 1) {
							System.out.print (x + "." );
						break;
						}
						else
							System.out.print (x + "->" );
				}
			else {
				x = 3 * x + 1;
				System.out.print (x + "->" );
			}
		}
	}
}