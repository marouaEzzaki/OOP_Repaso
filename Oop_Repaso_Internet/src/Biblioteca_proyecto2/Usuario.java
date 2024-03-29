package Biblioteca_proyecto2;

public class Usuario {

	String nombre;
	int idUsuario;
	Libro librosPrestados;
	
	
	Usuario(String nombre, int idUsuario, Libro LibroPrestado){
		this.nombre = nombre;
		this.idUsuario = idUsuario;
		this.librosPrestados = LibroPrestado;
	}
	
	
	void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	
	void setidUsuario(int idUsuario){
		this.idUsuario = idUsuario;
	}
	
	void setlibroPrest(Libro LibroPrestado){
		this.librosPrestados = LibroPrestado;
	}
	
	
	
	String getNombre() {
		return this.nombre;
	}
	
	int getIdUsuario() {
		return this.idUsuario;
	}
	
	Libro getLibrosPrestados() {
		return this.librosPrestados;
	}
}
