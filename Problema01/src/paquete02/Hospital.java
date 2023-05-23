/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author denis
 */
public class Hospital {
    private String nombre;
    private Ciudad ciudad;
    private int numeroEspecialidades;
    private Medico[] medicos;
    private Enfermero[] enfermeros;
    private double sueldosPagar;

    public Hospital(String nombr, Ciudad ciud, int numeroEspeci, Medico[] medi, 
            Enfermero[] enfer) {
        nombre = nombr;
        ciudad = ciud;
        numeroEspecialidades = numeroEspeci;
        medicos = medi;
        enfermeros = enfer;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public void establecerCiudad(Ciudad n) {
        ciudad = n;
    }

    public int obtenerNumeroEspecialidades() {
        return numeroEspecialidades;
    }

    public void establecerNumeroEspecialidades(int n) {
        numeroEspecialidades = n;
    }

    public Medico[] obtenerMedicos() {
        return medicos;
    }

    public void establecerMedicos(Medico[] n) {
        medicos = n;
    }

    public Enfermero[] obtenerEnfermeros() {
        return enfermeros;
    }

    public void establecerEnfermeros(Enfermero[] n) {
        enfermeros = n;
    }

    public double obtenerSueldosPagar() {
        return sueldosPagar;
    }

    public void calcularSueldosPagar() {
        for (int i = 0; i < medicos.length; i++) {
            sueldosPagar += medicos[i].obtenerSueldo();
        }
        for (int i = 0; i < enfermeros.length; i++) {
            sueldosPagar += enfermeros[i].obtenerSueldo();
        }
    }

    @Override
    public String toString() {
        String m = String.format("%s\nCiudad: %s\n"
                + "Provincia: %s\n"
                + "Número de especialidades: %d\n"
                + "Listado de médicos:",
                nombre,
                ciudad.obtenerNombre(),
                ciudad.obtenerProvincia(),
                numeroEspecialidades);

        for (int i = 0; i < medicos.length; i++) {
            m += String.format("\n- %s - sueldo: %.2f - %s",
                    medicos[i].obtenerNombre(),
                    medicos[i].obtenerSueldo(),
                    medicos[i].obtenerEspecialidad());
        }

        m += "\nListado de enfermeros(as):\n";

        for (int i = 0; i < enfermeros.length; i++) {
            m += String.format("%s - sueldo: %.2f - %s\n",
                    enfermeros[i].obtenerNombre(),
                    enfermeros[i].obtenerSueldo(),
                    enfermeros[i].obtenerTipo());
        }

        m += String.format("Total de sueldos por mes: %.2f", 
                sueldosPagar);

        return m;
    }
}
