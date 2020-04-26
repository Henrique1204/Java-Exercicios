import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int numA = sc.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int numB = sc.nextInt();
		
		if(numA % numB == 0 || numB % numA == 0)
		{
			System.out.print(numA + " e " + numB + " são múltiplos");
		}else
		{
			System.out.print(numA + " e " + numB + " não são múltiplos");			
		}
		
		sc.close();
	}
}
