import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número de repetições: ");
		int fim = sc.nextInt();

		for(int i = 0; i < fim; i ++) {
			System.out.print("Digite o primeiro número: ");
			double num1 = sc.nextDouble();

			System.out.print("Digite o segundo número: ");
			double num2 = sc.nextDouble();
			
			if(num2 == 0)
			{
				System.out.println("Divisão impossível");
			}
			else
			{
				double divi = num1 / num2;
				System.out.printf("%.1f%n", divi);
			}
		}		

		sc.close();
	}
}