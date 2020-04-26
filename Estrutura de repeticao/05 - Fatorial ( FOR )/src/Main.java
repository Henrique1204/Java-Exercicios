import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fat = 1;

		System.out.print("Digite o número: ");
		int num = sc.nextInt();

		for(int i = 1; i <= num; i++ ) {
			fat *= i;
		}

		System.out.print(fat);

		sc.close();
	}
}