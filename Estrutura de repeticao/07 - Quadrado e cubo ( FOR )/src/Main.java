import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número: ");
		int num = sc.nextInt();

		for(int i = 1; i <= num; i++)
		{
			System.out.print(i + " ");
			System.out.print(i * i + " ");
			System.out.println(i * i * i);
		}

		sc.close();
	}
}