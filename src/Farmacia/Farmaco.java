package Farmacia;

public class Farmaco extends Empresa {

	private Estoque estoque;

	public Farmaco(String nome, String cNPJ, Endereco endereco, Estoque estoque) {
		super(nome, cNPJ, endereco);
		this.estoque = estoque;

	}
	public Farmaco() {
		super();
	
	}
	public Estoque getEstoque() {
		return estoque;
	}
	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
	public void identificarResponsavelEstoque() {
		System.out.println("Responsável: " +this.getEstoque().getResponsavel());
		
	}
	public void calcularTotalEstoque() {
		double total = this.getEstoque().contabilizarEstoque();
		System.out.println("o valor total do estoque em reais: " + total);
		
	}
	
	public void calcularTotalEstoque(String laboratorio) {
		double total = this.getEstoque().contabilizarEstoque(laboratorio);
		System.out.println("o valor total do estoque em reais do laboratorio " + laboratorio + " é: "+ total);
	}
	public void buscarInformacoesLaboratorio(String laboratorio) {
		this.getEstoque().buscarInfoLaboratorio(laboratorio);
		
	}
}