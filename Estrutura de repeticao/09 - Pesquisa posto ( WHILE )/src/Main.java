import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("VOTE NAS OPÇÕES ABAIXAO:");
		System.out.println("1. Álcool");
		System.out.println("2. Gasolina");
		System.out.println("3. Diesel");
		System.out.println("4. Fim");
		int voto = sc.nextInt();
		int al = 0, gas = 0, di = 0;

		while(voto != 4)
		{
			switch(voto) {
				case 1:
					al++;
				break;
				case 2:
					gas++;
				break;
				case 3:
					di++;
				break;
				default:
					System.out.println("Valor inválido");
				break;
			}

			voto = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO!");
		System.out.println("RESULTADOS");
		System.out.println("Álcool: " + al);
		System.out.println("Gasolina: " + gas);
		System.out.println("Diesel: " + di);
	}
}
