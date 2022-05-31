package tpe;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CSVWritter {
	private ArrayList<Libro> libros;
	
	public CSVWritter(ArrayList<Libro> libros) {
		this.libros = libros;
	}
	
	public void generarArchivoCSV() {
		BufferedWriter bw = null;
		try {
			File file = new File("./salida.csv");
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			for(Libro l:libros) {
				bw.write(l.toString());
				bw.newLine();
			}
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

}