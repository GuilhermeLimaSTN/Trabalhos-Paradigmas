package JogoDaVelha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Tabuleiro tabuleiro = new Tabuleiro();

        System.out.print("Jogador 1 (X): ");
        Player player1 = new Player(scanner.nextLine(), 'X');

        System.out.print("Jogador 2 (O): ");
        Player player2 = new Player(scanner.nextLine(), 'O');

        Player playerAtual = player1;
        boolean playerAtivo = true;

        System.out.println("Jogo da Velha.");


        while (playerAtivo){
            tabuleiro.mostrarTabuleiro();
            System.out.println(playerAtual.getNome() + " (" + playerAtual.getSimbolo() + "), sua vez.");
            System.out.print("Insira a linha (0-2): ");
            int linha = scanner.nextInt();
            System.out.print("Insira a coluna (0-2): ");
            int coluna = scanner.nextInt(); 

            if (tabuleiro.cordenadaValida(linha, coluna)){
                tabuleiro.marcarPosicao(linha, coluna, playerAtual.getSimbolo());
                    
                if (tabuleiro.verifVencedor(playerAtual.getSimbolo())){
                    tabuleiro.mostrarTabuleiro();
                    System.out.println(playerAtual.getNome() + " é o vencedor!");
                    playerAtivo = false;   
                }
                else if(tabuleiro.tabuleiroCheio()){
                    tabuleiro.mostrarTabuleiro();
                    System.out.println("Empate");
                    playerAtivo = false;
                }
                else{
                    playerAtual = (playerAtual == player1) ? player2 : player1;
                }
            }
            else{
                System.out.println("Coordenada invalida!");
            }
        }
        scanner.close();
    }

}
