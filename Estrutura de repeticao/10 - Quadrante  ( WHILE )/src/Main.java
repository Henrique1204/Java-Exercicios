import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a coordenada X: ");
		double x = sc.nextDouble();

		System.out.print("Digite a coordenada Y: ");
		double y = sc.nextDouble();

		while(x != 0 && y != 0)
		{
			if ( x > 0 && y > 0 )
			{
				System.out.println("Você está no quadrante 1");
			}
			else if ( x < 0 && y > 0 )
			{
				System.out.println("Você está no quadrante 2");
			}
			else if ( x < 0 && y < 0 )
			{
				System.out.println("Você está no quadrante 3");
			}
			else
			{
				System.out.println("Você está no quadrante 4");
			}

			System.out.print("Digite a coordenada X: ");
			x = sc.nextDouble();

			System.out.print("Digite a coordenada Y: ");
			y = sc.nextDouble();
		}

		sc.close();
	}
}