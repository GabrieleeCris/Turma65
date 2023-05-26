package aulaEntradaSaida;

import java.util.Scanner;

class exc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 float N1= 5f;
		 float N2 = 6f;
		 float N3 = 7f;
		 float N4= 8f;
		 float diferenca; 

	     Scanner leia = new Scanner (System.in); 
	     
	     System.out.println("Digite numero 1: "); 
	      N1 = leia.nextFloat();
	         
	      System.out.println("Digite numero 1: "); 
		  N2 = leia.nextFloat();
		     
		  System.out.println("Digite numero 1: "); 
		  N3 = leia.nextFloat();
		  
		  System.out.println("Digite numero 1: "); 
		  N4 = leia.nextFloat();
		     
	      diferenca = ((N1 * N2)-(N3*N4)); 
	      System.out.printf("Essa é a diferença: %.1f", diferenca); 
	
	
	
	
	
	}

}
