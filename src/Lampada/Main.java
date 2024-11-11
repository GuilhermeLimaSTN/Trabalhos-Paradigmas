package Lampada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Informe a marca da lâmpada: ");
        String marca = scanner.nextLine();

        System.out.print("Informe a voltagem da lâmpada: ");
        int volts = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Informe o tipo da lâmpada: ");
        String tipo = scanner.nextLine();

        System.out.print("Informe o modelo da lâmpada: ");
        String modelo = scanner.nextLine();

        System.out.print("Informe a cor da lâmpada: ");
        String cor = scanner.nextLine();

        System.out.print("Informe o preço da lâmpada: ");
        double preço = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Informe a garantia da lâmpada: ");
        String garantia = scanner.nextLine();

        
        Lamp lampada = new Lamp(cor, marca, modelo, volts, tipo, garantia, preço);

        System.out.println(">>> INÍCIO DO SOFTWARE DA LÂMPADA <<<");
        System.out.println("COR: " + lampada.getCor());
        System.out.println("MARCA: " + lampada.getMarca());
        System.out.println("MODELO: " + lampada.getModelo());
        System.out.println("WATTS: " + lampada.getVolts());
        System.out.println("TIPO: " + lampada.getTipo());
        System.out.println("GARANTIA: " + lampada.getGarantia());
        System.out.println("PREÇO - R$: " + lampada.getPreço());
        lampada.mostrarStatus();

        int opcao;

        do {
            System.out.print("Ligar/Desligar lâmpada? 0 – Sair / 1 – Sim / 2 – Não: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    lampada.mudarStatus();
                    lampada.mostrarStatus();
                    break;
                case 2:
                    lampada.mostrarStatus();
                    break;
                case 0:
                    System.out.println("*** Você encerrou o software. ***");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}