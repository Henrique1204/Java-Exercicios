import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a senha: ");
		int senha = sc.nextInt();

		while(senha != 2002)
		{
			System.out.println("Senha errada!");

			System.out.print("Digite a senha novamente: ");
			senha = sc.nextInt();
		}

		System.out.print("Login conclu�do");

		sc.close();
	}
}
