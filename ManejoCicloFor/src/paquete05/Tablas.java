/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Tablas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int maximo;
        int multiplicando = 1;
        int multiplicador = 1;

        System.out.println("Ingrese el numero de tablas");
        numero = entrada.nextInt();
        System.out.println("Ingrese el maximo de la tabla");
        maximo = entrada.nextInt();

        while (multiplicando <= numero) {
            while (multiplicador <= maximo) {
                System.out.println(multiplicando+"x"+multiplicador+"="+
                        (multiplicando*multiplicador));
                multiplicador++;
            }
            multiplicador=1;
            multiplicando++;
        }
    }
}
