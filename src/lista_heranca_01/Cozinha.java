package lista_heranca_01;

public class Cozinha {

	public static void main(String[] args) {
		//geladeira
		Geladeira geladeira = new Geladeira("B-360", "Brastemp", 4, 360);
		
		
		//fogão
		Fogao fogao = new Fogao("f-4"," Philco", 1, 4);
		
		//lava louça
		LavaLouca lavaLouca = new LavaLouca("c-80","consul",2, 80);
		//micro-ondas
		MicroOndas microOndas = new MicroOndas("p40","panasonic",2, 40);
		
	System.out.println("Consumo Mensal: "
			+(geladeira.calcularConsumo()
			+ fogao.calcularConsumo()
			+ lavaLouca.calcularConsumo()
			+ microOndas.calcularConsumo())
			+ " KW");
	System.out.println("\nConsumo do periodo 10 dias: "
			+(geladeira.calcularConsumo(10)
			+ fogao.calcularConsumo(10)
			+ lavaLouca.calcularConsumo(10)
			+ microOndas.calcularConsumo(10))
			+ " KW");
	}

}
