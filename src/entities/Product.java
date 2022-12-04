package entities;

public class Product {
    private String name;
    private Double price;
    public Product(){};
    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    };
    public String getName(){
        return this.name;
    };
    public Double getPrice(){
        return this.price;
    }
}
