/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

import java.util.Random;

public class Exe3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.print("Numeros Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessores Numeros Aleatórios: ");
        for (int numero : numerosAleatorios) {
        System.out.print(numero+1 + " ");
    }
        System.out.print("\nAntecessores Numeros Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero-1 + " ");
        }

    }
}
