/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultaDiagnostico;

/**
 *
 * @author Juanes
 */

public class Diagnostico {
// Variables que guardan los datos del diagnóstico: qué es y cómo se trata
    public String descripcion;
    public String tratamiento;
// Constructor: aquí se reciben los detalles del diagnóstico y se guardan
    public Diagnostico(String descripcion, String tratamiento) {
        this.descripcion = descripcion;
        this.tratamiento = tratamiento;
        
    }
// Devuelve la descripción actual del diagnóstico
    public String getDescripcion() {
        return descripcion;
    }
// Cambia la descripción por una nueva si se necesita actualizar
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
// Devuelve el tratamiento que tiene el diagnóstico
    public String getTratamiento() {
        return tratamiento;
    }
// Cambia el tratamiento por otro diferente si hace falta
    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
 // Verifica si el tratamiento es considerado largo
   public boolean esTratamientoLargo(){
    // Si tiene 30 caracteres o más, se dice que es largo
       if (tratamiento.length() >= 30){
           return true;
       }else {
    // Si tiene menos de 30, se toma como corto
           return false;
       }
   }
}
