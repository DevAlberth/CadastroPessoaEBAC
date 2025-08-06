import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroPessoas {

    Scanner scan = new Scanner(System.in);

    List<PessoaClt> c = new ArrayList<>();
    List<PessoaJuridica> p = new ArrayList<>();
//    String nome;
//    int idade;
//    Double cpf;


    public void inserirPessoaClt(String nome, int idade, Double cpf){



        c.add(new PessoaClt(nome, idade, cpf));
    }

    public void inserirPessoaJuridica(String nome, int idade, Double cpf){

        p.add(new PessoaJuridica(nome,idade ,cpf));
    }

    public void mostrarListaClt (){
        for(PessoaClt cp : c){
            System.out.println("PESSOA CLT LISTA ==========> " + " NOME: " + cp.nome + " IDADE: " + cp.idade + " CPF: " + cp.cpf);
        }
        for(PessoaJuridica pp : p){
            System.out.println("PESSOA JURIDICA LISTA ==========> " + " NOME: " + pp.nome + " IDADE: " + pp.idade + " CPF: " + pp.cpf);
        }
    }
}
