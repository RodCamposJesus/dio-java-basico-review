package edu.rodrigo.segundasemana;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 8;
        if(mediaFinal < 6)
           System.out.println("REPROVADO");
        else if(mediaFinal == 6)
           System.out.println("RECUPERÇÃO");
        else
           System.out.println("APROVADO");  
    }
}
