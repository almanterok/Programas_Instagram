package Programas_Fernando_Serrao;
import java.util.*;
public class Numero_Factorial {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("Ingresa un numero para sacar el pactor de este");
		int numero = entrada.nextInt();
		int factorial = numero;
		
		for (int i = numero-1; i>0;--i) {
			
			factorial = factorial*i;
			
		}
		System.out.println("el numero que ingresaste fue " + numero + 
				" y el numero factorial seria: " + factorial);
		
		entrada.close();
		
	}

}
