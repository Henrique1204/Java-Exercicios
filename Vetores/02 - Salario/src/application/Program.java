package application;

import java.util.Locale;
import java.util.Scanner;
import entidades.Funcionario;

public class Program
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos funcion�rios voc� quer cadastrar: ");
		int n = sc.nextInt();

		Funcionario[] funcionarios = new Funcionario[n];
		int[] ids = new int[n];

		for(int i = 0; i < funcionarios.length; i++)
		{
			System.out.println("\nFuncionario #" + (i + 1) + ":");

			System.out.print("Id: ");
			int id = sc.nextInt();

			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("Sal�rio: ");
			double salario = sc.nextDouble();

			funcionarios[i] = new Funcionario(id, nome, salario);
			ids[i] = id;
		}

		System.out.print("\nEm qual funcion�rio voc� quer dar um aumento: ");
		int idAumento = sc.nextInt();

		boolean encontrado = true;
		for(int i = 0; i < funcionarios.length; i++)
		{
			if(funcionarios[i].getId() == idAumento)
			{
				encontrado = false;
				funcionarios[i].aumentarSalario();
			}
		}

		if(encontrado)
		{
			System.out.println("Funcion�rio n�o existe.");
		}

		System.out.println("\nListas dos funcion�rios:");
		for(int i = 0; i < ids.length; i++)
		{
			for(int j = 0; j < funcionarios.length; j++)
			{
				if(ids[i] == funcionarios[j].getId())
				{
					System.out.println(funcionarios[j].toString());
				}
			}
		}

		sc.close();
	}
}