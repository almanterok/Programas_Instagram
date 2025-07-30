package es.ProgramasInstagram.Diario;
import java.util.*;
public class A06Practica {

	public static void main(String[] args) {
		//entrada
		Scanner entrada = new Scanner(System.in);
		
		String nombreUserEntrada;
		int claveUserEntrada;
		
		
		//variable de opcion, util al momento de pedir al usuario que indique si quiere continuar con otra operacion
		int opcion;
		
		//simulacion de banco
		
		double dineroCuenta = 2567.23;
		
		//el dimero que va a sacer el usuario
		double montoSacar;
		
		//el dinero que va a ingresar el usuario
		double montoIngreso;
		
		int claveUser=1415;
		
		String nombreUser="Fernando";
		
		//Pidiento datos al usuario por pantalla
		
		System.out.println("Clave de la cuenta");
		
		claveUserEntrada=entrada.nextInt();
		
		
		int claveBaseDatos=claveUserEntrada;//aqui guardamos la clave
		
		System.out.println("Tu nombre Usuario");
		
		nombreUserEntrada=entrada.next();
		
		//entrada a la condicion o cuanta bancaria
		if (claveUser==claveUserEntrada && nombreUser.equalsIgnoreCase(nombreUserEntrada)) {
			
			//variable de opcion
			double retirarDinero;
			
			//dando bienvenida a la cuenta
			System.out.println("Bienvenido: " + nombreUser);
			
			//opciones en la cuenta
			System.out.println("Pulsa 1: para sacar dinero \n"
					+ "Pulsa 2 para consultar capital");
			opcion=entrada.nextInt();
			
			//entrada del if a retirar dinero
			if (opcion == 1) {
				//totalCueta es para hacer la resta del dinero a sacar con el que tengo en la cuenta
				double totalCuenta;
				System.out.println("cuanto dinero quieres sacar (use comas no puntos para indicar los decimales)");
				retirarDinero=entrada.nextDouble();
				
				//calculo de la resta, retirar dinero
				
				if(retirarDinero < dineroCuenta) {
					totalCuenta=dineroCuenta - retirarDinero;
					//mostramos resultado en pantalla
					System.out.println("El monto a retirar es de: " + retirarDinero + "€ - Dinero Restante en Cuenta: " + totalCuenta + "€");
					
				}else System.out.println("Fondo insuficiente");
				
				
				
			}
			//opcion 2 para saber cuanto tengo en la cuenta
			else if(opcion == 2) {
				System.out.println("Tu Disponibilidad en cuenta es: " + dineroCuenta);
				
			}
			
			
		}else System.out.println("usuario o contraseña incorecta");
		
		
		//CREAMOS UN NUMERO DE CUENTA ALEATORIO
		
		//variable String para saber si quiere hacer otra operacion
		String siOno;
		
		//pidiendo al usuario si queire hacer otra operacion
		System.out.println("Desea Realizar otra operacion");
		System.out.println("Marcando 'SI' o 'NO' en el teclado");
		
		//pedinos por pantalla
		siOno=entrada.next();
		
		//variable que me permite preguntar y almacenar la nueva clave
		int nuevaClave;
		
		//creamos la condicion
		if (siOno.equalsIgnoreCase("si") && claveUserEntrada==1415 && nombreUserEntrada.equalsIgnoreCase("fernando") ) {
			System.out.println("1 - Para cambiar contraseña");
			System.out.println("2 - Para saber numero de cuenta");
			
			opcion=entrada.nextInt();
			
			if (opcion==1) {
				
				//pidiendo cambio de clave
				System.out.println("Indique su antigua clave");
				claveUserEntrada=entrada.nextInt();
			
				
				
				//creando nueva Clave
				if(claveUserEntrada == claveBaseDatos) {
					System.out.println("Ahora indique su buena clave");
					
					nuevaClave=entrada.nextInt();
					
					System.out.println("Cambio de clave con exito de:" + claveUserEntrada + " a: " + nuevaClave);
					
					
					
				}
				
			}
			else if(opcion==2) {
				long numeroCuenta=(long)Math.floor(Math.random()*9837363527453L);
				System.out.println("tu numero de cuenta: ES-" + numeroCuenta);
				
			}
			
			
		}else System.out.println("Fin de la sesion");
		
		
		
		
		
		
		
		
		
		
		

	}

}
