package RegistroDeEstudiantes_proyecto1;

public class pruebaMain {

	public static void main(String[] args) {
//		Crear dos instancias de RegistroEstudiantes: registro1 y registro2.
		
		RegistroEstudiantes registro1 = new RegistroEstudiantes();
		RegistroEstudiantes registro2 = new RegistroEstudiantes();
		
//		Agregar un nuevo estudiante a registro1 utilizando el constructor de Estudiante con nombre, edad y nota.
		
		Estudiante estudiante1 = new Estudiante("Marwa", 18, 9.0);
		
		registro1.agregarEstudiante(estudiante1);
		
//		Mostrar la información del estudiante recién agregado utilizando el método mostrarInformacion() de registro1.
		
		registro1.mostrarInformacion();
		
//		Cambiar la edad del estudiante recién agregado utilizando el método setEdad() de Estudiante.
		
		estudiante1.setEdad(19);
		
//		Mostrar nuevamente la información del estudiante para verificar que el cambio de edad se haya realizado correctamente.
		
		registro1.mostrarInformacion();
//		Agregar otro estudiante a registro1 utilizando el constructor de Estudiante con nombre, edad y nota.
		
		Estudiante estudiante2 = new Estudiante("Yasmina", 14, 9);
		registro2.agregarEstudiante(estudiante2);
		
//		Mostrar la información del nuevo estudiante utilizando el método mostrarInformacion() de registro2.

		registro2.mostrarInformacion();

//		Cambiar la nota del nuevo estudiante utilizando el método setNota() de Estudiante.
		
		estudiante2.setNota(10);
//		Mostrar nuevamente la información del nuevo estudiante para verificar que el cambio de nota se haya realizado correctamente.
		
		registro2.mostrarInformacion();
	}
}