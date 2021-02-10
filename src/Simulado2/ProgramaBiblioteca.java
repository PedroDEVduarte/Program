package Simulado2;

public class ProgramaBiblioteca {

	public static void main(String[] args) {
		
		//Endereços Autores
		Endereco end1 = new Endereco("Rua das Maças", 100, "Ingleses", "Florianópolis", "Santa Catarina");
		Endereco end2 = new Endereco("Rua das Laranjas", 200, "Aririú", "Palhoça", "Santa Catarina");
		Endereco end3 = new Endereco("Rua das Uvas", 300, "Pedra Branca", "Palhoça", "Santa Catarina");
		Endereco end4 = new Endereco("Rua das Melancias", 400, "Estreito", "Florianópolis", "Santa Catarina");
		
		//Endereço da Biblioteca
		Endereco end5 = new Endereco("Rua das Mangas", 600, "Centro", "Florianópolis", "Santa Catarina");
		
		//Escritores
		Autor autor1 = new Autor("Carlos Drummond", 76, end1);
		Autor autor2 = new Autor("Machado de Assis", 107, end2);
		Autor autor3 = new Autor("Cecilia Meireles", 95, end3);
		Autor autor4 = new Autor("Osvald Andrade", 88, end4);
		
		//Revistas
		Revista rev1 = new Revista("Veja", 60, 2012, autor1);
		Revista rev2 = new Revista("IstoÉ", 80, 2013, autor2);
		Revista rev3 = new Revista("Auto-Esporte", 20, 2011, autor3);
		Revista rev4 = new Revista("Super Interessante", 100, 2010, autor4);
		
		//Livros
		Livro livro1 = new Livro("Brejo das Almas", 8, 1983, autor1);
		Livro livro2 = new Livro("Quincas Borba", 1, 1892, autor2);
		Livro livro3 = new Livro("Colar de Carolina", 3, 1934, autor3);
		Livro livro4 = new Livro("Os Condenados", 7, 1941, autor4);
		
		Obra[] obras = {rev1, rev2, rev3, rev4, livro1, livro2, livro3, livro4};
		
		//Biblioteca
		Biblioteca biblio = new Biblioteca("Biblioteca Central", obras, end5);
		
		//Quantidade de Obras da Biblioteca
		biblio.calcularQuantidadeObras();
		
		//Obra mais Antiga
		biblio.identificarObraAntiga();
		
		//Autor mais Novo
		biblio.identificarAutorNovo();
		
		//Busca Endereço do Autor
		biblio.identificarEnderecoAutor("Cecilia Meireles");
	}

}
