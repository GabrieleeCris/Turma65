package aulaLacoCondicional;
import java.util.Scanner;

public class LacosSimples3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        boolean primeiraDoacao;

        System.out.println("Digite o nome do doador: ");
        nome = scanner.nextLine();

        System.out.println("Digite a idade do doador: ");
        idade =  scanner.nextInt();

        System.out.println("Primeira doação:  -true- para (sim) -false- para (não) ");
        primeiraDoacao = scanner.nextBoolean();

        if (idade >= 18 && idade <= 69) {
            System.out.println("Está apto a doar sangue!");

        }else if (idade <= 18) {
            System.out.println("Não está apto para doar!");
            
        }
        else if(idade >= 60 && idade <= 69) {
            System.out.println("Não está apto para doar!");

            }
        }

    











}