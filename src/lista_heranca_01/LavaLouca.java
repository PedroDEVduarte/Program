package lista_heranca_01;

public class LavaLouca extends EletroDomestico{
	
	private int capacidadeLitros;

	
	public LavaLouca(String modelo, String fabricante, double kwDia, int capacidadeLitros) {
		super(modelo, fabricante, kwDia);
		this.capacidadeLitros = capacidadeLitros;
	}


	public LavaLouca() {
		super();
		
	}

	public int getCapacidadeLitros() {
		return capacidadeLitros;
	}

	public void setCapacidadeLitros(int capacidadeLitros) {
		this.capacidadeLitros = capacidadeLitros;
	}
	

}
