package lista_heranca_01;

public class Geladeira extends EletroDomestico{

	
	private int capacidadeLitros;

	
	public Geladeira(String modelo, String fabricante, double kwDia, int capacidadeLitros) {
		super(modelo, fabricante, kwDia);
		this.capacidadeLitros = capacidadeLitros;
	}


	public Geladeira() {
		super();
		
	}

	public int getCapacidadeLitros() {
		return capacidadeLitros;
	}

	public void setCapacidadeLitros(int capacidadeLitros) {
		this.capacidadeLitros = capacidadeLitros;
	}
	
	
}
	

