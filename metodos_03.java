package es.ProgramasInstagram.Diario;

public class metodos_03 {

	public static void main(String[] args) {
		//vamos a crear un metodo
		
		System.out.println("en este programa vamos a sumar con un metodo");
		
		int num1 = 4;
		
		int num2 = 2;
					
					//llamamos al metodo que se llama suma
		int total = suma(num1 , num2);
		
		System.out.println("La suma de " + num1 +  " + " + num2 + " es igual a " + total);
		System.out.println("\nEste es un programa muy facil que mas adelante vamos a mejorar");
		

	}
	
	//declaramos el metodo
	public static int suma (int a, int b) {
		return a + b;
	}

}
