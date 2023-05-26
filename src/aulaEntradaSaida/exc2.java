package aulaEntradaSaida;

import java.util.Scanner;

public class exc2 {

	public static void main(String[] args) {

		 float nota1;
		 float nota2;
		 float nota3;
		 float nota4;
		 float media; 
		 
		 Scanner leia = new Scanner(System.in);
		 
		 
		 System.out.println("Digite nota1: ");
		 nota1 = leia.nextFloat();

		 System.out.println("Digite nota2: ");
		 nota2 = leia.nextFloat();

		 System.out.println("Digite nota3: ");
		 nota3 = leia.nextFloat();
 
		 System.out.println("Digite nota4: ");
           nota4 = leia.nextFloat();
		 
          media  = (nota1 + nota2+ nota3 + nota4)/4;
          System.out.printf("Sua media de nota foi: %.1f", media); 
		
		
		
	}

}
