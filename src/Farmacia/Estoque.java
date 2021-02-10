package Farmacia;

public class Estoque {

	private String responsavel;
	private Remedio [] remedios;
	
	public Estoque(String responsavel, Remedio[] remedios) {
		super();
		this.responsavel = responsavel;
		this.remedios = remedios;
	}

	public Estoque() {
		super();
		
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public Remedio[] getRemedios() {
		return remedios;
	}

	public void setRemedios(Remedio[] remedios) {
		this.remedios = remedios;
	}

	public double contabilizarEstoque() {
		double total=0;
		for(int i = 0; i < this.getRemedios().length; i++) {
			total += this.getRemedios()[i].getPreco();
		}
		return total;
	}

	public double contabilizarEstoque(String laboratorio) {
		double total=0;
		for(int i = 0; i < this.getRemedios().length; i++) {
			if(this.getRemedios()[i].getLaboratorio().getNome().equalsIgnoreCase(laboratorio)) {
			total += this.getRemedios()[i].getPreco();
		}
		
	}
			
		return total;
}

	public void buscarInfoLaboratorio(String laboratorio) {
		Laboratorio lab=null;
		for(int i = 0; i < this.getRemedios().length; i++) {
		    if(this.getRemedios()[i].getLaboratorio().getNome().equalsIgnoreCase(laboratorio)) {
		    lab=this.getRemedios()[i].getLaboratorio();
	}
	}
		System.out.println("\nInformações do laboratorio");
		System.out.println(lab);
}	
}
	
