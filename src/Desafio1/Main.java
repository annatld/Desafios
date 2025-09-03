package Desafio1;

abstract class Apresentacao {
    protected String nome;
    public Apresentacao (String nome){
        this.nome = nome;
    }
    public String apresentracao (){
        return "Sou " + nome;
    }

    public abstract String apresentacao();
}
class Professor extends Apresentacao{
    private String diciplina;
    public Professor (String nome, String diciplina ){
        super (nome);
        this.diciplina = diciplina;
    }
    @Override
    public String apresentacao(){
        return super.apresentracao() + ", professor de "+ diciplina ;

    }}


public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor("Sofia", "Matemática");
        System.out.println(prof.apresentacao());
    }
}
