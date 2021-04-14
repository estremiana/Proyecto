package Proyecto;

import Proyecto.Interfaces.tieneClave;
import Proyecto.Interfaces.tieneLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Persona implements tieneClave<String>, tieneLista<Tarea> {
    String nombre;
    String correoElectronico;
    List<Tarea> listaTareasResponsable;

    public Persona() { }

    public Persona(String nombre, String correo) {
        this.nombre = nombre;
        this.correoElectronico = correo;
        this.listaTareasResponsable = new ArrayList<>();
    }

    public void asignarTarea(Tarea nuevaTarea) {
        listaTareasResponsable.add(nuevaTarea);
    }

    @Override
    public String toString() {
        return " - " + nombre + ", correo : " + correoElectronico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(correoElectronico, persona.correoElectronico) && Objects.equals(listaTareasResponsable, persona.listaTareasResponsable);
    }

    @Override
    public String getClave() {
        return correoElectronico;
    }

    @Override
    public List<Tarea> getLista() {
        return listaTareasResponsable;
    }
}

