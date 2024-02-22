// Realizar un algoritmo que lea 3 números y determine la suma entre ellos.

package cicloWhile;

import java.util.Scanner;

public class Uno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contador, numero, suma;
        contador = 1;
        suma = 0;
        while (contador <= 3) {
            System.out.print("Digite un numero: ");
            numero = input.nextInt();
            suma = suma + numero;
            contador += 1;
        }
        System.out.println("La suma de los numeros es: " + suma);
        input.close();
    }
}
