package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Casa casa = new Casa("azul", true, false, false);

        System.out.println("Cor:" + casa.getCor());
        System.out.println("Porta1:" + casa.isPorta1());
        System.out.println("Porta2:" + casa.isPorta2());
        System.out.println("Porta3:" + casa.isPorta3());
        System.out.println("Quantidade aberta:" + casa.quantasPortasEstaoAbertas());

        casa.setCor("Amarelo");
        casa.setPorta2(true);

        System.out.println("Cor:" + casa.getCor());
        System.out.println("Porta1:" + casa.isPorta1());
        System.out.println("Porta2:" + casa.isPorta2());
        System.out.println("Porta3:" + casa.isPorta3());
        System.out.println("Quantidade aberta:" + casa.quantasPortasEstaoAbertas());

        casa.setCor("Branco");
        casa.setPorta3(true);

        System.out.println("Cor:" + casa.getCor());
        System.out.println("Porta1:" + casa.isPorta1());
        System.out.println("Porta2:" + casa.isPorta2());
        System.out.println("Porta3:" + casa.isPorta3());
        System.out.println("Quantidade aberta:" + casa.quantasPortasEstaoAbertas());



    }
}
