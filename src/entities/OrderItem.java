package entities;
import entities.Product;
public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product produto;
    public OrderItem(){};
    public OrderItem(Product produto, Integer quantity){
        this.produto = produto;
        this.quantity = quantity;
    };
    public Integer getQuantity(){
        return this.quantity;
    };
    public String getProdutoName(){
        return produto.getName();
    };

    public Double subTotal(){
        return quantity*(price = produto.getPrice());
    }
}
