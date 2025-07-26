package es.ProgramasInstagram.Diario;

import java.util.Scanner;

public class NotasPracticas04 {

	public static void main(String[] args) {
		
		Scanner entrada =new Scanner(System.in);
		//pedimos al usuario 5 calificaciones
		
		//creamos los tipos de variables 
		System.out.println("Dime tu calificacion de Matematicas");
		double caliMate=entrada.nextDouble();
		
		System.out.println("Dime tu calificacion de Biologia");
		double caliBio=entrada.nextDouble();
		
		System.out.println("Dime tu calificacion de Fisica");
		double califisi=entrada.nextDouble();
		
		System.out.println("Dime tu calificacion de Quimica");
		double caliQuimi=entrada.nextDouble();
		
		System.out.println("Dime tu calificacion de Historia");
		double caliHistori=entrada.nextDouble();
		
		//ahora la variable de la colificacion final
		
		double caliFinal = suma(caliMate,caliBio,califisi,caliQuimi,caliHistori);
		
		int caliRedondeo = (int)Math.round(caliFinal);
		
		if(caliRedondeo <= 10){
			System.out.println("final " + caliRedondeo);
		
		}else System.out.println("Algo fallo, intentelo de nuevo");
		
		
		
		

	}
	
	public static double suma(double a, double b, double c, double d, double e) {
		
		double res;
		
		res = (a + b + c + d + e) / 5;
		
		
		return res;
	}

	

}
