package tp4.entity;

import java.util.HashSet;

/**
 *
 * @author Grupo 13
 */
public class Alumno {

    private int legajo;
    private final String apellido;
    private final String nombre;
    private final HashSet<Materia> materias;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        materias = new HashSet<>();
    }

    public int getLegajo() {
        return legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void agregarMateria(Materia m) {
        if (null != m) {
            materias.add(m);
        }
    }

    public int cantidadMaterias() {
        return materias.size();
    }

    //Para detectar duplicados
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Alumno alumno = (Alumno) o;
        return legajo == alumno.legajo;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(legajo);
    }

    @Override
    public String toString() {
        return legajo + " - " + apellido + ", " + nombre;
    }

}
