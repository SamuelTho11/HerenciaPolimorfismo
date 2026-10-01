/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author Samuel
 */
public class Pajaro extends Animal {
    private int altura;

    public Pajaro(int altura, String nombre) {
        super(nombre);
        this.altura = 0;
    }
   
    public Pajaro(String nombre){
        super("Donald");
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void volar(){
        altura+=10;
        System.out.println(super.getNombre() + " Altura actual: " + altura);
    }

    @Override
    public void hacerSonido() {
        System.out.println(super.getNombre() + " Pio pio pio"); 
    }
    
}
