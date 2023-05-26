package aulaLacoCondicional;
import java.util.Scanner;
public class LacoCondicionaISwitch1 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o código do item (1 a 6):");
        int codigoItem = scanner.nextInt();
        
        System.out.println("Digite a quantidade comprada:");
        int quantidadeComprada = scanner.nextInt();
        
        String nomeItem;
        double precoItem;
        
        switch (codigoItem) {
            case 1:
                nomeItem = "Produto 1";
                precoItem = 10.0;
                break;
            case 2:
                nomeItem = "Produto 2";
                precoItem = 15.0;
                break;
            case 3:
                nomeItem = "Produto 3";
                precoItem = 20.0;
                break;
            case 4:
                nomeItem = "Produto 4";
                precoItem = 25.0;
                break;
            case 5:
                nomeItem = "Produto 5";
                precoItem = 30.0;
                break;
            case 6:
                nomeItem = "Produto 6";
                precoItem = 35.0;
                break;
            default:
                System.out.println("Código de item inválido.");
                scanner.close();
                return;
        }
        
        double valorTotal = quantidadeComprada * precoItem;
        
        System.out.println("Valor total da conta: R$" + valorTotal);
        System.out.println("Item comprado: " + nomeItem);
        
        scanner.close();
    }

}


	


