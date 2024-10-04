package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        boolean error = true;
        Scanner entradaEscaner = new Scanner(System.in); // Crear el objeto Scanner una vez
        System.out.printf("Introduce el nombre del alumno: ");
        String nombre = entradaEscaner.nextLine(); // Leer el nombre

        System.out.printf("Introduce la nota del primer trimestre (0-10): ");
        int trimestre1 = entradaEscaner.nextInt(); // Leer la nota del primer trimestre

        System.out.printf("Introduce la nota del segundo trimestre (0-10): ");
        int trimestre2 = entradaEscaner.nextInt(); // Leer la nota del segundo trimestre

        System.out.printf("Introduce la nota del tercer trimestre: (0-10) ");
        int trimestre3 = entradaEscaner.nextInt(); // Leer la nota del tercer trimestre

        System.out.println("Las notas de " + nombre + " son las siguientes:");
        System.out.println("1º Trimestre: " + trimestre1);
        System.out.println("2º Trimestre: " + trimestre2);
        System.out.println("3º Trimestre: " + trimestre3);

        int Promedio = ((trimestre1 + trimestre2 + trimestre3)/3);
        System.out.println("El promedio es: " + Promedio);

        while (error == true) {
            try {

            }  catch (InputMismatchException e) {
                System.out.println("El número no es válido, por favor, vuelve a introducir un número: "); // Da error
                entradaEscaner.nextLine();
            }
        }
    }
}
