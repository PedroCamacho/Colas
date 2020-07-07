import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Reto {
	static java.util.Scanner in;

	public static void main(String[] args) {
		// Inicializaci�n
		Queue<Integer> bolas = new ArrayDeque<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("�Cu�ntas bolas de golf tiene? ");
		int numBolas = sc.nextInt();
		System.out.print("�Cada cu�nto tira una al lago? ");
		int alAgua = sc.nextInt();

		// Proceso
		for (int i = 0; i < numBolas; i++)
			bolas.offer(i + 1);

		while (bolas.size() != 1) {
			for (int j = 1; j < alAgua; j++)
				bolas.offer(bolas.poll());
			System.out.println("Se pierde la bola: " + bolas.poll());
		}

		// Salida
		System.out.println("La �ltima bola es la: " + bolas.peek());
	}
}