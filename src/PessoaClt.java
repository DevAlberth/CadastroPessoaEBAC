import java.util.Scanner;

public class PessoaClt extends Pessoa{

    Scanner scan = new Scanner(System.in);


    String cargo;
    Double salario;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public PessoaClt(String nome, int idade, Double cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }


    public void inserirNome(){
        System.out.println("PESSOA CLT: INSIRA UM NOME" + nome);
        nome = scan.nextLine();
        System.out.println("PESSOA CLT: Seu nome é " + nome);
    }

    @Override
    public String toString() {
        return "PessoaClt{}"+  " NOME: "  + nome + " IDADE: "  +  idade + " CPF: " + cpf;
    }

    public void inserirIdade(){
        System.out.println("PESSOA CLT: INSIRA UMA IDADE" + nome);
        idade = scan.nextInt();
        System.out.println("PESSOA CLT: Sua idade é " + idade);
    }

    public void inserirCpf(){
        System.out.println("PESSOA CLT: INSIRA SEU CPF" + nome);
        cpf = scan.nextDouble();
        System.out.println("PESSOA CLT: Seu CPF é " + cpf);
    }
}
