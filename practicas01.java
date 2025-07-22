package es.ProgramasInstagram.Diario;
import java.util.*;
public class practicas01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		//pidiendo en numero al usuario
		System.out.println("Dime un numero");
		
		//vamos a sacer este numero por partes
		int numA = entrada.nextInt();
		
		//aqui estamos convirtiendo en numero de numA a la cantidad de Caracteres
		int valorNum = String.valueOf(numA).length();
		
		
		int numACopia =numA;
		
		for (int i =valorNum; i >0;) {
			
			// numAB = numA Bucle
			int numAB;
			 numAB = numA % 10;
			 
			 numA = numA/10;
			
			 //mostramos en pantallas los puestos y numeros
			 System.out.println("De: " + valorNum + " Puestos " + numAB + " Es el Puesto numero: " + i);
			
			 --i;
			 
			 
			
		}
		
	}

}
