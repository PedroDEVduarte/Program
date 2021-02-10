package lista_heranca_01;

public class LavaRoupas extends EletroDomestico{

	private int capacidadeKg;

	

	public LavaRoupas(String modelo, String fabricante, double kwDia, int capacidadeKg) {
		super(modelo, fabricante, kwDia);
		this.capacidadeKg = capacidadeKg;
	}

	public LavaRoupas() {
		super();
		
	}

	public int getCapacidadeKg() {
		return capacidadeKg;
	}

	public void setCapacidadeKg(int capacidadeKg) {
		this.capacidadeKg = capacidadeKg;
	}
	
}
