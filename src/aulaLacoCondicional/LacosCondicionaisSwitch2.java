package aulaLacoCondicional;
import java.util.Scanner;
public class LacosCondicionaisSwitch2 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o nome do colaborador:");
	        String nomeColaborador = scanner.nextLine();

	        System.out.println("Digite o código do cargo do colaborador (1 a 6):");
	        int codigoCargo = scanner.nextInt();

	        System.out.println("Digite o salário do colaborador:");
	        float salario = scanner.nextFloat();

	        String nomeCargo;
	        float percentualReajuste;

	        switch (codigoCargo) {
	            case 1:
	                nomeCargo = "Cargo 1 ";
	                percentualReajuste = 5.0f;
	                break;
	            case 2:
	                nomeCargo = "Cargo 2";
	                percentualReajuste = 7.5f;
	                break;
	            case 3:
	                nomeCargo = "Cargo 3";
	                percentualReajuste = 10.0f;
	                break;
	            case 4:
	                nomeCargo = "Cargo 4";
	                percentualReajuste = 12.5f;
	                break;
	            case 5:
	                nomeCargo = "Cargo 5";
	                percentualReajuste = 15.0f;
	                break;
	            case 6:
	                nomeCargo = "Cargo 6";
	                percentualReajuste = 20.0f;
	                break;
	            default:
	                System.out.println("Código de cargo inválido.");
	                scanner.close();
	                return;
	        }

	        float salarioReajustado = salario + (salario * percentualReajuste / 100);

	        System.out.println("Nome do colaborador: " + nomeColaborador);
	        System.out.println("Cargo: " + nomeCargo);
	        System.out.println("Novo salário reajustado: R$" + salarioReajustado);

	        scanner.close();

	}

}
