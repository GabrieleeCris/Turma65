package estruturaDeDados;
import java.util.Scanner;
import java.util.Stack;

public class pilhaExc1 {

	public static void main(String[] args) {

		Stack<String> pilhaLivros = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\tMenu:");
            System.out.println("\t1: Adicionar um novo livro na pilha");
            System.out.println("\t2: Listar todos os livros da pilha");
            System.out.println("\t3: Retirar um livro da pilha");
            System.out.println("\t0: Finalizar o programa");
            System.out.print("\tDigite a opção desejada: ");
            opcao = scanner.nextInt();
	          
            switch (opcao) {
            case 1:
            	 System.out.print("\tDigite o nome do livro: ");
                 scanner.nextLine(); 
                 String nomeLivro = scanner.nextLine();
                 pilhaLivros.push(nomeLivro);
                 System.out.println("\tLivro adicionado à pilha.");
                 break;
             case 2:
                 if (pilhaLivros.isEmpty()) {
                     System.out.println("\tA pilha está vazia.");
                 } else {
                     System.out.println("\tLivros na pilha:");
                     for (String livro : pilhaLivros) {
                         System.out.println(livro);
                     }
                 }
                 break;
             case 3:
                 if (pilhaLivros.isEmpty()) {
                     System.out.println("\tA pilha está vazia.");
                 } else {
                     String livroRetirado = pilhaLivros.pop();
                     System.out.println("\tLivro retirado: " + livroRetirado);
                 }
                 break;
             case 0:
                 System.out.println("\tPrograma finalizado.");
                 break;
             default:
                 System.out.println("\tOpção inválida.");
         }
         System.out.println();
     }
}
}