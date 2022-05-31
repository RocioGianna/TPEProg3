package tpe;

public class Main {

	public static void main(String[] args) {
		
		CSVReader csv = new CSVReader("./dataset1.csv");
		
		Biblioteca b1 = csv.crearBiblioteca();
		
		CSVWritter csvW = new CSVWritter(b1.getLibrosFiltrados("humor"));
		
		csvW.generarArchivoCSV();
	}

}
