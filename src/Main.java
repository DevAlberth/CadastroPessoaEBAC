public class Main {
    public static void main(String[] args) {
//       PessoaClt p = new PessoaClt();
        CadastroPessoas c = new CadastroPessoas();

// COMANDOS PARA PESSOA CLT
//        p.inserirNome();
//        p.inserirIdade();
//        p.inserirCpf();



        c.inserirPessoaClt("Alberth", 22, 123d);
        c.inserirPessoaClt("Pedro", 23, 123d);
        c.inserirPessoaClt("Isabela", 30, 123d);

        c.inserirPessoaJuridica("Jão", 22, 123d);
        c.inserirPessoaJuridica("Agustinho", 23, 123d);
        c.inserirPessoaJuridica("Rebeca", 30, 123d);

        c.mostrarListaClt();



    }


}

