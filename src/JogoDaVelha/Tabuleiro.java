package JogoDaVelha;

public class Tabuleiro {

    private char[][] tabuleiro = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    public void mostrarTabuleiro(){
        System.out.println("\n 0  1  2");
        for (int i = 0; i < 3; i++){
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++ ){
                System.out.print(tabuleiro[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println(" ---+---+---");
        }
    }

    public boolean cordenadaValida(int linha, int coluna){
        return linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ';
    }

    public  void marcarPosicao(int linha, int coluna, char simbolo){
        tabuleiro[linha][coluna] = simbolo;
    }

    public boolean verifVencedor(char simbolo){
        for (int i = 0; i < 3; i++){
            if ((tabuleiro[i][0] == simbolo && tabuleiro[i][1] == simbolo && tabuleiro[i][2] == simbolo) ||
                (tabuleiro[0][i] == simbolo && tabuleiro[1][i] == simbolo && tabuleiro[2][i] == simbolo)) {
               return true;
            }
        }
        return(tabuleiro[0][0] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][2] == simbolo) ||
              (tabuleiro[0][2] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][0] == simbolo);
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
