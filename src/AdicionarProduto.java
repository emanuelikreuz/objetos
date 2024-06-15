import java.util.List;
import java.util.Scanner;

public class AdicionarProduto {

    public void adicionarProduto(Scanner scanner, List<Produto> produtos) {
        System.out.print("Digite o nome do novo produto: ");
        String nomeProduto = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        
        while (!scanner.hasNextDouble()) {
            System.out.print("Entrada inválida. Por favor, digite um número válido para o preço: ");
            scanner.next();
        }
        
        double precoProduto = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha

        produtos.add(new Produto(nomeProduto, precoProduto));
        System.out.println("Produto adicionado: " + produtos.get(produtos.size() - 1));
    }
}
