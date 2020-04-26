import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = 0, out = 0;
		
		System.out.print("Digite a quantidade de números que quer ler: ");
		int limite = sc.nextInt();

		for(int i = 0; i < limite; i++) {
			System.out.print("Digite o número: ");
			int num = sc.nextInt();

			in += num >= 10 && num <= 20 ? 1 : 0; 
			out += num >= 10 && num <= 20 ? 0 : 1; 
		}
		
		System.out.println(in + " in");
		System.out.print(out + " out");
		
		sc.close();
	}
}