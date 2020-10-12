package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code

        Porta portaCozinha = new Porta(true, "azul",0,0,0);

        System.out.println("Aberta:" + portaCozinha.getAberta());
        System.out.println("Cor:" + portaCozinha.getCor());
        System.out.println("X:" + portaCozinha.getDimensaoX());
        System.out.println("Y:" + portaCozinha.getDimensaoY());
        System.out.println("Z:" + portaCozinha.getDimensaoZ() );
        System.out.println("Esta aberta:" + portaCozinha.estaAberta() + "\n");

        portaCozinha.setAberta(false);
        portaCozinha.setCor("Azul");
        portaCozinha.setDimensaoX(150);
        portaCozinha.setDimensaoY(468);
        portaCozinha.setDimensaoZ(1760);



        System.out.println("Aberta:" + portaCozinha.getAberta());
        System.out.println("Cor:" + portaCozinha.getCor());
        System.out.println("X:" + portaCozinha.getDimensaoX());
        System.out.println("Y:" + portaCozinha.getDimensaoY());
        System.out.println("Z:" + portaCozinha.getDimensaoZ() );
        System.out.println("Esta aberta:" + portaCozinha.estaAberta() + "\n");


    }
}
