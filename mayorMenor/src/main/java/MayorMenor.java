
import java.util.Scanner;

public class MayorMenor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[20];

        System.out.println("Ingrese 20 números:");

        for (int i = 0; i < 20; i++) {
            while (true) {
                try {
                    System.out.print("Número " + (i + 1) + ": ");
                    numeros[i] = Double.parseDouble(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Error. Ingrese un número válido.");
                }
            }
        }

        double numMayor = numeros[0];
        double numMenor = numeros[0];

        for (int i = 1; i < 20; i++) {
            if (numeros[i] > numMayor) {
                numMayor = numeros[i];
            }

            if (numeros[i] < numMenor) {
                numMenor = numeros[i];
            }
        }

        System.out.println("El número mayor es: " + numMayor);
        System.out.println("El número menor es: " + numMenor);
    }
}
