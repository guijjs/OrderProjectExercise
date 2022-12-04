package entities;
import entities.OrderItem;
import entities.Cliente;
import entities.Product;
import entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment = LocalDateTime.now();
    private OrderStatus status = OrderStatus.PROCESSING;
    private List<OrderItem> items = new ArrayList<>();
    private Cliente cliente;
    private Product produto;
    public Order(Cliente cliente){
        this.cliente = cliente;
    };
    public void addItem(OrderItem item ){
        items.add(item);
    };
    public void removeItem(OrderItem item){
        items.remove(item);
    };
    public String toString(){
        Double sum = 0.0;
        StringBuilder orderTexto = new StringBuilder();
        orderTexto.append("DETALHES DO PEDIDO: \n");
        orderTexto.append("DATA E HORA DO PEDIDO: "+moment+ "\n");
        orderTexto.append("STATUS DO PEDIDO: "+status+"\n");
        orderTexto.append("Cliente: "+ cliente.getName() + "("+cliente.getDataNasc()+")"+" - "+ cliente.getEmail()+"\n");
        orderTexto.append("ITEMS: \n");
        for(OrderItem item : items){
            orderTexto.append("\nNOME: "+item.getProdutoName() + "\nQUANTIDADE: "+item.getQuantity()+"\nSUBTOTAL: "+item.subTotal());
            sum += item.subTotal();
        };
        orderTexto.append("\n\nTOTAL: R$"+sum);
        return orderTexto.toString();
    };
}