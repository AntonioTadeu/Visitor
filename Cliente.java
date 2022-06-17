public class Cliente implements Pessoa {

    private int senha;
    private String nome;

    public Aluno(int senha, String nome ) {
        this.senha = matricula;
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirCliente(this);
    }

}
