package ui;

/**
*Descripcion: Es un programa que genera una factura del plan petronio del la compañia Eventos Atlas 
*pre: no aplica
*pos: no aplica
*/

import java.util.Scanner;

public class BARONA_PUENTE{
	public static void main (String[] args){
	Scanner ac = new Scanner(System.in);
	System.out.println("");
	System.out.println("");
	System.out.println("     BIENVENIDOS A EVENTOS ATLAS      ");
	System.out.println("  Atendidos por Carolina, CEO eventos Atlas");
	System.out.println("-------------------------------------------------");
	System.out.println("");
	System.out.println("	PLAN PETRONIO");
	System.out.println("");
	System.out.println("	-HOSPEDAJE");
	System.out.println("La noche en el hotel Historico tiene un valor de $100.000  ");
	System.out.println("	* si se reserva el hospejade por 6 dias, se le aplicará un descuento de 10 % sobre el total a pagar por concepto de hospedaje ");
	System.out.println("");
	System.out.println("	-TRANSPORTE");
	System.out.println("plan ida y vuelta avion/bus $90.000");
	System.out.println("plan solo ida avion/bus $150.000");
	System.out.println("-------------------------------------------------");
	System.out.println("	PLAN PETRONIO   VIP");
	System.out.println("");
	System.out.println("ncluye la posibilidad de contar con acceso preferencial al evento, un espacio de descanso entre las actividades culturales y conciertos y acceso a comida y bebidas exclusivas");
	System.out.println(" ");
	System.out.println("*para adquirir este plan tienes que pagar el 25% adicional del plan base");
	System.out.println("-------------------------------------------------");
	System.out.println(" ");
	System.out.println(" DESCUENTO POR FIESTA: por traer 5 personas tiene 5% de descuento");
	System.out.println(" *Descuento maximo de 12 personas (15%)");
	System.out.println("-------------------------------------------------");
	System.out.println(" ");
	System.out.println(" ¿Desea elegir el plan?");
	System.out.println(" [s] si");
	System.out.println(" [n] no ");
	String yn= ac.nextLine(); 
	/* 
	*Descripcion: El switch es para definir si la persona esta interesado en adquirir el plan, si no esta interesada, el programa se cierra
	*
	*/
	
	double b1 =0;
	double p =0;
	
	switch (yn.charAt(0)){
		case 's':
		System.out.println("¿cuantas personas van?");
		int a=ac.nextInt();
		
		if (a==3){
			p= 0.05;
			String pt=(" Descuento del 5%");
			}
			else if (a==6){
				p= 0.10;
				String pt=(" Descuento del 10%");
			}
			else if (a==9){
				p= 0.15;
				String pt=(" Descuento del 15%");
			}
			else if (a==12){
				p= 0.20;
				String pt=(" Descuento del 20%");
			}
		else {
			String pt=(" Descuento del 0");
		}
		
		
		System.out.println("¿cuantas noches se van a quedar?");
		int b= ac.nextInt();
		if (b>0){
			if (b==6){
				b1= hops(b)*0.10;
			}
			else {
				b1= hops(b);
			}
		
			System.out.println("¿Iran en bus o avion?");
			ac.nextLine();
			String tr= ac.nextLine(); //aqui no me quiere funcionar el scanner para que el usuario digite 
			System.out.println(" ");
			
			
			System.out.println(" 			FACTURA			");
			System.out.println("-------------------------------------------------");
			System.out.println(" ");
			System.out.println(" Resumen");
			System.out.println(" plan petronio ");
			System.out.println(" ");
			System.out.println(" Dias de alojamiento: "+b); 
			System.out.println("costo de "+b1); //no entiendo por que no me quiere leer la variable cuando la intento colocar 
			System.out.println(" Descuento del:  "  );
			System.out.println(" transporte "+ tr);
			System.out.println(" costo del servicio ");
			System.out.println("-------------------------------------------------");
			System.out.println(" TOTAL " +total(a,b1,p) );
			
			
		}
		else{
		System.out.println(" tiene que quedarse al menos una noche en el hotel");
		System.out.println(" plan cancelado");
		System.out.println(" Comienza de nuevo");
		System.exit(0);
		}
		
		
		break;
		
		case 'n':
		System.out.println("Muchas gracias, hasta luego");
		System.exit(0);
		break;
	}
	}
	
	
		
	
	
	
	
	
	
	/**
	*Descripcion: este metodo consiste en multiplicar la cantidad de dias por el costo de hospedaje 
	*pre: no aplica
	*pos: no aplica
	*@param double b  es el numero de dias
	*@return double c es el costo de total del numero de dias que se van a hospedar 
	*/
	
	public static double hops(double b){
		double c= (b*100000);
		return c;
	}
	/**
	*Descripcion: este metodo consiste en asignarle el valor de ida y vuelta  
	*pre: no aplica
	*pos: no aplica
	*@param double a  es 
	*@return double c es el costo de total del numero de dias que se van a hospedar 
	*/
	public static double trans1 (double a){
		double d= 90000;
		return d;
	}
	/**
	*Descripcion: este metodo consiste en asignarle el valor de ida 
	*pre: no aplica
	*pos: no aplica
	*@param double a  es 
	*@return double e es el costo de total del numero de dias que se van a hospedar 
	*/
	public static double trans2 (double a){
		double e= 150000;
		return e;
	}
	public static double total(double a, double b1, double p){
		double tot=a+b1+p;
		return tot;
	}
}


/*
Hola profe, le voy a ser sincero, tuve varios problemas con el codigo, no se en realidad que es lo que pasa,
 cuando quiero que el usuario digite algo, el scanner no interactuta, o cuando quiero llamar una variable para que se ejecute,
 me sale que no encuentra el simbolo y este problema lo e estado analizando ya varias veces pero no encuentro solucion alguna.
 
 Yo se que al no funcionar correctamente el codigo, me va a bajar la nota, pero mas que eso, me gustaria saber como seria la mejor 
 manera de desarollar este problema, mas que todo para yo aprender, hay alguna posibilidad que me pueda hacer una retroalimentacion,
 ya sea viendo el codigo de algun estudiante o el suyo 
 
 muchas gracias 
*/