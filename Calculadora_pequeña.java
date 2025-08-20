package Programas_Fernando_Serrao;
import java.util.*;
public class Calculadora_pequeña {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Este Programa cuanta los espacios que se van tecleando, En el texto que vas a introducir");
		
		String texto=entrada.nextLine();
		int espacio =0;
		
		for (int i = 0; texto.length()>i; ++i){
			
			if(texto.charAt(i)==' ') espacio++;
			
			
		}
		
		System.out.println("Los espacios en este texto fueron de: " + espacio + " Espacios");
		

	}

}
