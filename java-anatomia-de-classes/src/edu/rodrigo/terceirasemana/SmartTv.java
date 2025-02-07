package edu.rodrigo.terceirasemana;

public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Alterado para o canal " + canal);

    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentado para o canal " + canal);
    }

    public void diminuirVolume(){
        volume--;//volume = volume -1 
        System.out.println("Diminuído para o canal " + canal);
    }

    public void aumentarVolume(){
        volume++;//volume = volume + 1
        System.out.println("Aumentar volume para " + volume);
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;

    }
}
