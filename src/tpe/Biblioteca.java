package tpe;
import java.util.ArrayList;
import java.util.Iterator;

public class Biblioteca {
	private ArrayList<Genero> generos;
	private ArrayList<Libro> libros;
	private static int iteraciones = 0;
	
	
	public Biblioteca() {
		this.generos = new ArrayList<>();
		this.libros = new ArrayList<>();
	}

	public void addLibro(Libro l) {
		ArrayList<String> generosDeLibro = l.getGeneros();
		for(String g:generosDeLibro) {
			Boolean flag = false;
			for(Genero j:generos) {
				if(j.getNombre().equals(g)) {
					j.addLibro(l);
					flag = true;
				}
			}
			if(!flag) {
				Genero x = new Genero(g);
				this.addGenero(x);
				x.addLibro(l);
			}
		}
		addLibros(l);
	}
	
	public ArrayList<Libro> getLibrosFiltrados(String g){
		ArrayList<Libro> librosFiltrados = new ArrayList<>();
		Boolean encontro = false;
		Timer t = new Timer();
		
		Iterator<Genero> it = this.generos.iterator();
		
		while(it.hasNext() && !encontro) {
			iteraciones++;
			t.start();
			Genero it2 = it.next();
			if(it2.getNombre().equals(g)) {
				encontro = true;
				librosFiltrados.addAll(it2.getLibros());
			}
		}
		
		System.out.println(t.stop() + " " + iteraciones);
		return librosFiltrados;
	}
	
	
	public void addGenero(Genero g) {
		generos.add(g);
	}
	public void addLibros(Libro l) {
		libros.add(l);
	}
	public ArrayList<Libro> getLibrosPorGenero(Genero g){
		ArrayList<Libro> librosDeGenero = new ArrayList<>();
		
		return librosDeGenero;
	}
	public ArrayList<Genero> getGeneros(){
		ArrayList<Genero> generos = this.generos;
		return generos;
	} 
	public ArrayList<Libro> getLibrosTotales(){
		ArrayList<Libro> libros = this.libros;
		return libros;
	} 
}
