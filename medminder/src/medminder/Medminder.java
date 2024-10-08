/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medminder;
import java.util.*;
import modelos.*;

/**
 *
 * @author maria
 */
public class Medminder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String DNI, nombre, apellidos, genero;
        int edad, numHab;
        ArrayList<Paciente> p = new ArrayList<>();
        
        /*
        Paciente t2 = new Paciente("376248","Pepito", "Serrano",78,"Hombre");
        Paciente t3 = new Paciente (t2);
        
        System.out.println(t2);
        System.out.println(t3);
        */
        
        //Leer datos por pantalla
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el DNI del paciente: ");
        DNI = sc.next();
        
        System.out.println("Introduce el nombre del paciente: ");
        nombre = sc.next();
        
        System.out.println("Introduce los apellidos del paciente: ");
        apellidos = sc.next();
        
        System.out.println("Introduce la edad del paciente: ");
        edad = sc.nextInt();
        
        System.out.println("Introduce el género del paciente: ");
        genero = sc.next();
        
        Paciente t2 = new Paciente(DNI, nombre, apellidos, edad, genero);
        Paciente t3 = new Paciente (t2);
        
        System.out.println(t2);
        System.out.println(t3);
        
        System.out.println("Introduce el número de la Habitación: ");
        numHab =sc.nextInt();
        
        p.add(t2);
        p.add(t3);
        
        
        
        Habitacion test2 = new Habitacion(numHab, p);
        
        
        
    }
    
}
