package es.MundoPrograma_Pruebas;

import java.util.Arrays;

public class Copia_Clon_Arrays_Pruebas {

	public static void main(String[] args) {
		
		//array original
		int [] nums = {1,2,3,4,5,};
		System.out.println("Este es el array original   " + Arrays.toString(nums));
		
		//variable donde estara la copia del array
		int []  copiaArray;
		
		//aqui solo estoy incluyendo en mi array copiaArray los valores de nums
		copiaArray = nums;
		System.out.println("Este es la copia del array original   " + Arrays.toString(copiaArray));
		copiaArray[0]=0; //ahora en este punto modifico uno de los valores que tengo en el array original
		
		
		System.out.println();
		
		//imprimimos en pantalla los array
		System.out.println("Aqui el array copia modifico al original   " + Arrays.toString(nums));
		System.out.println("igual que aqui en la copia   " + Arrays.toString(copiaArray));
		
		
		System.out.println("\n//*******************************************************************************\n");

		//*******************************************************************************
		//segunda parte de los arrays
		
		//Metodo clone()
		int [] primos = {1, 2, 3, 5, 7, 11, 13, 17, 19, 23};
		int [] copiaClonado;
		int [] copiaReferencia;
		
		//clonado
		copiaClonado = primos.clone();
		
		//cambio en el clon, sin afectar al original
		copiaClonado[0]=0;
		
		//copia referencia
		copiaReferencia = primos;
		
		//cambio en la copia que afecta al original
		
		copiaReferencia [1] =0;
		
		//salida 
		System.out.println("Array original:  " + Arrays.toString(primos));
		
		System.out.println("Array Clonado:  " + Arrays.toString(copiaClonado));
		
		System.out.println("Array Referencia:  " + Arrays.toString(copiaReferencia));
		
		
		
		System.out.println("\n//*******************************************************************************\n");
		
		//Copiar arrays desde otro metodo
		
		//  arraypocy (array-1, inicio-original, array-2, inicio-Destino, elementos-numero de espacio a copiar)
		
		int [] arrayA = {1,2,3,4}; //declaro el primer Array
		
		int [] arrayB = new int [arrayA.length]; //declaro el segundo array que va a tener la copia
		
		//creo lo copia de la siguiente manera con el System.arraycopy
		System.arraycopy(arrayA, 1, arrayB, 2, 2);
		
		System.out.println("Este es el array A: " + Arrays.toString(arrayA));
		System.out.println("Este es el array B: " + Arrays.toString(arrayB));
		
		
	
		
	}

}
