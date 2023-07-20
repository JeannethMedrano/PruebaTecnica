/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Prueba1;


import java.util.Scanner;

public class SecuenciaFibonacci {

    public static void main(String[] args) {
        int a=0, b=0, c=0, end=0;
        Scanner lee= new Scanner(System.in);
        System.out.println("Ingrese rango");
        end=lee.nextInt();
        System.out.println("Ingrese donde quiera que inicie");
        b=lee.nextInt();
        for (int i = 0; i < end; i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(","+c);
        }
        System.out.println("");
    }
}