package es.ProgramasInstagram.Diario;

public class OperadoresAritmeticos_04 {

	public static void main(String[] args) {
		//tipos de variables
		System.out.println("Ya hemos usado la de asignacion (=)");
		
		//asignacion
				// el = le asigna el valo de la derecha a la varible de la izquierda
		int num1 = 12345;
		
		System.out.println("Nostramos el valor de num1 solo con la asignacion " + num1);
		
		//OPERADORES ARITMETICOS
		
		System.out.println("\nen java temenos los mismas practicamente que los otros lenguajes de programacíon");
		System.out.println("\nSuma - Resta - Multiplicacion - Divisón - Módulo");
		
		int numA = 6;
		int numB = 3;
		
		System.out.println("\nTenemos dos numeros que vamos a usar que es " + numA + " y " + numB);
		
		int suma = numA + numB; //SUMA
		int resta = numA - numB; //RESTA
		int multiplicacion = numA * numB;//MULTIPLICACION
		int division = numA / numB; //DIVISION	
		int modulo = numA % numB; //MODULO 
		
		System.out.println("Mostramos por pantalla el resultado\n"
				+ "la suma(+): " + suma + "\n"
				+ "la resta(-): " + resta + "\n"
				+ "la multiplicacion(*): " + multiplicacion + "\n"
				+ "la divison(/): " + division + "\n"
				+ "el modulo(%): "+ modulo + "(da el resto de una divison)");
		
		
		
	}

}
