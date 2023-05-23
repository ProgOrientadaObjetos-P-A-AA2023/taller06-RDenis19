/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;
import paquete02.Ciudad;
import paquete02.Enfermero;
import paquete02.Hospital;
import paquete02.Medico;
/**
 *
 * @author denis
 */
public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombreHospital;
        String nombreCiudad;
        String provincia;
        int numeroEspecialidad;
        String nombreMedico;
        String especialidadMedico;
        double salarioMedico;
        String nombreEnfermero;
        String tipoEnfermero;
        double salarioEnfermero;
        int numeroMedicos;
        int numeroEnfermeros;
        Medico[] medicos;
        Enfermero[] enfermeros;

        System.out.println("Ingrese el nombre del hospital:");
        nombreHospital = entrada.nextLine();
        System.out.println("Ingrese el nombre de la ciudad:");
        nombreCiudad = entrada.nextLine();
        System.out.println("Ingrese el nombre de la provincia:");
        provincia = entrada.nextLine();
        System.out.println("Ingrese el número de especialidades médicas:");
        numeroEspecialidad = entrada.nextInt();
        System.out.println("Ingrese el número de médicos a registrar:");
        numeroMedicos = entrada.nextInt();

        medicos = new Medico[numeroMedicos];
        for (int i = 0; i < numeroMedicos; i++) {
            entrada.nextLine();
            System.out.println("Ingrese el nombre del médico:");
            nombreMedico = entrada.nextLine();
            System.out.println("Ingrese la especialidad del médico:");
            especialidadMedico = entrada.nextLine();
            System.out.println("Ingrese el salario del médico:");
            salarioMedico = entrada.nextDouble();

            medicos[i] = new Medico(nombreMedico, especialidadMedico, 
                    salarioMedico);
        }

        System.out.println("Ingrese el número de enfermeros a registrar:");
        numeroEnfermeros = entrada.nextInt();

        enfermeros = new Enfermero[numeroEnfermeros];
        for (int i = 0; i < numeroEnfermeros; i++) {
            entrada.nextLine();
            System.out.println("Ingrese el nombre del enfermero:");
            nombreEnfermero = entrada.nextLine();
            System.out.println("Ingrese el tipo de enfermero (nombramiento - contrato):");
            tipoEnfermero = entrada.nextLine();
            System.out.println("Ingrese el salario del enfermero:");
            salarioEnfermero = entrada.nextDouble();

            enfermeros[i] = new Enfermero(nombreEnfermero, tipoEnfermero, 
                    salarioEnfermero);
        }

        Ciudad ciudad = new Ciudad(nombreCiudad, provincia);

        Hospital hospital = new Hospital(nombreHospital, ciudad, 
                numeroEspecialidad, medicos, enfermeros);
        hospital.calcularSueldosPagar();

        System.out.printf("%s\n", hospital);
    }
}
    
