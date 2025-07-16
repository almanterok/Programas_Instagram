package es.ProgramasInstagram.Diario;

public class TiposDeDatos_02 {

	public static void main(String[] args) {
		//creamos un programa que tenga todos los tipos de datos
		
		//byte
		byte nByte = 100;
		System.out.println("Variable Byte = " + nByte + " desde -128 hasta 127");
		
		//short
		short nShort = 5000;
		System.out.println("Variable short = " +  nShort + " desde -32768 hasta 32767");
		
		//int
		int nInt = 20000; 
		System.out.println("Variable int = " + nInt + " desde -2147483648 hasta 2147483647");
		
		//long
		long nLong = 1000000000000L;
		System.out.println("Variable long = " + nLong + " desde -9223372036854775808 hasta 9223372036854775807");
		
		//float
		float nFloat = 12.34f;
		System.out.println("Variable float = " + nFloat + " desde 3.4e-038 hasta 3.4e+038");
		
		//double
		double nDouble = 45.456786;
		System.out.println("Variable double = " + nDouble + " desde 1.7e-308 hasta 1.7e+308");
		
		//boolean
		boolean variaBoolean = true;
		System.out.println("Variable boolean = " + variaBoolean + " son solo dos valores True o False");
		
		//char
		char letraChar = 'F';
		System.out.println("Variable char = " + letraChar + " almacena solo una sola letra o caracter de ASCII");
		
		//final de la impresion pantalla
		System.out.println("\nEstas serian las variables de Java");

	}

}
