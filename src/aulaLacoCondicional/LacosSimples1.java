package aulaLacoCondicional;
import java.util.Scanner;
public class LacosSimples1 {
	public static void main(String[] args) {
		Scanner ler =new Scanner(System.in);
	     int a,b, c , resposta;
	  	  
	     
	     
			System.out.println("Digite o valor de A:  " );
			a = ler.nextInt(); 
			 
			System.out.println("Digite o valor de B:  ");
			b = ler.nextInt(); 
			
			System.out.println("Digite o valor de C:  ");
			c = ler.nextInt(); 
			
		resposta = a+b; 

		if(resposta < c ) {
			System.out.println("A soma de A + B é menor que C  .");
		}

		if( resposta == c) {
			System.out.println("A Soma de A + B é Igual a C.");
		}
		
		if (resposta>c  ) {
			System.out.println("A Soma de A + B é Maior do que C");

	}
	
	

     
   	
}
}
