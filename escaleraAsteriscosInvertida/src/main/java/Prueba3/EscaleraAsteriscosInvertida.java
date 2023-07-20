/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Prueba3;

import java.util.Scanner;

public class EscaleraAsteriscosInvertida {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de escalones: ");
        int tamano = sc.nextInt();

        for (int i = tamano; i > 0; i--) {
            for (int j = 0; j < tamano - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}