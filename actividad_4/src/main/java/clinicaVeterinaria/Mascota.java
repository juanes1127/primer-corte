/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicaVeterinaria;

import java.util.ArrayList;


/**
 *
 * @author juanes 
 */
import java.util.ArrayList;

/**
 * Clase Mascota refactorizada sin Historial, pero con buenas prácticas
 */
public class Mascota {
    // 🔒 Atributos privados
    private String nombre;
    private String especie;
    private int edad;

    // 🔗 Consultas de la mascota
    private ArrayList<Consulta> consultas;

    // ✅ Constructor usando setters y lista inicializada
    public Mascota(String nombre, String especie, int edad) {
        setNombre(nombre);
        setEspecie(especie);
        setEdad(edad);
        this.consultas = new ArrayList<>();
        // ❌ Antes:
        // this.nombre = nombre;
        // this.especie = especie;
        // this.edad = edad;
    }

    // ✅ Getter de nombre
    public String getNombre() {
        return nombre;
    }

    // ✅ Getter de especie
    public String getEspecie() {
        return especie;
    }

    // ✅ Getter de edad
    public int getEdad() {
        return edad;
    }

    // ✅ Getter de consultas (copia para proteger lista interna)
    public ArrayList<Consulta> getConsultas() {
        return new ArrayList<>(consultas);
    }

    // ✅ Agregar consulta con validación
    public void agregarConsulta(Consulta consulta) {
        if (consulta == null) {
            throw new IllegalArgumentException("La consulta no puede ser nula.");
        }
        this.consultas.add(consulta);
    }

    // ✅ Mostrar historial (sin clase Historial)
    public void mostrarHistorial() {
        System.out.println("📋 Mascota: " + nombre + " | Especie: " + especie + " | Edad: " + edad + " años");
        if (consultas.isEmpty()) {
            System.out.println("Sin consultas registradas.");
        } else {
            System.out.println("Historial de consultas:");
            for (Consulta consulta : consultas) {
                consulta.mostrarConsulta();
                System.out.println("--------------------------");
            }
        }
    }

    // ✅ Setters con validación
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Nombre inválido.");
        }
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        if (especie == null || especie.isBlank()) {
            throw new IllegalArgumentException("Especie inválida.");
        }
        this.especie = especie;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("Edad no puede ser negativa.");
        }
        this.edad = edad;
    }
}
