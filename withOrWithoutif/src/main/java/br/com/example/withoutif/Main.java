package br.com.example.withoutif;

import br.com.example.withoutif.animal.AnimalFactory;

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

        var scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        var animal = AnimalFactory.getAnimalById(choice);
        System.out.println(animal.getSound());
    }
}
