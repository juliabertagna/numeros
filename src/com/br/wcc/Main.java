package com.br.wcc;

import com.br.wcc.models.IntegerNumber;
import com.br.wcc.models.ConjuntoNumeros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Entre com os números que gostaria de somar, digite um número e tecle 'Enter' até que esteja satisfeito com suas escolhas." +
                " Quando quiser parar digite 'stop'.");

        boolean flag = true;
        List<Number> numerosEntrados = new ArrayList<>();

        while (flag) {
            Scanner scanner = new Scanner(System.in);
            String entrada = scanner.nextLine();

            if (entrada.toUpperCase().equals("STOP")) {
                flag = false;
            } else {
                try {
                    numerosEntrados.add(Integer.parseInt(entrada));
                } catch (NumberFormatException ex) {
                    try {
                        numerosEntrados.add(Double.parseDouble(entrada));
                    } catch (NumberFormatException ex2) {
                        try {
                            numerosEntrados.add(Float.parseFloat(entrada));
                        } catch (NumberFormatException ex3) {
                            System.out.println("Entre com um número inteiro ou decimal!");
                        }
                    }
                }
            }
        }

        if (numerosEntrados.size() > 0){
            ConjuntoNumeros numeros = new ConjuntoNumeros(numerosEntrados.toArray(Number[]::new));
            System.out.println(numeros.somar());
        }

        System.out.println("Entre com o número que gostaria de ver a tabuada. Se quiser sair digite 'stop'.");

        flag = true;

        while (flag){
            Scanner scannerTabuada = new Scanner(System.in);
            String entradaTabuada = scannerTabuada.nextLine();

            if(entradaTabuada.toUpperCase().equals("STOP")){
                flag = false;
            }else{
                try {
                    IntegerNumber numero = new IntegerNumber(Integer.parseInt(entradaTabuada));
                    numero.escreverTabuada();
                    flag = false;
                } catch (NumberFormatException ex4) {
                    System.out.println("Entre com um número inteiro");
                }
            }
        }

    }
}
