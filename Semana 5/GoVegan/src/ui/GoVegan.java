package ui;

import java.util.Scanner;

/**
 * <pre>
 * <strong>Descripción del programa: </strong> La clase
 * GoVegan es un programa que permite al usuario registrar sus
 * consumos alimenticios por porcion y cantidades, comparar sus 
 * consumos contra unos maximos establecidos, para tres tipos de alimentos
 * y generar mensajes de alerta al usuario.
 * 
 * <strong>Inputs:</strong> int opcionPrincipal, int opcionAlimento, double
 * cantidadPorcion <strong>Outputs:</strong> Mensajes por consola para el
 * Menu, la informacion de los consumos y mensajes de alerta
 * </pre>
 */
public class GoVegan {

	public static Scanner lector = new Scanner(System.in);

	private final static double CONSUMO_MAXIMO_GRASAS = 5.0;
	private final static double CONSUMO_MAXIMO_FRUTAS = 125.0;
	private final static double CONSUMO_MAXIMO_VEGETALES = 250.0;

	private final static int PORCIONES_SUGERIDAS_GRASAS = 2;
	private final static int PORCIONES_SUGERIDAS_FRUTAS = 2;
	private final static int PORCIONES_SUGERIDAS_VEGETALES = 4;

	public static double consumo_Grasas = 0;
	public static double consumo_Frutas = 0;
	public static double consumo_Vegetales = 0;

	public static int porciones_Grasas = 0;
	public static int porciones_Frutas = 0;
	public static int porciones_Vegetales = 0;

	public static void main(String[] args) {

		desplegarMenuPrincipal();
	}

	/**
	 * <pre>
	 *<strong>Descripcion:</strong> El metodo desplegarMenuPrincipal presenta al usuario las funcionalidades del programa,
	 *permitiendole seleccionar alguna e invocando los metodos asociados a cada funcionalidad
	 *<strong>pre:</strong> lector <strong>Scanner</strong> debe estar inicializado
	 *<strong>pos:</strong> No aplica
	 * </pre>
	 */
	public static void desplegarMenuPrincipal() {

		System.out.println("Bienvenido a GoVegan");

		boolean parada = false;

		do {

			System.out.println("\nDigite una opción");
			System.out.println("1. Registrar consumo alimentario");
			System.out.println("0. Salir");

			int opcionPrincipal = lector.nextInt();

			switch (opcionPrincipal) {

			case 1:

				while (!parada) {
					System.out.println("\nDigite el tipo de alimento");
					System.out.println("1. Grasas");
					System.out.println("2. Frutas");
					System.out.println("3. Vegetales");
					int opcionAlimento = lector.nextInt();

					if (opcionAlimento == 1 || opcionAlimento == 2 || opcionAlimento == 3) {
						parada = true;
						registrarConsumoAlimentario(opcionAlimento);
					} else {
						System.out.println("Debe digitar un tipo de alimento válido");
					}

				}
				parada = false;
				break;
			case 0:
				System.out.println("Gracias por preferirnos! Adios.");
				parada = true;
				break;
			default:
				System.out.println("Debe digitar una opción válida");
				break;

			}

		} while (!parada);

	}

	/**
	 * <pre>
	 *<strong>Descripcion:</strong> El metodo registrarConsumoAlimentario permite registrar la informacion 
	 *sobre el consumo de los alimentos en la dieta del usuario
	 *<strong>pre:</strong> lector <strong>Scanner</strong> debe estar inicializado
	 *<strong>pre:</strong> consumo_Grasas <strong>double</strong> debe estar inicializada
	 *<strong>pre:</strong> consumo_Frutas <strong>double</strong> debe estar inicializada
	 *<strong>pre:</strong> consumo_Vegetales <strong>double</strong> debe estar inicializada
	 *<strong>pre:</strong> porciones_Grasas <strong>int</strong> debe estar inicializada
	 *<strong>pre:</strong> porciones_Frutas <strong>int</strong> debe estar inicializada
	 *<strong>pre:</strong> porciones_Vegetales <strong>int</strong> debe estar inicializada
	 *&#64;param tipoAlimento <strong>int</strong> Código del alimento a registrar, 1. Grasas, 2. Frutas, 3. Vegetales
	 * </pre>
	 */
	public static void registrarConsumoAlimentario(int tipoAlimento) {

		System.out.println("Digite la cantidad de alimento consumida (ml)");
		double cantidad = lector.nextDouble();

		switch (tipoAlimento) {

		case 1:
			consumo_Grasas += cantidad;
			porciones_Grasas++;
			alertas(tipoAlimento);
			break;

		case 2:
			consumo_Frutas += cantidad;
			porciones_Frutas++;
			alertas(tipoAlimento);
			break;

		case 3:
			consumo_Vegetales += cantidad;
			porciones_Vegetales++;
			alertas(tipoAlimento);
			break;
		}

	}

