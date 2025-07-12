/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salon;

import java.util.ArrayList;

/**
 *
 * @author Juanes Cardona
 */
import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private String matricula;
    private ArrayList<Nota> notas; // Lista de notas

    // Constructor
    public Estudiante(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.notas = new ArrayList<>(); // Inicializa lista vacía
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    // Agregar una nota a la lista
    public void agregarNota(Nota nota) {
        notas.add(nota);
    }

    // Modificar una nota por nombre de materia
    public boolean modificarNota(String materia, double nuevaCalificacion) {
        for (Nota nota : notas) {
            if (nota.getMateria().equalsIgnoreCase(materia)) {
                nota.setNota(nuevaCalificacion);
                return true; // Nota encontrada y modificada
            }
        }
        return false; // Nota no encontrada
    }

    // Eliminar una nota por nombre de materia
    public boolean eliminarNota(String materia) {
        for (Nota nota : notas) {
            if (nota.getMateria().equalsIgnoreCase(materia)) {
                notas.remove(nota);
                return true; // Nota eliminada
            }
        }
        return false; // No encontrada
    }

    // Calcular promedio
    public double calcularPromedio() {
        if (notas.isEmpty()) {
            return 0.0; // Evita división por cero
        }
        double suma = 0.0;
        for (Nota nota : notas) {
            suma += nota.getNota();
        }
        return suma / notas.size();
    }

    // Mostrar notas
    public void mostrarNotas() {
        for (Nota nota : notas) {
            System.out.println("Materia: " + nota.getMateria() + ", Calificación: " + nota.getNota());
        }
    }
}
