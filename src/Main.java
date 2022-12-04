import java.util.Scanner;
import entities.enums.OrderStatus;
import entities.Order;
import entities.Product;
import entities.OrderItem;
import entities.Cliente;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTRE COM DADOS DO CLIENTE: ");
        System.out.print("NOME: ");
        String clienteName = sc.nextLine();
        System.out.print("EMAIL: ");
        String clientEmail = sc.nextLine();
        System.out.print("DATA DE NASCIMENTO(dd/mm/aaaa): ");
        Cliente cliente = new Cliente(sc.nextLine(), clienteName, clientEmail);
        Order pedido = new Order(cliente);
        System.out.println("ENTRE COM DADOS DO PEDIDO: ");
        OrderStatus status = OrderStatus.PROCESSING;
        System.out.print("QUANTOS ITEMS TERÁ O PEDIDO: ");
        Integer quantidadeItems = sc.nextInt();
        for(int i = 0; i<quantidadeItems; i++){
            String produtoNome;
            Double produtoPrice = 0.0;
            Integer produtoQuantidade = 0;
            System.out.printf("ENTRE COM DADOS DO ITEM %d%n", i+1);
            sc.nextLine();
            System.out.print("PRODUTO NOME: ");
            produtoNome = sc.nextLine();
            System.out.print("PREÇO PRODUTO: ");
            produtoPrice = sc.nextDouble();
            System.out.print("QUANTIDADE: ");
            produtoQuantidade = sc.nextInt();
            pedido.addItem(new OrderItem(new Product(produtoNome, produtoPrice), produtoQuantidade));
        }

        System.out.println(pedido.toString());
        sc.close();

    }
}