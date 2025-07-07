/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad_4;
import clinicaVeterinaria.Propietario;
import clinicaVeterinaria.Consulta;
import clinicaVeterinaria. Mascota;
import clinicaVeterinaria.Veterinario;
import clinicaVeterinaria.Generator;
import java.util.Scanner;



/**
 *
 * @author juanes
 */
public class Actividad_4 {

    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);

        // === Registro del Propietario ===
        System.out.println("=== Registro del Propietario ===");
        System.out.print("Nombre: ");
        String nombreProp = sc.nextLine();

        System.out.print("Documento: ");
        String documento = sc.nextLine();

        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();

        Propietario propietario = new Propietario(nombreProp, Integer.parseInt(documento), Integer.parseInt(telefono));

        // === Registro de Mascotas con do-while ===
        int numMascotas;
        do {
            System.out.print("\n¿Cuántas mascotas desea registrar? (mínimo 1): ");
            numMascotas = Integer.parseInt(sc.nextLine());
        } while (numMascotas <= 0);

        int contadorMascotas = 0;

        do {
            contadorMascotas++;
            System.out.println("\n--- Mascota #" + contadorMascotas + " ---");

            System.out.print("Nombre de la mascota: ");
            String nombreMascota = sc.nextLine();

            System.out.print("Especie: ");
            String especie = sc.nextLine();

            System.out.print("Edad: ");
            int edad = Integer.parseInt(sc.nextLine());

            Mascota mascota = new Mascota(nombreMascota, especie, edad);
            propietario.agregarMascota(mascota);

            // === Registro de Consultas con do-while ===
            int numConsultas;
            do {
                System.out.print("¿Cuántas consultas desea agregar a esta mascota? (mínimo 0): ");
                numConsultas = Integer.parseInt(sc.nextLine());
            } while (numConsultas < 0);

            int contadorConsultas = 0;

            while (contadorConsultas < numConsultas) {
                contadorConsultas++;
                System.out.println("-> Consulta #" + contadorConsultas);

                String codigo = Generator.generarCodigoConsulta();

                System.out.print("Fecha (YYYY-MM-DD): ");
                String fecha = sc.nextLine();

                System.out.println("Información del veterinario:");
                System.out.print("Nombre: ");
                String nombreVet = sc.nextLine();

                System.out.print("Especialidad: ");
                String especialidad = sc.nextLine();

                Veterinario vet = new Veterinario(nombreVet, especialidad);
                Consulta consulta = new Consulta(codigo, fecha, vet);

                mascota.agregarConsulta(consulta);
            }

        } while (contadorMascotas < numMascotas);

        // === Mostrar resultados finales ===
        System.out.println("\n===== FICHA CLÍNICA COMPLETA =====");
        propietario.mostrarInformacionCompleta(); // Asegúrate de tener este método implementado bien

        sc.close();
    }
}