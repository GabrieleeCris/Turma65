package aulaLacoCondicional;
import java.util.Scanner;
public class OperadoresLogicos {

	public static void main(String[] args) {
    Scanner ler = new Scanner(System.in); 
	int proat,trab;
	
	System.out.println("digite sua nota trabalho em equipe:");
	proat = ler.nextInt();
	
	System.out.println("digite sua nota trabalho em equipe:");
	trab = ler.nextInt();
	
	
	
	System.out.println("\n é preciso ter as duas notas 4:");
	if(proat ==4 && trab ==4) {
	 System.out.println("Parabéns duas notas4: ");
	
	}else {
    System.out.println("Sinto muito você não possui duas nota4!!");
}
}
}