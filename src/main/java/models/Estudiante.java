package models;

import dao.Archivo;
import lombok.*;
import org.w3c.dom.ls.LSOutput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.ArrayList;

/**
 * Clase: Estudiante
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante implements Serializable {


    private String nombre;
    private int edad;
}


