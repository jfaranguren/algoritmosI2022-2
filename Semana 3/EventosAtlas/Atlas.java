import java.util.Scanner;

public class EventosAtlas {

	public static Scanner lector = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Bienvenido a eventos ATLAS");

		double paqueteBase = registrarPaqueteBase();

		System.out.println("\nEl costo del paquete base es de: $ " + paqueteBase);

		System.out.println("\n¿Para cuántas personas es el paquete?");
		int personas = lector.nextInt();

		if (personas < 1) {
			System.out.println(
					"El número de personas no puede ser menor a 1, se ha asignado el número mínimo posible: 1");
			personas = 1;
		}
		paqueteBase *= personas;

		System.out.println("\nEl costo del paquete para " + personas + " personas es de: $ " + paqueteBase);

		double descuentoVolumen = calcularDescuentoVolumen(personas) * paqueteBase;

		System.out.println("\nEl descuento para " + personas + " personas es de: $ " + (-descuentoVolumen));

		System.out.println("\n¿Deseas mejorar tu paquete a VIP?\n 1. Si\n 2. No");
		int vip = lector.nextInt();

		double incrementoVIP = 0;

		if (vip == 1) {
			incrementoVIP = 0.25 * paqueteBase;
			System.out.println("El incremento VIP es de: $ " + incrementoVIP);
		}

		double montoIncrementosDecrementos = paqueteBase - descuentoVolumen + incrementoVIP;

		System.out.println("\nEl subtotal a pagar es de: $ " + montoIncrementosDecrementos);

		// Costo Servicio
		double incrementoServicio = montoIncrementosDecrementos * 0.15;

		System.out.println("\nEl costo del servicio es de: $ " + incrementoServicio);

		// Monto Total a Pagar
		double montoTotalAPagar = montoIncrementosDecrementos + incrementoServicio;

		System.out.println("\nEl total de su factura es de: $" + montoTotalAPagar);

	}

	public static double registrarPaqueteBase() {

		double montoTransporte = 0, montoHospedaje = 0;

		System.out.println("\nDigite el numero de noches de estadía en Cali");
		int nochesEstadia = lector.nextInt();

		if (nochesEstadia <= 0) {
			System.out.println("Debe ingresar un número de noches válido, por defecto se ha asignado el mínimo: 1");
			nochesEstadia = 1;
		} else if (nochesEstadia > 6) {
			System.out.println("Debe ingresar un número de noches válido, por defecto se ha asignado el máximo: 6");
			nochesEstadia = 6;
		}

		montoHospedaje += 100000 * nochesEstadia;

		if (nochesEstadia == 6) {

			montoHospedaje -= montoHospedaje * 0.1;

		}

		System.out.println("\nDigite el tipo de transporte de su preferencia: \n 1. Avión\n 2. Bus");
		int transporte = lector.nextInt();

		System.out.println("\nDigite el tipo de viaje: \n 1. Solo ida\n 2. Ida y vuelta");
		int tipoViaje = lector.nextInt();

		if (transporte == 1) {
			montoTransporte += 150000 * tipoViaje;

		} else if (transporte == 2) {

			montoTransporte += 90000 * tipoViaje;

		} else if (transporte > 2 || transporte < 1) {
			System.out.println("Debe seleccionar un tipo de transporte valido, por defecto se ha asignado Avión");
			montoTransporte += 150000 * tipoViaje;
		}

		return montoTransporte + montoHospedaje;

	}

	public static double calcularDescuentoVolumen(int personas) {

		double descuento = 0;

		if (personas >= 12) {
			descuento = 0.2;
		} else if (personas >= 9) {
			descuento = 0.15;
		} else if (personas >= 6) {
			descuento = 0.10;
		} else if (personas >= 3) {
			descuento = 0.05;
		} else {
			descuento = 0;
		}

		return descuento;

	}

}
