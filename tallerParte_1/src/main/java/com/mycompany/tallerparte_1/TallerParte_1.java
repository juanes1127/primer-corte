/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallerparte_1;
import Parte_1.ClinicaVeterinaria;
import Parte_1.Gato;
import Parte_1.Mascota;
import Parte_1.Perro;
public class TallerParte_1 {

    public static void main(String[] args) {
         ClinicaVeterinaria c = new ClinicaVeterinaria();

        Mascota m1 = new Perro("Toby");
        Mascota m2 = new Gato("Pelusa");

        c.recibirMascota(m1);
        c.recibirMascota(m2);
    }
}


