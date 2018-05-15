package ejercicio;


public class Foocorporation {
	int horasTrabajadas;
	int basePorHora;
	int horasExtras;
	double multiplicador = 1.5;

	public static void main(String[] args) {
		
		salario (50,200,1.5,10);
		
		//Scanner input = new Scanner(System.in);
		//System.out.println("Ingrese la cantidad de horas trabajadas: ");
		//int horasTrabajadas = input.hashCode();
		//System.out.println("Ingrese la cantidad de dinero por hora: ");
		//int basePorHora = input.hashCode();
		//System.out.println("Horas extras que trabajo: ");
		//int horasExtras = input.hashCode();
	}

	public static void salario(int horasTrabajadas, int basePorHora, double multiplicador, int horasExtras) {
		int sueldo = horasTrabajadas*basePorHora; 
		if (horasTrabajadas > 60) {
			System.out.println("Capaz deberia tomarse un descansito ");
		} if (horasTrabajadas < 40) {
			System.out.println("Su sueldo debe ser: " + horasTrabajadas * basePorHora);
		} if (horasTrabajadas >= 40 && horasTrabajadas <= 60) {
			System.out.println("Su sueldo debe ser: " + (sueldo + (horasExtras*multiplicador)));
		}
	}
}
