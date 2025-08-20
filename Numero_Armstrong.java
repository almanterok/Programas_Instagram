package Programas_Fernando_Serrao;
import java.util.*;
public class Numero_Armstrong {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dime un numero que creas es Armstrong:");
		int numero = entrada.nextInt();
		int numero2 = numero;
		int numBase=0;
		String pasos = String.valueOf(numero);
		int contador = pasos.length();
		
	 	for(int i = 0;contador>i;++i) {
			
			int calculo= numero%10;
			numero= numero/10;
			
			int pow =(int) Math.pow(calculo, contador);
			
			
			numBase +=pow;
			
					
								
		}
	 	
	 	if(numBase == numero2) {
			System.out.println("Si es numero Armstrong");
		}
	 	
	 	else System.out.println("No es numero Armstrong");
	 	
	 	entrada.close();

	}

}
