/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicaVeterinaria;

/**
 *
 * @author juanes
 */
public class Veterinario {
    private String nombre;
    private String especialidad;

    

    public Veterinario(String nombre, String especialidad) {
//        this.nombre = nombre;
//        this.especialidad = especialidad;
          setNombre(nombre);
    }
    
     public void mostrarPerfil() {
        System.out.println("Veterinario: " + nombre + " | Especialidad: " + especialidad);
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    
    public void setNombre(String nombre) {
       if(nombre == null || nombre.isBlank()){
           throw new IllegalArgumentException("El nombre no puede estar en blanco");
       }
       this.nombre = nombre;
    }

    public void setEspecialidad(String especialidad) {
        if(especialidad == null || especialidad.isBlank()){
            throw new IllegalArgumentException("La especialidad no puede estar en blanco");
        }
        this.especialidad = especialidad;
    }
    
    
}
