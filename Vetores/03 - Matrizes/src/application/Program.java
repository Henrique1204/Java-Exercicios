package application;

import java.util.Scanner;

public class Program
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número de linhas: ");
		int l = sc.nextInt();

		System.out.print("Digite o número de colunas: ");
		int c = sc.nextInt();

		int[][] matriz = new int[l][c];

		for(int i =0; i < matriz.length; i++)
		{
			System.out.println("\nLinha #" + ( i + 1 ));
			for(int j = 0; j < matriz[i].length; j++)
			{
				System.out.println("\n  Coluna #" + ( j + 1 ) + "\n");
				System.out.print("    valor: ");
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.print("\nDigite o valor que deseja pesquisar: ");
		int n = sc.nextInt();

		for(int i = 0; i < matriz.length; i++)
		{
			for(int j = 0; j < matriz[i].length; j++)
			{
				if(matriz[i][j] == n)
				{
					System.out.println("\nPosição: " + i + ", " + j);

					if(i > 0)
					{
						System.out.println("  Cima: " + matriz[ ( i -1 ) ][ j ] );
					}

					if(j > 0)
					{
						System.out.println("  Esquerda: " + matriz[ i ][ ( j - 1 ) ] );
					}

					if(j < ( c - 1 ))
					{
						System.out.println("  Direita: " + matriz[ i ][ ( j + 1 ) ] );
					}

					if(i < ( l - 1 ))
					{
						System.out.println("  Baixo: " + matriz[ ( i + 1 ) ][ j ] );
					}
				}
			}
		}
	}
}