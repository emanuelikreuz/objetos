import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();
        ClienteService clienteService = new ClienteService();
        InteracaoUsuario interacaoUsuario = new InteracaoUsuario();
        FiltrarProdutoPorPreco  filtrarClientePorPreco = new FiltrarProdutoPorPreco();
        FiltrarClientePorIdade filtrarClientePorIdade=new FiltrarClientePorIdade();
        AdicionarProduto adicionarproduto =new AdicionarProduto();
    

    
        // Adicionar produtos
        produtos.add(new Produto("Notebook", 2500.00));
        produtos.add(new Produto("Smartphone", 1200.00));
        produtos.add(new Produto("Tablet", 800.00));

        // Adicionar clientes
        clientes.add(new Cliente("Alice", 30));
        clientes.add(new Cliente("Bob", 25));
        clientes.add(new Cliente("Carlos", 40));

        int opcao;
        do {
            // Exibir menu
            interacaoUsuario.apresentaMenu();
          


            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    clienteService.listarProdutos(produtos);
                    break;
                case 2:
                    filtrarClientePorIdade.listarClientes(clientes);
                    break;
                case 3:
                    filtrarClientePorPreco.filtrarProdutosPorPreco(scanner, produtos);
                    
                    break;
                case 4:
                   
                    filtrarClientePorIdade.filtrarClientesPorIdade(scanner, clientes);
                    break;

              case 5:
                
                    adicionarproduto.adicionarProduto(scanner, produtos);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
      
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);

        scanner.close();
    }
}
