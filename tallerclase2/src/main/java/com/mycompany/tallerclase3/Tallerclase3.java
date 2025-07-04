

package com.mycompany.tallerclase3;

/**
 *
 * @author Juanes
 */

import consultaDiagnostico.Consulta;
import consultaDiagnostico.Diagnostico;

public class Tallerclase3 {

    public static void main(String[] args) {
     // Aquí creo un diagnóstico nuevo, con una descripción del problema y el tratamiento recomendado.
        Diagnostico d = new Diagnostico("Infección en la piel", "Administrar antibiotico topico durante 10 días y monitorear reaccion.");
     // Luego creo una consulta, donde le asigno un código, una fecha y el diagnóstico que ya había creado.
        Consulta c = new Consulta("#C001", "2025-07-01", d);
    // Finalmente muestro toda la información de la consulta por pantalla  
        c.mostrarConsulta();
       
   }
}
