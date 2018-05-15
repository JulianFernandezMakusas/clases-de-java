package ejercicio;

public class Ejercicio4 {

	public static void main(String[] args) {

		String[] corredores = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "Jhon", "James",
				"Jane", "Emily", "Daniel", "Neds", "Aaron", "Kate" };

		int[] tiempo = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };

		for (int i = 0; i <= corredores.length; i++) {
			System.out.println(corredores[i] + ":" + tiempo[i]);
		}
		System.out.println("Corredor: " + corredores);
		System.out.println("Tiempo: " + tiempo);

		int posMin = 0;
		int TiempoMin = tiempo[0];

		for (int i = 0; i < tiempo.length; i++) {
			if (TiempoMin < tiempo[i]) {

			} else {
				TiempoMin = tiempo[i];
				posMin = i;
			}
		}
		System.out.println("El corredor mas rapido fue: " + corredores[posMin] + tiempo[TiempoMin]);
	}
}