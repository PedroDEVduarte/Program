package Simulado2;

public class Biblioteca {
	
	private String nome;
	private Obra[] obras;
	private Endereco enderecoBiblioteca;
	
	public Biblioteca(String nome, Obra[] obras, Endereco enderecoBiblioteca) {
		super();
		this.nome = nome;
		this.obras = obras;
		this.enderecoBiblioteca = enderecoBiblioteca;
	}
	
	public Biblioteca() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Obra[] getObras() {
		return obras;
	}

	public void setObras(Obra[] obras) {
		this.obras = obras;
	}

	public Endereco getEnderecoBiblioteca() {
		return enderecoBiblioteca;
	}

	public void setEnderecoBiblioteca(Endereco enderecoBiblioteca) {
		this.enderecoBiblioteca = enderecoBiblioteca;
	}
	
	public void calcularQuantidadeObras(){
		System.out.println("A biblioteca possui " + this.getObras().length + " obras.\n");
	}
	
	public void identificarObraAntiga(){
		Obra maisAntiga = this.getObras()[0];
		for (int i = 0; i < this.getObras().length; i++){
			if(this.getObras()[i].getAno() < maisAntiga.getAno()){
				maisAntiga = this.getObras()[i];
			}
		}
		System.out.println("A Obra mais antiga é: " + maisAntiga);
	}
	
	public void identificarAutorNovo(){
		Autor maisNovo = this.getObras()[0].getEscritor();
		for (int i = 0; i < this.getObras().length; i++){
			if(this.getObras()[i].getEscritor().getIdade() < maisNovo.getIdade()){
				maisNovo = this.getObras()[i].getEscritor();
			}
		}
		System.out.println("O Autor mais novo: \n" + maisNovo);
	}
	
	public void identificarEnderecoAutor(String nome){
		for (int i = 0; i < this.getObras().length; i++){
			if(this.getObras()[i].getEscritor().getNome().equalsIgnoreCase(nome)){
				System.out.println("O endereço do Autor é: \n" + this.getObras()[i].getEscritor().getEnderecoAutor());
				break;
			}
		}
		
	}
	}
