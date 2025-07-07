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
public class Propietario {

    private String nombre;
    private int documento;
    private int telefono;
    
    private ArrayList<Mascota> mascotas;

    public Propietario(String nombre, int documento, int telefono) {
        setNombre(nombre);
        setDocumento(documento);
        setTelefono(telefono);
        this.mascotas = new ArrayList<>();
        
        // this.nombre = nombre;
        // this.documento = documento;
        // this.telefono = telefono;
    }

    public void agregarMascota(Mascota mascota) {
        if (mascota == null) {
            throw new IllegalArgumentException("La mascota no puede ser nula.");
        }
        this.mascotas.add(mascota);
    }

    //  Mostrar toda la información del propietario y sus mascotas
    public void mostrarInformacionCompleta() {
        System.out.println("Propietario: " + nombre);
        System.out.println("Documento: " + documento);
        System.out.println("Teléfono: " + telefono);
        System.out.println(" Mascotas registradas:");
        if (mascotas.isEmpty()) {
            System.out.println("Sin mascotas registradas.");
        } else {
            for (Mascota mascota : mascotas) {
                // Llamar método completo de la mascota
                mascota.mostrarHistorial();
                System.out.println("--------------------------");
                // Antes solo mostraba nombre:
                // System.out.println("- " + mascota.getNombre());
            }
        }
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Nombre inválido.");
        }
        this.nombre = nombre;
    }

    public void setDocumento(int documento) {
        if (documento <= 5) {
            throw new IllegalArgumentException("Documento inválido.");
        }
        this.documento = documento;
    }

    public void setTelefono(int telefono) {
        if (telefono <= 7) {
            throw new IllegalArgumentException("Teléfono inválido.");
        }
        this.telefono = telefono;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public int getTelefono() {
        return telefono;
    }

    public ArrayList<Mascota> getMascotas() {
      
        return new ArrayList<>(mascotas); 
    }
}