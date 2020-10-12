package com.company;
import java.time.LocalDate;


public class FuncionarioTest {

    public static void main(String[] args) {
	// write your code here
        Funcionario joao = new Funcionario(01, "João Francisco", "Almoxerifado", LocalDate.now(), 2000.97, "58.951.684-6",true);
        Funcionario maria = new Funcionario(01, "Maria Aparecida", "Contabilidade", LocalDate.now(), 2985.98, "98.864.684-9",true);

        joao.imprime();
        maria.imprime();

        joao.atualizarSalario(500);

        joao.imprime();

        maria.demiteFuncionario();

        maria.imprime();




    }
}
