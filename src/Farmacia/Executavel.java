package Farmacia;

public class Executavel {

	public static void main(String[] args) {
		
		Endereco endLegrand = new Endereco(" Rua dos Remédios", 100, "centro", "palhoça", "SC");
		Laboratorio legrand = new Laboratorio("legrand", "12.345.678/0001-11",endLegrand);
		
		Endereco endMedley = new Endereco("Rua da medicação", 200,"estreito", "florianopolis", "SC");
		Laboratorio Medley = new Laboratorio("Medley", "12.345.678/0001-22", endMedley);
		
		Endereco endFarmaco = new Endereco("Rua jardim silva", 360, "centro", "florianopolis", "SC");  
		
		Remedio r1 = new Remedio ("rosuvas", 55.00, legrand);
		Remedio r2 = new Remedio ("glifage", 35.00, legrand);
		Remedio r3 = new Remedio ("Aradois h", 50.00, legrand);
		Remedio r4 = new Remedio ("trandilax ", 10.00, legrand);
		
		Remedio r5 = new Remedio ("rosuvastatina ", 50.00, Medley);
		Remedio r6 = new Remedio ("lexotan ", 40.00,  Medley);
		Remedio r7 = new Remedio ("losartana ", 45.00,  Medley);
		Remedio r8 = new Remedio ("torsilax ", 15.00,  Medley);

		Remedio [] remedios = {r1, r1, r1, r1, r2, r2, r2, r3, r3, r4, r5, r6, r6, r7, r7, r7, r8, r8, r8, r8,};
		Estoque estoque = new Estoque("luciano", remedios);
		Farmaco farmaco = new Farmaco("farmacia do senac", "12.345.678/0001-33", endFarmaco, estoque);
		
		farmaco.identificarResponsavelEstoque();
		
		farmaco.calcularTotalEstoque("Medley");
		farmaco.calcularTotalEstoque("legrand");
		farmaco.buscarInformacoesLaboratorio("Legrand");
	}

}
