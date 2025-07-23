package es.ProgramasInstagram.Diario;

import java.util.Scanner;

public class ParOImpar_0 {

	public static void main(String[] args) {
	
		//vamos a crear un clase Scanner y pedir datos esto nos permite no aburrirnos con el codigo
		// primero importamos el paquete
		Scanner entrada = new Scanner (System.in);	//listo aqui se crea la clase Scanner en java para pedir datos
		
		
		
		
		String pregunta= "";
		String respuesta = "si";

		
		
		
		do {
		
		//mostramos mensaje al usuario para pedir un numero
		System.out.println("DIME UN NUMERO");
			
		//guardamos el dato
		int numero = entrada.nextInt();
		
		//sacaremos numeros pares o impares
		numero = calculo(numero);
			
			
		//creamos la condicion para saber que impriminos si uno o otro termino
		if (numero == 0) {
			System.out.println("El numero: " + numero + " es un numero PAR");
		}else System.out.println("El numero: " + numero + " es un numero IMPAR");
		
		
		//vamos a preguntar si quiere continuar o no 
		
		//preguntamos en pantalla si quiere ingresar otro numero
		System.out.println("¿Quieres Probar con otro numero? >si< o >no<");
		 
		//preguntamos
		pregunta = entrada.next();

		}while(respuesta.equalsIgnoreCase(pregunta));
		
		System.out.println("Fin del programa");

	}
	
	//creamos un merodo que nos permite saber si es numero tiene exponente 0 o 1.
		// con esto podemos saber si es 0 pues es par y si es 1 impar 
		public static int calculo(int a) {
			a = a%2;
			return a;
		}

}
