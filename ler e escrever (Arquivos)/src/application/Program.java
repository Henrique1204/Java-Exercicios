package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program
{
	public static void main(String[] args)
	{
		/* Exemplo um
		File file = new File(caminho);
		Scanner sc = null;

		try
		{
			sc = new Scanner(file);

			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			if(sc != null)
			{
				sc.close();	
			}
		}

		Exemplo 2
		String caminho = "c:\\temp\\test.txt";

		FileReader fr = null;
		BufferedReader br = null;

		try
		{
			fr = new FileReader(caminho);
			br = new BufferedReader(fr);

			String linha = br.readLine();

			while(linha != null)
			{
				System.out.println(linha);
				linha = br.readLine();
			}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				if(br != null)
				{
					br.close();
				}

				if(fr != null)
				{
					fr.close();
				}
			}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
		}
		*/

		//Exemplo 3
		String caminho = "c:\\temp\\teste.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(caminho)))
		{
			String linha = br.readLine();

			while(linha != null)
			{
				System.out.println(linha);
				linha = br.readLine();
			}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}