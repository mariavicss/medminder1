package modelos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maria
 */


public class Paciente {
    //----------------
    // ATRIBUTOS
    //----------------
    
    private String DNI;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private String genero;
    
    //---------------
    // CONSTRUCTORES
    //---------------
    
    public Paciente(String DNI, String nombre, String apellido1, String apellido2, int edad, String genero){
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.genero = genero;
    }
    
    public Paciente(){
        this.DNI ="";
        this.nombre ="";
        this.apellido1 ="";
        this.apellido2 = "";
        this.edad =0;
        this.genero ="";
    }
    
    public Paciente(Paciente otro){
        this(otro.DNI, otro.nombre, otro.apellido1,otro.apellido2, otro.edad, otro.genero);
    }
    
    //------------------
    // GETTERS & SETTERS
    //------------------

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

   
    
    //-------------------
    // OVERRIDEN METHODS
    //-------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Paciente{");
        sb.append("DNI=").append(DNI);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido1=").append(apellido1);
        sb.append(", apellido2=").append(apellido2);
        sb.append(", edad=").append(edad);
        sb.append(", genero=").append(genero);
        sb.append('}');
        return sb.toString();
    }

  
    
    
}
