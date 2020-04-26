import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o código do produto: ");
		int cod = sc.nextInt();
		
		System.out.print("Digite a quantidade de produtos: ");
		int qnt = sc.nextInt();
		
		if(cod == 1)
		{
			System.out.print("Você comprou " + qnt + " Cachorro(s) quente(s), valor da compra: R$ " + (qnt * 4));
		}
		else if( cod == 2 )
		{
			System.out.print("Você comprou " + qnt + " X-Salada(s), valor da compra: R$ " + (qnt * 4.5));
		}
		else if( cod == 3 )
		{
			System.out.print("Você comprou " + qnt + " X-Bacon(s), valor da compra: R$ " + (qnt * 5));
		}
		else if( cod == 4 )
		{
			System.out.print("Você comprou " + qnt + " Torrda(s) simples, valor da compra: R$ " + (qnt * 2));
		}
		else
		{
			System.out.print("Você comprou " + qnt + " Refigerante(s), valor da compra: R$ " + (qnt * 1.5));
		}
		
		sc.close();
	}
}
