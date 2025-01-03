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
        
        
        String DNI, nombre, apellido1, apellido2, aux_genero;
        
        Genero genero;
        int edad, numHab;
        ArrayList<Paciente> p = new ArrayList<>();
        double dosis;
        
        //Leer datos por pantalla
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el DNI del paciente: ");
        DNI = sc.next();
        
        System.out.println("Introduce el nombre del paciente: ");
        nombre = sc.next();
        
        System.out.println("Introduce el primer apellido del paciente: ");
        apellido1 = sc.next();
        
        System.out.println("Introduce el segundo apellido del paciente: ");
        apellido2 = sc.next();
        
        System.out.println("Introduce la edad del paciente: ");
        edad = sc.nextInt();
        
        System.out.println("Introduce el género del paciente: ");
        aux_genero = sc.next();
        
        genero = switch (aux_genero) {
            case "MUJER" -> Genero.MUJER;
            case "HOMBRE" -> Genero.HOMBRE;
            default -> Genero.NODEFINIDO;
        };
        
   
        
        Paciente t2 = new Paciente(DNI, nombre, apellido1, apellido2, edad, genero);
        Paciente t3 = new Paciente (t2);
        
        System.out.println(t2);
        System.out.println(t3);
        
        System.out.println("Introduce el número de la Habitación: ");
        numHab =sc.nextInt();
        
        p.add(t2);
        p.add(t3);
        
        
        
        
        
        Habitacion test2 = new Habitacion(numHab, p);
        
        System.out.println(test2);
        
        System.out.println("Introduce nueva habitación:");
        numHab = sc.nextInt();
        
        test2.setNumHab(numHab);
        System.out.println(test2);
        
        
        
        System.out.println("Introduce el nombre del medicamento: ");
        nombre = sc.next();
        
        System.out.println("Introduce la cantidad de dosis: ");
        dosis = sc.nextDouble();
        
        
        Medicamentos testt2 = new Medicamentos (nombre, dosis);
        Medicamentos testt3 = new Medicamentos (testt2);
        
        System.out.println(testt2);
        System.out.println(testt3);
        
        
        
    }
    
}
