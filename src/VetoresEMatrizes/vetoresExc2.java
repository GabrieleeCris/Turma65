package VetoresEMatrizes;

import java.util.Scanner;

public class vetoresExc2 {
	public static void main(String[] args) {


		double[][] notas = new double[10][4];
        double[] medias = new double[10];
        Scanner scanner = new Scanner(System.in);

        // Leitura das notas dos participantes
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite as notas do participante " + (i + 1) + ":");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Nota do bimestre " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        // Cálculo das médias dos participantes
        for (int i = 0; i < notas.length; i++) {
            double soma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma / notas[i].length;
        }

        // Exibição das médias dos participantes
        System.out.println("Médias dos participantes:");
        for (int i = 0; i < medias.length; i++) {
            System.out.println("Participante " + (i + 1) + ": " + medias[i]);
        }

        scanner.close();
    }
}