import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de testes: ");
		int fim = sc.nextInt();

		for(int i = 0; i < fim; i++) {
			System.out.print("Digite primeiro número: ");
			double a = sc.nextDouble();

			System.out.print("Digite segundo número: ");
			double b = sc.nextDouble();

			System.out.print("Digite terceiro número: ");
			double c = sc.nextDouble();

			double calc = (a * 2 + b * 3 + c * 5) / 10;

			System.out.printf("%.1f%n", calc);
		}
		
		sc.close();
	}
}