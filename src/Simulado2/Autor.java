package Simulado2;

public class Autor {
	
	private String nome;
	private int idade;
	private Endereco enderecoAutor;
	
	public Autor(String nome, int idade, Endereco enderecoAutor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.enderecoAutor = enderecoAutor;
	}
	
	public Autor(){
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Endereco getEnderecoAutor() {
		return enderecoAutor;
	}

	public void setEnderecoAutor(Endereco enderecoAutor) {
		this.enderecoAutor = enderecoAutor;
	}
	
	public String toString(){
		return "Nome: " + this.getNome() + "\n" +
			   "Idade: " + this.getIdade() + "\n" +
			   this.getEnderecoAutor();
	}

}
