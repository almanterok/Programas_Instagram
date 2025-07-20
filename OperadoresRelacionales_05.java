package es.ProgramasInstagram.Diario;

public class OperadoresRelacionales_05 {

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
		
				System.out.println("\n++++++++++++++++++++++++++++++++++++++++++\n");
		
		
		// OPERADORES RELACIONALES
		
		System.out.println("en los operadores relacionales tenemos");
		System.out.println(""
				+ "IGUAL: ==\n"
				+ "DISTINTO: !=\n"
				+ "MAYOR QUE: >\n"
				+ "MENOR QUE: <\n"
				+ "MAYOR O IGUAL QUE: >=\n"
				+ "MENOR O IGUAL QUE: <=");

		//declaramos variables para hacer pruebas
		int x = 3;
		int y = 3;
		
		//vamos a ver la RELACIONALIDAD 
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		//mostramos sus valores
		System.out.println("x == y " + (x == y) + " ¿SON IGUALES?");
		System.out.println("x != y " + (x != y) + " ¿SON DISTINTOS?");
		
		//creamos y declaramos un objeto de tipo String
		String a = new String ("Hola");
		String b = new String ("Hola");
		
		//mostramos sus valores
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	
		//comparamos estos obejtos == y !=  aqui comprueba es el espacio en memoria
		System.out.println("a == b: " + (a == b) + " ¿SON IGUALES?");
		System.out.println("a != b : " + (a != b ) + " ¿ES DISTINTO?");
		
		System.out.println("\n++++++++++++++++++++++++++++++++++++++++++\n");
		
		//OPERADORES ARITMETICOS
		
		 	int divisionEntera = 7/2;
	        int moduclo = 7%2;
	        double divisionReal = 7.0/2.0;
	        System.out.println("La division entre 7 y 2 con int seria " + divisionEntera);
	        System.out.println("El modulo entre 7/2 es " + moduclo);
	        System.out.println("La division real de 7/2 con double es " + divisionReal);
	        
	        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++\n");

	        
	        //operador de incremento y decremento
	        
	        System.out.println("aqui vamos a usar los operadores ++ y -- para" + 
	        "incrementar o decrementar");
	        int n = 7;

	        System.out.println("1) n: " + n);
	        System.out.println("2) ++n " + ++n);
	        System.out.println("3) n: " + n);
	        System.out.println("4) n++ " + n++);
	        System.out.println("5) n: " + n);
	        
	        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++\n");
	        
	        
	        //PRECEDENCIA DE LOS OPERADORES
	        
	        int nA = 0;
	        int nX = 6;
	        int nY = 2;
	        int nZ = 4;

	        System.out.println("no es la mismo (a = x + y -2 / 2 + z) = " + (nA = nX + nY - 2 / 2 + nZ));

	        System.out.println("que (a = x + (y - 2 ) / (2 + z)) = " + (nA = nX + (nY - 2) / (2 + nZ)));
	        
	        
	        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++\n");
	        
	        
	        //OPERADORES LOGICOS
	        
	        System.out.println("vamos a ver los siguientes operadores logicos && - || - !");
	        System.out.println("1) AND: " + (siempreCierto() && siempreFalso()));
	        System.out.println("2) AND: " + (siempreFalso() && siempreCierto()));
	        System.out.println("3) OR: " + (siempreCierto() || siempreFalso()));
	        System.out.println("4) OR: " + (siempreFalso() || siempreCierto()));
		
	        /*
	         * EN LA PARTE DE ABAJO LO QUE SE VEN SON LOS METODOS QUE CREAMOS PARA HACER ESTE EJERCICIO
	         * */
		
		
		
		
	}
	//METODOS CREADOR PARA VER LA LOGICA DE LOS OPERADORES LOGICOAS
	private static boolean siempreCierto() {
		System.out.println("siempreCierto");
		return true;
	}
	
	
	private static boolean siempreFalso() {
		System.out.println("siempreFalso");
		return false;
	}
	
	
	
	
	
	
	

}
