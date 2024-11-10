package br.com.example.withif;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose your animal for to listen your sound:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Cow");
        System.out.println("4. Fish");
        System.out.println("5. Lion");
        System.out.print("Animal:");

        final var scanner = new Scanner(System.in);
        final var animal = scanner.nextInt();

        if(animal == 1) {
            System.out.println("BARK BARK BARK");
        }
        else if(animal == 2) {
            System.out.println("Meaw");
        }
        else if(animal == 3) {
            System.out.println("MUUUU");
        }
        else if(animal == 4) {
            System.out.println("Glub Glub");
        }
        else if(animal == 5) {
            System.out.println("ROOOARRRR!");
        }
        else {
            System.out.println("Invalid animal");
        }
    }
}