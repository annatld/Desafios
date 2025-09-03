package Desafio2;


class Produto{
    private String nome;
    private double preco;


    public Produto (String nome, double preco ){
        this.nome =nome;
        if (preco > 0) {
            this.preco = preco;
        } else{
            this.preco =0;
        }
    }
    public void alterarPreco(double novoPreco){
        if (novoPreco > 0){
            this.preco = novoPreco;
        } else {
            System.out.println("Preço inválido.");
        }
    }

    public void exibirDados(){
        System.out.println("Produto: " + nome +  ",  Preço R$ "+ preco);
    }
}
public class Main {
    public static void main(String[] args) {
        Produto prod1 = new Produto("Caderno", 15.00);
        prod1.alterarPreco(20.00);
        prod1.exibirDados();

    }
}