package RegistroDeEstudiantes_proyecto1;

public class Estudiante {

	String nombre;
	int edad;
	double nota;
	
	
	Estudiante(String nombre, int edad, double nota){
		this.nombre = nombre;
		this.edad = edad;
		this.nota = nota;
		
	}
	
	
	String getNombre() {
		return this.nombre;
	}
	
	int getEdad() {
		return this.edad;
	}
	
	double getNota() {
		return this.nota;
	}
		
	
	void setEdad(int edad) {
		this.edad = edad;
	}
	
	void setNota(double nota) {
		this.nota = nota;
	}
	
}

