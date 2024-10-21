/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author maria
 */
public class Recordatorio {
    
    //----------------
    // ATRIBUTOS
    //----------------
    
    private int dia;
    private int mes;
    private int año;
    private int horas;
    private int minutos;
    private ArrayList <Paciente> nombrePaciente;
    private ArrayList <Medicamentos> nombreMedicamento;
    
    //---------------
    // CONSTRUCTORES
    //---------------
    
    public Recordatorio (int dia, int mes, int año,int horas, int minutos, ArrayList<Paciente> nombrePaciente, ArrayList<Medicamentos> nombreMedicamento){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.horas = horas;
        this.minutos = minutos;
        this.nombrePaciente = new ArrayList <>();
            for(Paciente pp : nombrePaciente){
                this.nombrePaciente.add(pp);
        } 
        this.nombreMedicamento = new ArrayList <>();
            for(Medicamentos m : nombreMedicamento){
                this.nombreMedicamento.add(m);
        } 
    }
    
    public Recordatorio(){
        this(0,0,0,0,0, new ArrayList<>(), new ArrayList<>());
    }
    
    public Recordatorio(Recordatorio otro){
        this(otro.dia, otro.mes, otro.año, otro.horas, otro.minutos, otro.nombrePaciente, otro.nombreMedicamento);
    }
    
    //---------------------
    // GETTERS & SETTERS
    //---------------------

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public ArrayList<Paciente> getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(ArrayList<Paciente> nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public ArrayList<Medicamentos> getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(ArrayList<Medicamentos> nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }
    
    //-------------------
    // OVERRIDEN METHODS
    //-------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Recordatorio{");
        sb.append("dia=").append(dia);
        sb.append(", mes=").append(mes);
        sb.append(", a\u00f1o=").append(año);
        sb.append(", horas=").append(horas);
        sb.append(", minutos=").append(minutos);
        sb.append(", nombrePaciente=").append(nombrePaciente);
        sb.append(", nombreMedicamento=").append(nombreMedicamento);
        sb.append('}');
        return sb.toString();
    }
    
    
}
