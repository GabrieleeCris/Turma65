package VetoresEMatrizes;

import java.util.Scanner;

public class vetoresExc2 {
	public static void main(String[] args) {


        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Leitura dos números e armazenamento no vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Elementos dos índices ímpares do vetor:");
        for (int i = 1; i < vetor.length; i += 2) {
            System.out.println("Índice " + i + ": " + vetor[i]);
        }

        System.out.println("Elementos pares do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i]);
            }
        }

        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        double media = (double) soma / vetor.length;

        System.out.println("Soma dos elementos do vetor: " + soma);
        System.out.println("Média dos elementos do vetor: " + media);

        scanner.close();
    }





    }

