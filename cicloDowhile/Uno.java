package cicloDowhile;

import java.util.Scanner;

public class Uno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String continua, nombre;
        double nota;
        int numeroAprobados = 0;
        do {
            System.out.print("Ingrese el nombre: ");
            nombre = input.next();
            System.out.print("Ingrese la nota de " + nombre + ": ");
            nota = input.nextDouble();
            if (nota >= 3.5) {
                numeroAprobados += 1;
            }
            System.out.print("Quiere ingresar otro alumno (si/no): ");
            continua = input.next();
        } while (continua.equals("si"));
        System.out.println("La cantidad de aprobados es: " + numeroAprobados);
        input.close();
    }
}