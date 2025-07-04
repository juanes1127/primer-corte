/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultaDiagnostico;

/**
 *
 * @author Juanes
 */

public class Consulta {
    
// atributos de la consulta
    public String codigo;
    public String fecha;
    public Diagnostico diag;
    
// Constructor: aquí se crea una consulta nueva con su información básica
    public Consulta(String codigo, String fecha, Diagnostico diag) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.diag = diag;
    }
    // Método que imprime todos los datos de la consulta
        public void mostrarConsulta(){
        // Muestra el número o identificador de la consulta
            System.out.println("Consulta " + codigo);
        // Muestra cuándo se hizo la consulta  
            System.out.println("Fecha:" + fecha);
        // Mensaje para indicar que se va a mostrar el diagnóstico
            System.out.println("Diagnostico asociado" );
        // Imprime la descripción del diagnóstico usando su método
            System.out.println("Descipcion:" + diag.getDescripcion());
        // Imprime el tratamiento indicado usando su método
            System.out.println("Tratamiento:" + diag.getTratamiento());
        // Comprueba si el tratamiento es largo    
            if (diag.esTratamientoLargo()){
        // Si el tratamiento dura mucho, sugiere más control
                System.out.println(" El tratamiento es extenso, se requiere seguimiento adicional.");
            }else{
        // Si no dura mucho, avisa que no hace falta seguimiento
                System.out.println("El tratamiento es corto, por lo tanto no requiere seguimiento.");
            }
        }
    }


