package modelos;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maria
 */
public class Habitacion {
    //-------------
    // ATRIBUTOS
    //------------
    private int numHab;
    private ArrayList<Paciente> listaPacientes;
    
    //-----------------
    // CONSTRUCTORES
    //----------------
    
    public Habitacion(int numHab,ArrayList<Paciente> listaPacientes){
        this.numHab = numHab;
        for(Paciente p : listaPacientes){
            this.listaPacientes.add(new Paciente(p));
        }
    }
    
    public Habitacion(){
        this.numHab = 0;
        this.listaPacientes = new ArrayList<>();
    }
    
    public Habitacion(Habitacion otro){
        this(otro.numHab, otro.listaPacientes);
    }
    
    //------------------
    // GETTERS & SETTERS
    //-------------------

    public int getNumHab() {
        return numHab;
    }

    public void setNumHab(int numHab) {
        this.numHab = numHab;
    }

    public ArrayList<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(ArrayList<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }
    
    //-------------------
    // OVERRIDEN METHODS
    //-------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Habitacion{");
        sb.append("numHab=").append(numHab);
        sb.append(", listaPacientes=").append(listaPacientes);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}