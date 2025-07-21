package es.ProgramasInstagram.Diario;

public class operadoresLogicos {

	public static void main(String[] args) {
		
		//declaramos las variables
		int num1 = 45;
		int num2 = 23;
		double numReal1 = 3.45;
		boolean logiA = true;
		boolean logiB = false;
		boolean logiC;
		boolean logiD = true;
		
		System.out.println("los valores que tenemos son:\n" + 
		 num1 + "\n" +
		 num2 + "\n" +
		 numReal1 + "\n" + 
		 logiA + "\n" + 
		 logiB + "\n");
		
		
		
		//vamos a crear varias condiciones con if
		//IF ELSE - ELSE IF
		if ((num1 + num2) > 20) {
			
			System.out.println("La suma de: " + num1 + " y " + num2 + " es = " + (num1 + num2) );
			System.out.println("por eso si entramos en el primer if");
			
		}else System.out.println("en numero 1 y 2 sumanos no es mayor que 20" + (num1 + num2));
		
		//aqui cambio el valor de LogiC fuera de los bocles para que no me afecte ya que si estan dentro
		//solo los va a cambiar a dentro del bucle y no afuera
		logiC = logica(logiA, logiB);
		
		if (!logiA == logiB && logiD == true) {
			
			if (logiC == true) {// esta linea saltara si el logiC es true
				System.out.println("el valor de logiC es: " + logiC);
				
			}else if (logiC != true) {// esta linea es para que salse si es logiC es false
				System.out.println("el valor de logiC es: " + logiC);
			}
		}else System.out.println("la logica no funciona"); //es lo mas segudo :) que nu funcione
		
		//vamos a usar el if en el double
		
		if (logiC == true) {
			numReal1 = numReal1 / 2;
			System.out.println("el Valor de numReal1 es: " + numReal1);
		}

	}
	
	// aqui prueba si las condiciones con iguales para cambiar el valor de logiC
	private static boolean logica (boolean a, boolean b) {
			return   a != b ;
	}

}
