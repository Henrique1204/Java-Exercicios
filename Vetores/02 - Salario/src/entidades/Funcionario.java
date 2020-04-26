package entidades;

import java.util.Scanner;

public class Funcionario
{
	Scanner sc = new Scanner(System.in);

	private int id;
	private String nome;
	private double salario;

	//Construtor
	public Funcionario(int id, String nome, double salario)
	{
		this.setId(id);
		this.setNome(nome);
		this.setSalario(salario);
	}

	//Getters
	public int getId()
	{
		return id;
	}

	public String getNome()
	{
		return nome;
	}

	public double getSalario()
	{
		return salario;
	}

	//Setters
	public void setId(int id)
	{
		this.id = id;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public void setSalario(double salario)
	{
		this.salario = salario;
	}

	//Métodos sobrescresvidos
	public String toString()
	{
		return this.getId() + ", " + this.getNome() + ", R$ " + this.getSalario();
	}

	//Métodos comum
	public void aumentarSalario()
	{
		System.out.print("Qual a porcentagem do aumento: ");
		double porcentagem = sc.nextDouble();

		double aumento = ( this.getSalario() / 100 ) * porcentagem;
		this.setSalario( this.getSalario() + aumento );
	}
}