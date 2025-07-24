package es.ProgramasInstagram.Diario;
import java.util.*;
public class Practica03 {

	public static void main(String[] args) {
		//creamos el Scanner
		Scanner entrada = new Scanner (System.in);
		
		
		//pedimos en numero al usuario
		System.out.println("este programa te va a decir al ingresar un numero en cada ouesto cuantos pares e impares"
				 + " tiene");
		System.out.println("Dime un numero");
		
		//donde guardamos en dato del usuario
		int numeroBase= entrada.nextInt();
		//el que usaremos para calcular el modulo
		int numCalculo=0;
		//el contenedor de los pares
		int cuentaPar=0;
		//contenedor de impares
		int cuentaImpar=0;
		
		//boolean par = false;
		
		for (int i=1;numeroBase >= i;i++) {
			
			
			numCalculo = calculo(i);
			
			if (numCalculo == 0) {
				cuentaPar ++;
			}else cuentaImpar ++;
			

			
		}
		
		System.out.println("La cantidad de numeros pares es: " + cuentaPar + " y los numeros impares " + cuentaImpar);

	}
	
	public static int calculo(int a) {
		
		 a = a %2;
		
		return a;
		
	}

}
