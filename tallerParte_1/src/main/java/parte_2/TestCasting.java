/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte_2;
import Parte_1.Gato;
import Parte_1.Mascota;
import Parte_1.Perro;

public class TestCasting {
    public static void main(String[] args) {
        Mascota m = new Gato("Michi");  
// Creo un objeto tipo Gato con nombre "Michi", pero lo guardo en una variable Mascota
       if (m instanceof Perro){
// Verifico si m realmente es un Perro antes de convertirlo
        Perro p = (Perro) m; 
// Si es Perro, convierto m a Perro para poder usar sus métodos 
        p.ladrar();
// Llamo al método ladrar que solo tiene Perro
    }else{
           System.out.println(" No es un perro, no se puede ladrar ");
       }
    }
}

  
