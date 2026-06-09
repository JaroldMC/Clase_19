import dao.Archivo;
import models.Estudiante;

import java.util.ArrayList;

public class Main {

    public static void main() {
        ArrayList<Estudiante> estudiante = new ArrayList<>();

        estudiante.add(new Estudiante("Juan", 18));
        estudiante.add(new Estudiante("Jose", 19));
        estudiante.add(new Estudiante("Jorge", 20));
        estudiante.add(new Estudiante("Josefa", 22));
        estudiante.add(new Estudiante("Junior", 26));
        estudiante.add(new Estudiante("Jairo", 24));

        Archivo<ArrayList<Estudiante>> file = new Archivo<>("student.dat");

        System.out.println(file.save(estudiante));

        ArrayList<Estudiante> newEstudiantes = file.read();

        if (newEstudiantes != null) {
            for (Estudiante est : newEstudiantes) {
                System.out.println(est);
            }
        } else {
            System.out.println("Archivo vacío");

        }
    }
}