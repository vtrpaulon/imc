/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imc;

/**
 *
 * @author vitor
 */
public class Pessoa {
    private float peso;
    private float altura;
    
    public Pessoa(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public float calcularIMC(){
        float imc = peso / (altura*altura);
        return imc;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
    }
    public float getPeso(){
        return peso;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public float getAltura(){
        return altura;
    }
}
