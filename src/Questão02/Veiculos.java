
import java.util.Scanner;

public abstract class Veiculos {
    private String modelo;
    private double preco;


    public Veiculos(String nome, double preco){
        this.modelo = nome;
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }

    public abstract void printDados(); 


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


}
