
import java.util.Scanner;

public class Moto extends Veiculos{
    private int ano;


    public Moto(String nome,double preco,int ano){
        super(nome,preco);
        this.ano = ano;
    }


    public void setAno(int ano){
        this.ano = ano;
    }


    public void insertData() {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Nome/Modelo: ");
        setModelo(scanner.nextLine());
        System.out.println("Preco: ");
        this.setPreco(scanner.nextDouble());
        System.out.println("Ano: ");
        setAno(scanner.nextInt());
    }

    @Override
    public void printDados() {
        System.out.print(getClass().getSimpleName()+" - Nome/Modelo: "+getModelo()+", Preco: "+getPreco()+", Ano:"+getAno()+"");
    }

    public int getAno() {
        return ano;
    }


}
