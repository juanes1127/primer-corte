/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte_2;

import Parte_1.Gato;
import Parte_1.Mascota;
import Parte_1.Perro;

/**
 *
 * @author Kevin
 */
public class TestCasting2 {
     public static void main(String[] args) {
        Mascota m = new Perro ("Max");
// Creo un objeto Perro con nombre "Max", pero lo guardo en una variable de tipo Mascota    
       if (m instanceof Perro){
// Verifico si m es realmente un Perro antes de convertirlo
        Perro p = (Perro) m; 
// Como sí es un Perro, convierto m a tipo Perro para poder usar sus métodos
        p.ladrar();
// Llamo al método ladrar que tiene la clase Perro
    }else{
           System.out.println(" No es un perro, no se puede ladrar ");
       }
    }
}
