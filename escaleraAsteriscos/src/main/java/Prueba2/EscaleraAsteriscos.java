/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Prueba2;

import javax.swing.JOptionPane;

public class EscaleraAsteriscos {

    public static void main(String[] args) {
           String texto=JOptionPane.showInputDialog("Cantidad de escalones");
        int altura=Integer.parseInt(texto);
        for(int numAsterisco=1;numAsterisco<=altura;numAsterisco++){
            for(int i=0;i<numAsterisco;i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}