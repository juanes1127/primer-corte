/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte_1;

 public class ClinicaVeterinaria {
    public void recibirMascota(Mascota m) {
        System.out.println("Recibiendo a: " + m.nombre);
        m.saludar();

        if (m instanceof Perro) {
            ((Perro) m).ladrar();
        } else if (m instanceof Gato) {
            ((Gato) m).maullar();
        } else {
            System.out.println("Tipo de mascota no reconocido.");
        }
    }
 }
