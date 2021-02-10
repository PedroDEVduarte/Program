package lista_heranca_01;

public class MicroOndas extends EletroDomestico{
	
	private int capacidadeLitros;

	
	public MicroOndas(String modelo, String fabricante, double kwDia, int capacidadeLitros) {
		super(modelo, fabricante, kwDia);
		this.capacidadeLitros = capacidadeLitros;
	}


	public MicroOndas() {
		super();
		
	}

	public int getCapacidadeLitros() {
		return capacidadeLitros;
	}

	public void setCapacidadeLitros(int capacidadeLitros) {
		this.capacidadeLitros = capacidadeLitros;
	}

	

	
	}
	
	
