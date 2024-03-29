package Biblioteca_proyecto2;

public class Libro {

	String titulo;
	String autor;
	int anyoPublicacion;
	
	
	
	Libro(String titulo, String autor, int anyoPublicacion){
		this.titulo = titulo;
		this.autor = autor;
		this.anyoPublicacion = anyoPublicacion;
	}
	
	void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	void setAnyo(int anyoPublicacion) {
		this.anyoPublicacion = anyoPublicacion;
	}
	
	String getTitulo() {
		return this.titulo;
	}
	String getAutor() {
		return this.autor;
	}
	int getAnyo() {
		return this.anyoPublicacion;
	}
	
	 public void mostrarInformacion() {
	        System.out.println("Título: " + titulo);
	        System.out.println("Autor: " + autor);
	        System.out.println("Año de publicación: " + anyoPublicacion);
	    }
}
