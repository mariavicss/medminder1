/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author maria
 */
public class Medicamentos {
    //-----------------
    // ATRIBUTOS
    //-----------------
    
    private String nombre;
    private double dosis;
    
    //------------------
    // CONSTRUCTORES
    //-----------------
    
    
    public  Medicamentos(String nombre, double dosis){
        this.nombre = nombre;
        this.dosis = dosis;
    }
    
    public Medicamentos(){
        this("",0);
    }
    
    public Medicamentos(Medicamentos otro){
        this(otro.nombre, otro.dosis);
    }
    
    //------------------
    // GETTERS & SETTERS
    //------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDosis() {
        return dosis;
    }

    public void setDosis(double dosis) {
        this.dosis = dosis;
    }
    
    //-------------------
    // OVERRIDEN METHODS
    //-------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Medicamentos{");
        sb.append("nombre=").append(nombre);
        sb.append(", dosis=").append(dosis);
        sb.append('}');
        return sb.toString();
    }
    
    
}
