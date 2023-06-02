package aulaProgramacaoOrientadaObjeto;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("João da Silva", 30, "Rua A, 123", "99999999", "joao@com");
        Cliente cliente2 = new Cliente("Maria Oliveira", 25, "Rua B, 123", "88888888", "maria@com");

        System.out.println("Dados do cliente 1:");
        cliente1.visualizar();

        System.out.println("\nDados do cliente 2:");
        cliente2.visualizar();
        
        
        
        
        

	}

}
