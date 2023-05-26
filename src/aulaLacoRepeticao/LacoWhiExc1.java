package aulaLacoRepeticao;
import java.util.Scanner;
public class LacoWhiExc1 {

	
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        int idade;
		        int contadorMenor21 = 0;
		        int contadorMaior50 = 0;

		        System.out.println("Digite a idade das pessoas (digite uma idade negativa para encerrar):");

		        while (true) {
		            idade = scanner.nextInt();

		            if (idade < 0) {
		                break;
		            }

		            if (idade < 21) {
		                contadorMenor21++;
		            } else if (idade > 50) {
		                contadorMaior50++;
		            }
		        }

		        System.out.println("Total de pessoas com idade menor que 21 anos: " + contadorMenor21);
		        System.out.println("Total de pessoas com idade maior que 50 anos: " + contadorMaior50);

		        scanner.close();
		    }
		}


	


