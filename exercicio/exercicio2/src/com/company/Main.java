package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pessoa joao = new Pessoa("João Almeida",21);

        System.out.println("Nome:" + joao.getNome());
        System.out.println("Idade:" + joao.getIdade());

        joao.fazAniversario();

        System.out.println("Nome:" + joao.getNome());
        System.out.println("Idade:" + joao.getIdade());




    }
}
