package bucle;

public class DoWhile {
	public static void main(String[] args) {
		int X = 0;
		int Y = 0;
		do {
			X++;
			if (X % 2 == 0) {
				System.out.println(X);
			}
		} while (X < 100);

		do {
			Y++;
			if (Y % 2 == 1) {
				System.out.println(Y);
			}
		} while (Y < 100);
	}
}
