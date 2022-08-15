import java.util.Scanner;
import java.lang.Math;

/*
 * Descripcion del programa: 
 * La clase SimuladorPrestamo es un programa que, haciendo uso de formulas financieras, permite calcular e
 * imprimir por consola el valor que el usuario debe pagar periódicamente, de acuerdo al monto prestado, un
 * numero de periodos y la tasa de interes periodica dados por el usuario.
 * 
 * Entradas: double prestamo, int anosPrestamo, double tasa
 * Salidas: double cuotaMensual, double cuotaMensualRedondeada
 *
 * Ejemplo: Sean prestamo = 40.000.000, anosPrestamo = 10 y tasa = 0,01
 * Mensaje de por consola: 
 * 		El valor de la cuota mensual es: 573883.7936103493
 *      El valor de la cuota mensual (redondeado al peso mas cercano): 573884.0
 */
public class SimuladorPrestamo {
	
	public static void main(String[] args) {
        
		Scanner lector = new Scanner(System.in);
					
		System.out.println("Digite a continuacion el monto total del prestamo: ");

		double prestamo = lector.nextDouble();
		
		System.out.println("Digite a continuacion el numero de anios del prestamo: ");

		int anosPrestamo = lector.nextInt();
		
		System.out.println("Digite a continuacion la tasa de interes mensual: ");

		double tasa = lector.nextDouble();
		
		double cuotaMensual = prestamo*((Math.pow((1+tasa),(anosPrestamo*12))*tasa)/((Math.pow((1+tasa),(anosPrestamo*12))-1)));
		
		double cuotaMensualRedondeada = Math.ceil(cuotaMensual);
								
		System.out.println("El valor de la cuota mensual es: "+cuotaMensual);
		
		System.out.println("El valor de la cuota mensual (redondeado al peso mas cercano): "+cuotaMensualRedondeada);
		
    }
}





