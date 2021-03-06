package com.br.wcc;

import com.br.wcc.models.Fibonacci;
import com.br.wcc.models.IntegerNumber;
import com.br.wcc.models.Somador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sequenciaFib = readIntegerNumber("FIBONACCI");
        Fibonacci.imprimeSequencia(sequenciaFib);

        List<Number> numerosEntrados = readNumbersSum();

        if (numerosEntrados.size() > 0) {
            Somador numeros = new Somador(numerosEntrados.toArray(Number[]::new));
            System.out.println(numeros.somar());
        }

        int integerNumber = readIntegerNumber("TABUADA");

        if (integerNumber > 0){
           IntegerNumber numero = new IntegerNumber(integerNumber);
           numero.escreverTabuada();
        }
    }

    public static List<Number> readNumbersSum() {
        System.out.println("Entre com os números que gostaria de somar, digite um número e tecle 'Enter' até que esteja satisfeito com suas escolhas." +
                " Quando quiser parar digite 'stop'.");

        boolean flag = true;
        List<Number> numerosEntrados = new ArrayList<>();

        while (flag) {
            Scanner scanner = new Scanner(System.in);

            if (scanner.hasNextInt()){
                numerosEntrados.add(scanner.nextInt());
            }else if(scanner.hasNextDouble()){
                numerosEntrados.add(scanner.nextDouble());
            }else if(scanner.hasNextFloat()){
                numerosEntrados.add(scanner.nextFloat());
            }else if (scanner.nextLine().toUpperCase().equals("STOP")){
                flag = false;
            }else{
                System.out.println("Entre com um número inteiro ou decimal! Ou digite 'Stop' para sair");
            }
        }
        return numerosEntrados;
    }

    public static int readIntegerNumber(String tipo){
        if (tipo == "TABUADA"){
            System.out.println("Entre com o número que gostaria de ver a tabuada. Se quiser sair digite 'stop'.");
        }else if (tipo == "FIBONACCI"){
            System.out.println("Entre com o número que se refere à quantidade de valores da sequência de Fibonacci que gostaria de ver. Se quiser sair digite 'stop'.");
        }

        int integerNumber;
        boolean flag = true;

        while (flag){
            Scanner scannerTabuada = new Scanner(System.in);

            if(scannerTabuada.hasNextInt()){
                integerNumber = scannerTabuada.nextInt();

                if (integerNumber > 0){
                    return integerNumber;
                }else{
                    System.out.println("Entre com um número inteiro POSITIVO e MAIOR QUE ZERO!");
                }
            }else if(scannerTabuada.nextLine().toUpperCase().equals("STOP")){
                return -1;
            }else{
                System.out.println("Entre com um número inteiro POSITIVO e MAIOR QUE ZERO!");
            }
        }
        return -1;
    }
}
