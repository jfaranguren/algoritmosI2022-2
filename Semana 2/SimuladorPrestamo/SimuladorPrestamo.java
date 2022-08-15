import java.util.Scanner;
import java.lang.Math;

/**
 *<pre>
 *<strong>Descripción del programa: </strong>
 * La clase SimuladorPrestamo es un programa que, haciendo uso de formulas financieras, permite calcular e
 * imprimir por consola el valor que el usuario debe pagar periódicamente, de acuerdo al monto prestado, un
 * numero de periodos y la tasa de interes periodica dados por el usuario.
 * 
 * <strong>Entradas:</strong> double prestamo, int anosPrestamo, double tasa
 * <strong>Salidas:</strong> double cuotaMensual, double cuotaMensualRedondeada
 *
 * <strong>Ejemplo:</strong> Sean prestamo = 40.000.000, anosPrestamo = 10 y tasa = 0,01
 
 * <strong>Mensaje de retorno por consola:</strong> 
 * 		El valor de la cuota mensual es: 573883.7936103493
 *      El valor de la cuota mensual (redondeado al peso mas cercano): 573884.0
 *</pre>
 */
public class SimuladorPrestamo{
	
	public static void main(String[] args) {
        
		Scanner lector = new Scanner(System.in);
					
		System.out.println("Digite a continuacion el monto total del prestamo: ");

		double prestamo = lector.nextDouble();
		
		System.out.println("Digite a continuacion el numero de anios del prestamo: ");

		int anosPrestamo = lector.nextInt();
		
		System.out.println("Digite a continuacion la tasa de interes mensual: ");

		double tasa = lector.nextDouble();
		
		double cuotaMensual = calcularCuota(prestamo,anosPrestamo,tasa);
		
		double cuotaMensualRedondeada = Math.ceil(cuotaMensual);
								
		System.out.println("El valor de la cuota mensual es: "+cuotaMensual);
		
		System.out.println("El valor de la cuota mensual (redondeado al peso mas cercano): "+cuotaMensualRedondeada);
		
    }
	
	/**<pre>
	 *<strong>Descripcion:</strong> El metodo calcularCuota permite obtener el monto mensual a pagar, 
	 *dado el monto total del prestamo, el numero de años del prestamo y la tasa de interés mensual
	 *<strong>pre:</strong> No aplica
	 *<strong>pos:</strong> No aplica
	 *@param prestamo <strong>double</strong> Prestamo que el usuario va a solicitar
	 *@param anoPrestamo <strong>double</strong> Numero de años en los que el usuario planea pagar el prestamo
	 *@param tasa <strong>double</strong> Tasa de interes mensual proporcionada por el banco a determinada periodicidad
	 *@return cuotaMensual <strong>double</strong> Valor de la cuota mensual que el usuario debe pagar
	 *</pre>
	*/
	public static double calcularCuota(double prestamo, int anosPrestamo, double tasa){
	
	double cuotaMensual = 0;
	
	cuotaMensual = prestamo*((Math.pow((1+tasa),(anosPrestamo*12))*tasa)/((Math.pow((1+tasa),(anosPrestamo*12))-1)));
		
	return cuotaMensual;
	
	}
	
}





