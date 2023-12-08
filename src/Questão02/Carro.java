

import java.util.Scanner;

public class Carro extends Veiculos{
    private double km;


    public Carro(String nome, double preco, double km){
        super(nome,preco);
        this.km = km;
    }


    public void setKm(double km) {
        this.km = km;
    }


    public void insertData() {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Nome/Modelo: ");
        setModelo(scanner.nextLine());
        System.out.println("Preco: ");
        this.setPreco(scanner.nextDouble());
        System.out.println("km: ");
        setKm(scanner.nextDouble());
    }

    @Override
    public void printDados() {
        System.out.print(getClass().getSimpleName()+" - Nome/Modelo: "+getModelo()+", Preco: "+getPreco()+", Km: "+getKm());
    }

    public double getKm() {
        return km;
    }
}
