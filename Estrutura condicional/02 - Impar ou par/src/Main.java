import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número: ");
		int num = sc.nextInt();
		
		if ( num % 2 == 0 )
		{
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
		
		sc.close();
	}
}
