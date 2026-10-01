/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author Samuel
 */
public class Pez extends Animal {
    private int profundidad;

    public Pez(int profundidad, String nombre) {
        super(nombre);
        this.profundidad = 0;
    }
    
    public Pez(String nombre){
        super("Dory");
    }

    public int getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }
    
    public void nadar(){
        profundidad+=10;
        System.out.println(super.getNombre()+" Profundidad actual: "+profundidad);
    }

    public void comer(int granulos) {
        System.out.println(getNombre()+" come "+granulos+" granulos de alimento.");
    }

    @Override
    public void hacerSonido() {
        System.out.println(super.getNombre() + " Glu glu glu...");
    }
    
    
}
