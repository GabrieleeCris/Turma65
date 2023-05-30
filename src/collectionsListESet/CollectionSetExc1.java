package collectionsListESet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionSetExc1 {

	public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 valores inteiros não repetidos:");

        for (int i = 0; i < 10; i++) {
            int valor = scanner.nextInt();
            integerSet.add(valor);
		
        }
        System.out.println("Elementos da Collection Set:");
        
        Iterator<Integer> iterator = integerSet.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.println(element);

}
}
}