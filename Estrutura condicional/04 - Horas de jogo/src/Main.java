import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o hor�irio do �nicio: ");
		int ini = sc.nextInt();
		
		System.out.print("Digite o hor�rio do fim: ");
		int fim = sc.nextInt();
		
		if(ini < fim)
		{
			System.out.print("O jogo durou " + (fim - ini) + " hora(s)");
		}
		else
		{
			System.out.print("O jogo durou " + (24 - ini + fim) + " hora(s)");
		}
		
		sc.close();
	}
}
