/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author denis
 */
public class Enfermero {
    private String nombre;
    private String tipo;
    private double sueldo;

    public Enfermero(String nombr, String tip, double sueld) {
        nombre = nombr;
        tipo = tip;
        sueldo = sueld;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public void establecerTipo(String n) {
        tipo = n;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void establecerSueldo(double n) {
        sueldo = n;
    }
}
