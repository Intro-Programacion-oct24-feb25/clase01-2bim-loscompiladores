/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete01.*;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int limite;
        int numero;
        int base = 1;
        int multo = 1;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        numero = entrada.nextInt();
        System.out.println("Ingrese el límite para la tabla de multiplicar");
        limite = entrada.nextInt();

        while (base <= limite) {
            while (multo <= limite) {

                System.out.println(base + "x" + multo + "=" + (base * multo));
                multo++;

            }
            multo=1;
            base++;

        }

    }
}
