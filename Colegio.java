/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.colegio;

/**
 *
 * @author alvarovs86
 */
public class Colegio {

    public static void main(String[] args) {
        int n=1;
        String cl="1ºA";
        Aula clase1;
        Aula clase2;
        Aula[] clases=new Aula[2];
        boolean paracomprobar;

        clases[0]=new Aula(n,cl);
        
        clases[0].imprimirClase();
        
        paracomprobar=clases[0].comprobar(20);
    }
}
