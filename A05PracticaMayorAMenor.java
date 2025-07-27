package es.ProgramasInstagram.Diario;

import java.util.Scanner;

public class A05PracticaMayorAMenor {

	public static void main(String[] args) {
Scanner entrada =new Scanner(System.in);
		
		System.out.println("numero 1");
		double a=entrada.nextDouble();
		
		System.out.println("numero 2");
		double b=entrada.nextDouble();
		
		System.out.println("numero 3");
		double c=entrada.nextDouble();
		
		
		
		
		// a es mayor
		if (a > b && a > c) {
			System.out.println("a es mayor que b y c");
			
			if (b >= c) {
				System.out.println( a + " - " + b + " - " + c);
			}
			
			else if (c >= b) {
				System.out.println(a + " - " + c + " - " + b);
			}	
			
		}	
		
		//b es mayor
		else if (b > a && b > c) {
			System.out.println("b es mayor que a y c");
			
			if (a >= c) {
				System.out.println( b + " - " + a + " - " + c);
			}
			
			else if (c >= a) {
				System.out.println(b + " - " + c + " - " + a);
			}
		}
		
		// c es mayor
		else if (c > a && c > b) {
			System.out.println("c es mayor que a y b" );
			
			if (b >= a) {
				System.out.println( c + " - " + b + " - " + a);
			}
			
			else if (a >= c) {
				System.out.println(b + " - " + a + " - " + c);
			}
			
		}
		else System.out.println("no se cumplen condiciones");

	}

}
