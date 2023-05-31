package estruturaDeDados;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class filaExc1 {

	public static void main(String[] args) {
		Queue<String> filaClientes = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("Menu:");
            System.out.println("\t1: Adicionar um novo Cliente na fila");
            System.out.println("\t2: Listar todos os Clientes na fila");
            System.out.println("\t3: Chamar (retirar) uma pessoa da fila");
            System.out.println("\t0: Finalizar o programa");
            System.out.print("\tDigite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
            case 1:
                System.out.print("Digite o nome do Cliente: ");
                scanner.nextLine(); // Consumir a quebra de linha pendente
                String nomeCliente = scanner.nextLine();
                filaClientes.add(nomeCliente);
                System.out.println("Cliente adicionado à fila.");
                break;
            case 2:
                if (filaClientes.isEmpty()) {
                    System.out.println("A fila está vazia.");
                } else {
                    System.out.println("Clientes na fila:");
                    for (String cliente : filaClientes) {
                        System.out.println(cliente);
                    }
                }
                break;
            case 3:
                if (filaClientes.isEmpty()) {
                    System.out.println("A fila está vazia.");
                } else {
                    String clienteChamado = filaClientes.poll();
                    System.out.println("Cliente chamado: " + clienteChamado);
                }
                break;
            case 0:
                System.out.println("Programa finalizado.");
                break;
            default:
                System.out.println("Opção inválida.");
        }
        System.out.println();
        }

        scanner.close();
    }

		
		
}
