/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author Samuel
 */
public class PerroGrande extends Perro {
    private int pesoKg;

    public PerroGrande(String nombre, int edad, String raza, int pesoKg) {
        super(edad, raza, nombre);
        this.pesoKg = pesoKg;
    }

    public PerroGrande(String nombre) {
        super("Clifford");
    }

    public int getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(int pesoKg) {
        this.pesoKg = pesoKg;
    }

    @Override
    public void hacerSonido() {
        System.out.println(super.getNombre()+ " GUAU!"); 
    }
    
}
