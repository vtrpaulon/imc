/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imc;

import java.util.Scanner;

/**
 *
 * @author vitor
 */
public class IMC {

    public static void main(String[] args) {
        
       Pessoa pessoa = new Pessoa(0, 0);
       
        
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Digite o peso da pessoa: ");
            pessoa.setPeso(teclado.nextFloat());
            
            System.out.println("Digite a altura da pessoa: ");
            pessoa.setAltura(teclado.nextFloat());
        }
        
        System.out.println("IMC : "+pessoa.calcularIMC());
        
    }
}