	/**
	 * <pre>
	 *<strong>Descripcion:</strong> El metodo alertas permite generar mensajes de alertas al usuario 
	 *dependiendo de los registros realizados al usuario y las recomendaciones de consumo maximo y porciones
	 *<strong>pre:</strong> consumo_Grasas <strong>double</strong> debe estar inicializada
	 *<strong>pre:</strong> consumo_Frutas <strong>double</strong> debe estar inicializada
	 *<strong>pre:</strong> consumo_Vegetales <strong>double</strong> debe estar inicializada
	 *<strong>pre:</strong> CONSUMO_MAXIMO_GRASAS <strong>double</strong> debe estar inicializada
	 *<strong>pre:</strong> CONSUMO_MAXIMO_FRUTAS <strong>double</strong> debe estar inicializada
	 *<strong>pre:</strong> CONSUMO_MAXIMO_VEGETALES <strong>double</strong> debe estar inicializada
	 *<strong>pre:</strong> porciones_Grasas <strong>int</strong> debe estar inicializada
	 *<strong>pre:</strong> porciones_Frutas <strong>int</strong> debe estar inicializada
	 *<strong>pre:</strong> porciones_Vegetales <strong>int</strong> debe estar inicializada
	 *<strong>pre:</strong> PORCIONES_SUGERIDAS_GRASAS <strong>int</strong> debe estar inicializada
	 *<strong>pre:</strong> PORCIONES_SUGERIDAS_FRUTAS <strong>int</strong> debe estar inicializada
	 *<strong>pre:</strong> PORCIONES_SUGERIDAS_VEGETALES <strong>int</strong> debe estar inicializada
	 * </pre>
	 */
	private static void alertas(int tipoAlimento) {

		switch (tipoAlimento) {

		case 1:

			System.out.println("Has consumido " + porciones_Grasas + " porcion de Grasas el dia de hoy");
			if (porciones_Grasas > PORCIONES_SUGERIDAS_GRASAS) {
				System.out.println("Has superado el numero de porciones de grasa diarias recomendadas");
			}
			if (consumo_Grasas > CONSUMO_MAXIMO_GRASAS) {
				System.out.println("Has superado el consumo diario maximo de grasas. ¡Revisa tu dieta!");
			}
			break;

		case 2:

			System.out.println("Has consumido " + porciones_Frutas + " porcion de Frutas el dia de hoy");
			if (porciones_Frutas > PORCIONES_SUGERIDAS_FRUTAS) {
				System.out.println("Has superado el numero de porciones de frutas diarias recomendadas");
			}
			if (consumo_Frutas > CONSUMO_MAXIMO_FRUTAS) {
				System.out.println("Has superado el consumo diario maximo de frutas. ¡Revisa tu dieta!");
			}
			break;

		case 3:

			System.out.println("Has consumido " + porciones_Vegetales + " porcion de Vegetales el dia de hoy");
			if (porciones_Vegetales > PORCIONES_SUGERIDAS_VEGETALES) {
				System.out.println("Has superado el numero de porciones de vegetales diarias recomendadas");
			}
			if (consumo_Vegetales > CONSUMO_MAXIMO_VEGETALES) {
				System.out.println("Has superado el consumo diario maximo de vegetales. ¡Revisa tu dieta!");
			}
			break;
		}

	}

}
