package com.mycompany.palabrapalindromo;

import java.util.Scanner;

public class PalabraPalindromo {

    public static boolean esPalindromo(String palabra) {
        palabra = palabra.toLowerCase().replace(" ", "");
        return esPalindromoRecursivo(palabra, 0, palabra.length() - 1);
    }

    private static boolean esPalindromoRecursivo(
            String palabra, int inicio, int fin) {

        if (inicio >= fin) {
            return true;
        }

        if (palabra.charAt(inicio) != palabra.charAt(fin)) {
            return false;
        }

        return esPalindromoRecursivo(palabra, inicio + 1, fin - 1);
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("VERIFICADOR DE PALINDROMOS");
        System.out.print("Escribe una palabra: ");

        String palabra = entrada.nextLine();

        if (esPalindromo(palabra)) {
            System.out.println("La palabra SI es palindromo.");
        } else {
            System.out.println("La palabra NO es palindromo.");
        }

        entrada.close();
    }
}