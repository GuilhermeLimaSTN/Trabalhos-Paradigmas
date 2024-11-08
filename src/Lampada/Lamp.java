package Lampada;

public class Lamp {

    private String cor;
    private String marca;
    private String modelo;
    private int volts;
    private String tipo;
    private int garantia;
    private float preço;

    public Lamp (cor, marca, modelo, volts, tipo, garantia, preço){
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.volts = volts;
        this.tipo = tipo;
        this.garantia = garantia;
        this.preço = preço;
    }

    public String getCor(){
        return cor;
    }

    public String getMarca(
        return marca;
    )

    public String getModelo(){
        return modelo;
    }

   public int getVolts(){
        return volts;
    }

    public String getTipo(){
        return tipo;
    }

    public int getGarantia(){
        return garantia;
    }

    public float getPreço(){
        return preço;
    }
}
