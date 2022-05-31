package tpe;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    String csvFile = "";
    String line = "";
    String cvsSplitBy = ",";
    
    public CSVReader(String csvFile) { 
		this.csvFile = csvFile;
	}
	public Biblioteca crearBiblioteca() {
		Biblioteca b = new Biblioteca();
	    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
	    	 br.readLine();
	    	 
	        while ((line = br.readLine()) != null) {
	            String[] items = line.split(cvsSplitBy);
	            String genero = items[3];
	            String [] generos = genero.split(" ");
	         
	        	Libro l = new Libro(items[0],items[1],items[2]);
	        	for(String g: generos) {
	        		l.addGenero(g);                		
	        	}
	        	b.addLibro(l);
	        }
	        
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    
	    return b;
	}
}
