import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número: ");
		int x = sc.nextInt();
		
		if( x < 0 )
		{
			System.out.print("Negativo");
		}
		else
		{
			System.out.print("Positivo");
		}
		
		sc.close();
	}
}