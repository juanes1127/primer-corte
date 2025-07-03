/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte_1;

public class Mascota {
// Atributo protegido para guardar el nombre de la mascota, las clases hijas pueden usarlo
    protected String nombre;
// Constructor de la clase Mascota, recibe el nombre de la mascota cuando se crea
    public Mascota(String nombre) {
// Asigno el nombre que recibo al atributo nombre de la mascota        
        this.nombre = nombre;
    }
// Método para que la mascota salude
    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}

