package RegistroDeEstudiantes_proyecto1;

import java.util.Arrays;

public class RegistroEstudiantes {

    Estudiante estudianteArray[] = new Estudiante[0];

    void agregarEstudiante(Estudiante EstudianteNuevo) {
        estudianteArray = Arrays.copyOf(estudianteArray, estudianteArray.length+1);
        estudianteArray[estudianteArray.length-1] = EstudianteNuevo;
    }

    //antes
//    void mostrarInformacion() {
//        for (int i = 0; i < estudianteArray.length; i++) {
//            System.out.println(estudianteArray[i]);
//        }
//    }
    
    //despues
    void mostrarInformacion() {
        for (Estudiante estudiante : estudianteArray) {
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Edad: " + estudiante.getEdad());
            System.out.println("Nota: " + estudiante.getNota());
            System.out.println();
        }
    }


    double calcularPromedio() {
        double promedio = 0;
        double suma = 0;
        for (Estudiante estudiante : estudianteArray) {
            suma += estudiante.getNota();
        }
        if (estudianteArray.length > 0) {
            promedio = suma / estudianteArray.length;
        }
        return promedio;
    }
}