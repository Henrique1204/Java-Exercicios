package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;
import entidades.Estudante;

public class Program {
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String[] quartos = new String[10];
		Arrays.fill(quartos, "vazio");

		System.out.print("Digite o núemro de estudantes (de 1 a 10): ");
		int n = sc.nextInt();

		Estudante[] estudantes = new Estudante[n];

		for(int i = 0; i < estudantes.length; i++)
		{
			
			System.out.println("\nEstudante #" + (i + 1));
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("E-mail: ");
			String email = sc.next();
	
			System.out.print("Quarto: ");
			int numeroQuarto = sc.nextInt();
	
			quartos[numeroQuarto] = "ocupado";

			estudantes[i] = new Estudante(nome, email, numeroQuarto);
		}

		System.out.println("\n");

		for(int i = 0; i < quartos.length; i++)
		{
			if(quartos[i].equals("ocupado"))
			{
				for(int j = 0; j < estudantes.length; j++)
				{
					if(estudantes[j].getNumeroQuarto() == i)
					{
						System.out.println(estudantes[j].toString());
					}
				}
			}
		}

		sc.close();
	}
}