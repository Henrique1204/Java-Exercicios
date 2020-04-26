import java.util.Locale;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o seu salário: ");
		double sal = sc.nextDouble();

		if( sal <= 2000.00 )
		{
			System.out.print("Você está isento do imposto");
		}
		else if( sal <= 3000.00 )
		{
			double imp = (sal - 2000) * 0.08;
			System.out.printf("Você deverá pagar R$ %.2 de imposto", imp);
		}
		else if( sal <= 4500 )
		{
			double imp = (sal - 3000) * 0.18  + 1000 * 0.08;
			System.out.printf("Você deverá pagar R$ %.2f de imposto", imp);
		}
		else
		{
			double imp = (sal - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
			System.out.printf("Você deverá pagar R$ %.2f de imposto", imp);
		}

		sc.close();
	}
}
