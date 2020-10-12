package com.company;

public class Casa {

    public String cor;
    public boolean porta1;
    public boolean porta2;
    public boolean porta3;

    public Casa(){}

    public Casa(String cor, boolean porta1, boolean porta2, boolean porta3) {
        this.cor = cor;
        this.porta1 = porta1;
        this.porta2 = porta2;
        this.porta3 = porta3;
    }

    public void pinta(String s) {
        setCor("s");
    }

    public int quantasPortasEstaoAbertas(){
        int qtd = 0;
        if(isPorta1() == true){
            qtd++;
        } if (isPorta2() == true){
            qtd++;
        } if (isPorta3() == true){
            qtd++;
        }

        return qtd;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isPorta1() {
        return porta1;
    }

    public void setPorta1(boolean porta1) {
        this.porta1 = porta1;
    }

    public boolean isPorta2() {
        return porta2;
    }

    public void setPorta2(boolean porta2) {
        this.porta2 = porta2;
    }

    public boolean isPorta3() {
        return porta3;
    }

    public void setPorta3(boolean porta3) {
        this.porta3 = porta3;
    }
}
