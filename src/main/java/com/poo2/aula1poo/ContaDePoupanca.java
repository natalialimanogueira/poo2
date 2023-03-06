package com.poo2.aula1poo;

public class ContaDePoupanca {
    private static Double taxaDeJurosAbual;
    private Double saldoDaPoupanca = 00.00;


    public static Double getTaxaDeJurosAbual() {
        return taxaDeJurosAbual;
    }

    public static void setTaxaDeJurosAbual(Double taxaDeJurosAbual) {
        ContaDePoupanca.taxaDeJurosAbual = taxaDeJurosAbual;
    }

    public Double getSaldoDaPoupanca() {
        return saldoDaPoupanca;
    }

    public void setSaldoDaPoupanca(Double saldoDaPoupanca) {
        this.saldoDaPoupanca = saldoDaPoupanca;
    }

    public Double calculeRendimentoMensal(){
         saldoDaPoupanca += (saldoDaPoupanca  *  (taxaDeJurosAbual /100) /12);
         return saldoDaPoupanca;
    }

    public static void modifiqueTaxaDeJuros (Double valor){
        taxaDeJurosAbual = valor;

    }

    @Override
    public String toString() {
        return "ContaDePoupanca{" +
                "saldoDaPoupanca=" + saldoDaPoupanca +
                '}';
    }
}
