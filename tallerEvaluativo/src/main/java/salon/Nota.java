/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salon;

/**
 *
 * @author Juanes Cardona
 */
public class Nota {
     
private String materia;
     private double nota;
     
    //Contructor
    public Nota(String materia, double nota) {
        this.materia = materia;
        this.nota = nota;
    }
    
    // Getters y Setters
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    
    }

    