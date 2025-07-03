/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte_1;


    public class Perro extends Mascota {
// Constructor de la clase Perro, recibe el nombre cuando se crea el objeto        
    public Perro(String nombre) {
// Llamo al constructor de la clase padre (Mascota) para asignar el nombre        
        super(nombre);
    }
// Método propio de la clase Perro para ladrar
    public void ladrar() {
        System.out.println(nombre + " dice: ¡Guau!");
    }
}




