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
    private String apellidos;
    private int edad;
    private String genero;
    
    //---------------
    // CONSTRUCTORES
    //---------------
    
    public Paciente(String DNI, String nombre, String apellidos, int edad, String genero){
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.genero = genero;
    }
    
    public Paciente(){
        this.DNI ="";
        this.nombre ="";
        this.apellidos ="";
        this.edad =0;
        this.genero ="";
    }
    
    public Paciente(Paciente otro){
        this(otro.DNI, otro.nombre, otro.apellidos, otro.edad, otro.genero);
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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
        sb.append(", apellidos=").append(apellidos);
        sb.append(", edad=").append(edad);
        sb.append(", genero=").append(genero);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
