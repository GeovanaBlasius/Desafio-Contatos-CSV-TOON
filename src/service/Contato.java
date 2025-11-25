package service;

public class Contato {

    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String dataNascimento;

    public Contato(int id, String nome, String email, String telefone, String dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public Contato(String trim, String trim1, String trim2) {
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }
    public String getDataNascimento() { return dataNascimento; }

    @Override
    public String toString() {
        return id + ";" + nome + ";" + email + ";" + telefone + ";" + dataNascimento;
    }
}
