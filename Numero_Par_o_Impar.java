package Programas_Fernando_Serrao;
import java.util.*;
public class Numero_Par_o_Impar {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Dime un numero para saber si es par o impar");
		int numero = entrada.nextInt();
		
		int calculo = numero%2;
		
		if (calculo== 0) {
			System.out.println("Este es un nuemero Par");
		}else System.out.println("Este es un numero Impar");

		
		entrada.close();
	}

}
