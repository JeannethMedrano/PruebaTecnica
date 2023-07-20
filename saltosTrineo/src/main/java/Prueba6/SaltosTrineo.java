/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Prueba6;

import java.util.Arrays;

public class SaltosTrineo {

    public static int obtenerSaltoMinimo(int[] obstaculos) {
        Arrays.sort(obstaculos);

        int saltoMinimo = 1;

        for (int obstaculo : obstaculos) {
            if (obstaculo > saltoMinimo) {
                break;
            }
            saltoMinimo++;
        }

        return saltoMinimo;
    }

    public static void main(String[] args) {
        int[] obstaculos = {1, 2, 3, 5};
        int resultado = obtenerSaltoMinimo(obstaculos);
        System.out.println("La longitud mínima del salto para evitar todos los obstáculos es: " + resultado);
    }
}
