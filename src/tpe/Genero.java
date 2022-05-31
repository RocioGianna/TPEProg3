package tpe;
import java.util.ArrayList;

public class Genero {
	private String nombre;
	private ArrayList<Libro> libros;
	
	public Genero(String nombre) {
		this.nombre = nombre;
		this.libros = new ArrayList<>();
	}
	
	public void addLibro(Libro l) {
		libros.add(l);			
	}
	
	public String getNombre() {
		return nombre;
	}
	public ArrayList<Libro> getLibros() {
		return new ArrayList<>(libros);
	}

	@Override
	public String toString() {
		return   nombre + " " + libros ;
	}
	
	
	
	
}
