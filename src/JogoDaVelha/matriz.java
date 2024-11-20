package JogoDaVelha;

public class matriz {

    private char[][] tabuleiro = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    public void mostrarTabuleiro(){
        System.out.println(" 0  1  2");
        for (int i = 0; i < 3; i++){
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++ ){
                System.out.print(tabuleiro[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println(" ---+---+---");
        }
    }

    public boolean cordenadaValida(int linha, int coluna){
        return linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ';
    }

    public  void marcarPosicao(int linha, int coluna, char player){
        tabuleiro[linha][coluna] = player;
    }

    public boolean verifVencedor(char player){
        for (int i = 0; i < 3; i++){
            if ((tabuleiro[i][0] == player && tabuleiro[i][1] == player && tabuleiro[i][2] == player) ||
                (tabuleiro[0][i] == player && tabuleiro[1][i] == player && tabuleiro[2][i] == player));{
               return true;
            }
        }
        return(tabuleiro[0][0] == player && tabuleiro[1][1] == player && tabuleiro[2][2] == player) ||
              (tabuleiro[0][2] == player && tabuleiro[1][1] == player && tabuleiro[2][0] == player);
    }

    public boolean tabuleiroCheio(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (tabuleiro[i][j] == ' '){
                    return false;
                }
            }
        }
        return true;
    }
}
