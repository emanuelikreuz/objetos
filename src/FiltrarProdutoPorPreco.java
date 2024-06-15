import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FiltrarProdutoPorPreco {

    // Método para filtrar produtos com preço maior que o preço mínimo fornecido
    public void filtrarProdutosPorPreco(Scanner scanner, List<Produto> produtos) {
        System.out.print("Digite o preço mínimo para filtrar os produtos: ");
        
        // Verificação de entrada válida para preço mínimo
        while (!scanner.hasNextDouble()) {
            System.out.print("Entrada inválida. Por favor, digite um número válido para o preço mínimo: ");
            scanner.next();
        }
        
        double precoMinimo = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha
        
        // Filtrando produtos com preço maior que o preço mínimo
        List<Produto> produtosFiltrados = produtos.stream()
                                                  .filter(p -> p.getPreco() > precoMinimo)
                                                  .collect(Collectors.toList());

        // Verificação se algum produto foi encontrado
        if (produtosFiltrados.isEmpty()) {
            System.out.println("Nenhum produto encontrado com preço maior que R$" + precoMinimo);
        } else {
            System.out.println("Produtos com preço maior que R$" + precoMinimo + ":");
            produtosFiltrados.forEach(System.out::println);
        }
    }
}
