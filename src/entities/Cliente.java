package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {
    private String name;
    private String email;
    private LocalDate dataNasc;
    public Cliente(){};
    public Cliente(String dataNasc, String name, String email){
        this.dataNasc = LocalDate.parse(dataNasc, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.name = name;
        this.email = email;
    };
    public String getDataNasc(){
        return dataNasc.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    };
    public String getName(){
        return this.name;
    };
    public String getEmail(){
        return this.email;
    }
}
