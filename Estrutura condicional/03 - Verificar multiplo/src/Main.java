import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		int numA = sc.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		int numB = sc.nextInt();
		
		if(numA % numB == 0 || numB % numA == 0)
		{
			System.out.print(numA + " e " + numB + " s�o m�ltiplos");
		}else
		{
			System.out.print(numA + " e " + numB + " n�o s�o m�ltiplos");			
		}
		
		sc.close();
	}
}
