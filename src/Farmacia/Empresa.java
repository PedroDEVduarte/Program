package Farmacia;

public class Empresa {
	private String nome;
	private String CNPJ;
	private Endereco endereco;
	public Empresa(String nome, String cNPJ, Endereco endereco) {
		super();
		this.nome = nome;
		CNPJ = cNPJ;
		this.endereco = endereco;
	}
	public Empresa() {
		super();
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Empresa: "
			    +"\nNome: " + this.getNome()
				+"\nCNPJ: " + this.getCNPJ()
				+ this.getEndereco();
	}

}
