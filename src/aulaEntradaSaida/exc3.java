package aulaEntradaSaida;

import java.util.Scanner;

public class exc3 {

	public static void main(String[] args) {
     float adicionalNoturno, horaExtras, desconto, salarioLiquido, salarioBruto; 
     Scanner leia = new Scanner (System.in); 
     
     System.out.println("Digite seu adicional noturno: "); 
     adicionalNoturno = leia.nextFloat();
     
     System.out.println("Digite seu horas extras: "); 
     horaExtras = leia .nextFloat();

     System.out.println("Digite seu desconto: "); 
     desconto = leia .nextFloat();

     System.out.println("Digite seu salario liquido: "); 
   salarioLiquido= leia .nextFloat();
   
   
   System.out.println("Digite seu salario bruto: "); 
   salarioBruto = leia .nextFloat();

		 salarioLiquido =  (adicionalNoturno + salarioBruto + (horaExtras *5))- desconto; 
		 
		 System.out.println("\nSalario Liquido:  " + salarioLiquido);
		   
     
		
		
	}

}
