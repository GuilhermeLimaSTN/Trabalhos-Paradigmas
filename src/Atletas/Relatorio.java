package Atletas;

public class Relatorio {

    public static float pesoMedio(Atleta[] atletas){
        float somaPeso = 0;
        for (int i = 0; i < atletas.length; i++){
            somaPeso += atletas[i].getPeso();
        }
        return somaPeso / atletas.length;
    }


    public static String encAtletaMaisAlto(Atleta[] atletas){
        Atleta maisAlto = atletas[0];
        for (int i = 1; i < atletas.length; i++){
            if (atletas[i].getAltura() > maisAlto.getAltura()){
                maisAlto = atletas[i];
            }
        }
        return maisAlto.getNome();

    }

}
