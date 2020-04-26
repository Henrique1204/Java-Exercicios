import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número final: ");
		int fim = sc.nextInt();

		for(int i = 1; i <= fim; i += 2) {
			System.out.println(i);
		}
		
		sc.close();
	}
}