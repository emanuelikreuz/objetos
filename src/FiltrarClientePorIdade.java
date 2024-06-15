import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FiltrarClientePorIdade {

    // Método para listar todos os clientes
    public void listarClientes(List<Cliente> clientes) {
        System.out.println("\nClientes:");
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            clientes.forEach(System.out::println);
        }
    }

    // Método para filtrar clientes com idade maior que a idade mínima fornecida
    public void filtrarClientesPorIdade(Scanner scanner, List<Cliente> clientes) {
        System.out.print("Digite a idade mínima para filtrar os clientes: ");
        
        // Verificação de entrada válida para idade mínima
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada inválida. Por favor, digite um número inteiro válido para a idade mínima: ");
            scanner.next(); // Consome a entrada inválida
        }
        
        int idadeMinima = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        // Filtrando clientes com idade maior que a idade mínima
        List<Cliente> clientesFiltrados = clientes.stream()
                                                  .filter(c -> c.getIdade() > idadeMinima)
                                                  .collect(Collectors.toList());

        // Verificação se algum cliente foi encontrado
        if (clientesFiltrados.isEmpty()) {
            System.out.println("Nenhum cliente encontrado com idade maior que " + idadeMinima + " anos.");
        } else {
            System.out.println("Clientes com idade maior que " + idadeMinima + " anos:");
            clientesFiltrados.forEach(System.out::println);
        }
    }

    
}
