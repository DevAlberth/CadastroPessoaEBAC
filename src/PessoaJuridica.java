import java.util.Scanner;

public class PessoaJuridica extends Pessoa{

    String cargo;
    Double salario;

    public PessoaJuridica(String cargo, Double salario, Scanner scan) {

        this.cargo = cargo;
        this.salario = salario;
        this.scan = scan;
    }

    public PessoaJuridica(String nome, int idade, Double cpf) {
        this.cpf = cpf;
        this.idade = idade;
        this.nome = nome;
    }

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

    Scanner scan = new Scanner(System.in);

    public void inserirNome(){
        System.out.println("PESSOA CLT: INSIRA UM NOME" + nome);
        nome = scan.nextLine();
        System.out.println("PESSOA CLT: Seu nome é " + nome);
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
