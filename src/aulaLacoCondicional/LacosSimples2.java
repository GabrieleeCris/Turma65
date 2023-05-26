package aulaLacoCondicional;

import java.util.Scanner;

public class LacosSimples2 {

	public static void main(String[] args) {
	 Scanner ler = new Scanner(System.in);


		int num; 
 
   System.out.println("Digite um numero inteiro:  ");
       num = ler.nextInt();
      if (num>=0) {      
    	  if (num %2==0) {
    	   System.out.println("O número:  " + num + " é par e positivo!");
      }
      else {
   	   System.out.println("O número:  " + num + " é impar negativo!");

}
}
      else {
   	   	   System.out.println("O número:  " + num + " é par negativo!");
             }   	  
	
	if (num > 0) {
        System.out.println("O número " + num + " é ímpar e positivo!");
    } else if (num < 0) {
        System.out.println("O número " + num + " é ímpar e negativo!");
    } else {
        System.out.print("O número é zero");
            }
    	  }

}



