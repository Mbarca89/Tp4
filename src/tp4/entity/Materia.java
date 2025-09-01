/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4.entity;

/**
 *
 * @author Mauricio
 */
public class Materia {

    private int idMateria;
    private String nombre;
    private int anio;

    public Materia() {
    }

    public Materia(int idMateria, String nombre, int anio) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    //Para evitar id de materias repetidos
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Materia materia = (Materia) o;
        return idMateria == materia.idMateria;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(idMateria);
    }

    @Override
    public String toString() {
        return idMateria + " - " + nombre + " (Año " + anio + ")";
    }
}
