package aulaEntradaSaida;

import java.util.Scanner;

public class exc1 {

	public static void main(String[] args) {
      
		

	float salario = 1000.00f;
	float abono  = 1000.00f;
	float novosalario = 11000.00f;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digiteo seu salario:  "); 
	salario = leia.nextFloat();
      
	System.out.println("Abono:  "); 
	abono = leia.nextFloat();
	
	

	System.out.println("\nParabéns" + salario + "," 
			+ abono );
	novosalario = leia.nextFloat();

	
	
	
	
	}

}
