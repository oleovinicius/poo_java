package com.company;

public class Porta {
    public boolean aberta;
    public String cor;
    public int dimensaoX;
    public int dimensaoY;
    public int dimensaoZ;

    public Porta(){

    }

    public boolean getAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(int dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public int getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(int dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public int getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(int dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }

    public Porta(boolean aberta, String cor, int X, int Y, int Z){
        this.aberta = aberta;
        this.cor = cor;
        this.dimensaoX = X;
        this.dimensaoY = Y;
        this.dimensaoZ = Z;

    }


    public void abre(){
        this.aberta = true;
    }

    public void fecha(){
        this.aberta = false;

    }

    public void pinta(String novaCor) {
        this.cor = novaCor;
    }

    public boolean estaAberta() {
        if (this.aberta == true){
                return true;
        }
        else{
            return false;
        }
    }

}
