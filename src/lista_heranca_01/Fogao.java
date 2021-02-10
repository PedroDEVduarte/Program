package lista_heranca_01;

public class Fogao extends EletroDomestico{

	private int quantidadeBocas;

	
	public Fogao(String modelo, String fabricante, double kwDia, int quantidadeBocas) {
		super(modelo, fabricante, kwDia);
		this.quantidadeBocas = quantidadeBocas;
	}

	
	public Fogao() {
		super();
		
	}

	public int getQuantidadeBocas() {
		return quantidadeBocas;
	}

	public void setQuantidadeBocas(int quantidadeBocas) {
		this.quantidadeBocas = quantidadeBocas;
	}
		
	

}
