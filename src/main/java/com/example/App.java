package com.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int quota = 10;
        System.out.println("Nombre de ventes du commercial cette semaine : ");
        Scanner clavier = new Scanner(System.in);
        int nbVentes = clavier.nextInt();
        clavier.close();
        if (nbVentes >= quota) {
            System.out.println("Félicitations ! Vous avez rempli le quota.");
        } else {
            int nbVentesManquantes = quota - nbVentes;
            System.out.println("Il vous manque " + nbVentesManquantes + " ventes pour atteindre le quota.");
        }

    }
}
