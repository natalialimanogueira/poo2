package com.poo2.aula1poo;

public class ContaDePoupancaTeste {
     public static void main(String[] args) {

         ContaDePoupanca poupador1 = new ContaDePoupanca();
         ContaDePoupanca poupador2 = new ContaDePoupanca();
         poupador1.setSaldoDaPoupanca(2000.00);
         poupador2.setSaldoDaPoupanca(3000.00);

         System.out.println("SAldo conta poupador sem rendimento");

         System.out.println(poupador1.toString());
         System.out.println(poupador2.toString());

         ContaDePoupanca.modifiqueTaxaDeJuros(6.00);

         System.out.println();
         System.out.println("SAldo conta poupador com rendimento");

         poupador1.calculeRendimentoMensal();
         poupador2.calculeRendimentoMensal();

         System.out.println(poupador1.toString());
         System.out.println(poupador2.toString());



    }
}
