package JogoDaVelha;

public class player {

    private String nome;
    private char simbolo;

    public player(String nome, char simbolo){
        this.nome = nome;
        this.simbolo = simbolo;
    }

    public String getNome(){
        return nome;
    }

    public char getSimbolo(){
        return simbolo;
    }
}
