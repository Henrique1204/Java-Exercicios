import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a coordenada X: ");
		double x = sc.nextDouble();
		
		System.out.print("Digite a coordenada Y: ");
		double y = sc.nextDouble();
		
		String q;
		
		if ( x > 0 && y > 0 )
		{
			q = "no quadrante 1";
		}
		else if ( x < 0 && y > 0 )
		{
			q = "no quadrante 2";
		}
		else if ( x < 0 && y < 0 )
		{
			q = "no quadrante 3";
		}
		else if ( x > 0 && y < 0)
		{
			q = "no quadrante 4";
		}
		else
		{
			q = "na origem";
		}
		
		System.out.print("Você está " + q);
		
		sc.close();
	}

}
