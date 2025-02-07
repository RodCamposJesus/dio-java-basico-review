package edu.rodrigo.segundasemana;

public class Operadores {

    public static void main(String[] args) {

        boolean condicional1 = true;

        boolean condicional2 = true;

        if(condicional1 && condicional2)
        {
            System.out.println("as duas condicções são verdadeiras");

        }
        if(condicional1 || condicional2)
        {
            System.out.println("uma das condições é verdadeira");

        }

        System.out.println("Fim");

        /*int a, b;
       a = 6;
       b = 6;
       String resultado = a==b ?"verdadeira" :"falso";
       int resultado = a==b ? 1 : 0;
       System.out.println(resultado);
       /*EXEMPLOCONDICIONAL UTILIZANDO UMA ESTRUTURA 
       IF/ELSE 
       if (a==b)
            resultado = "verdadeiro";
            else
            resultado = "falso";
         */

 /*String nomeUm = "Rodrigo";
      String nomeDois = "Rodrigo";

      System.out.println(nomeUm == nomeDois);

      int numero1 = 1;
      int numero2 = 2;
      
      boolean simNao = numero1 == numero2;
      if (numero1 > numero2){
         System.out.println("Nossa condição é verdadeira");
      }

      System.out.println("Número 1 é igual a  2? " + simNao);

      simNao = numero1 != numero2;
      System.out.println("NúmeroUm é diferente que númeroDois? " + simNao);

         */
    }

}
