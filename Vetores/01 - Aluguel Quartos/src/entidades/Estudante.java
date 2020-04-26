package entidades;

public class Estudante {
	private String nome, email;
	private int numeroQuarto;

	//Construtor
	public Estudante(String nome, String email, int numeroQuarto)
	{
		this.setNome(nome);
		this.setEmail(email);
		this.setNumeroQuarto(numeroQuarto);
	}

	//Getters
	public String getNome()
	{
		return this.nome;
	}

	public String getEmail()
	{
		return this.email;
	}

	public int getNumeroQuarto()
	{
		return this.numeroQuarto;
	}

	//Setters
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public void setNumeroQuarto(int numeroQuarto)
	{
		this.numeroQuarto = numeroQuarto;
	}

	//Métodos sobrescrevidos
	public String toString() {
		return this.getNumeroQuarto() + ": " + this.getNome() + ", " + this.getEmail() + ".";
	}
}