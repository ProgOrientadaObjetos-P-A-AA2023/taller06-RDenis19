/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author denis
 */
public class Medico {
    private String nombre;
    private String especialidad;
    private double sueldo;

    public Medico(String nom, String espc, double suel) {
        nombre = nom;
        especialidad = espc;
        sueldo = suel;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }

    public void establecerEspecialidad(String n) {
        especialidad = n;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void establecerSueldo(double n) {
        sueldo = n;
    }
}

