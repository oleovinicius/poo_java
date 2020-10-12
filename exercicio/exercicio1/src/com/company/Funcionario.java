package com.company;
import java.time.LocalDate;

public class Funcionario {
    private int idFunc;
    private String nomeFunc;
    private String departamento;
    private LocalDate dataContratacao;
    private double salario;
    private String documento;
    private boolean ativo;

    public Funcionario(){

    }

    public Funcionario(int id, String nome, String departamento, LocalDate dataContratacao,
                       double salario, String documento, boolean ativo){
        this.idFunc= id;
        this.nomeFunc = nome;
        this.departamento = departamento;
        this.dataContratacao = dataContratacao;
        this.salario = salario;
        this.documento = documento;
        this.ativo = ativo;

    }

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void atualizarSalario(double aumento){
        if ((getSalario()+aumento) > getSalario()) {
            setSalario(getSalario() + aumento);
        }

    }

    public void demiteFuncionario(){
        setAtivo(false);
    }

    public void imprime(){
        System.out.println("ID:" + getIdFunc());
        System.out.println("Nome:" + getNomeFunc());
        System.out.println("Departamento:" + getDepartamento());
        System.out.println("Data de contratação:" + getDataContratacao());
        System.out.println("Salario:" + getSalario());
        System.out.println("Documento:" + getDocumento());
        System.out.println("Ativo:" + isAtivo()+"\n");

    }



}
