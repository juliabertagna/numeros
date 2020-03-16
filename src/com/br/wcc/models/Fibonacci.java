package com.br.wcc.models;

public class Fibonacci {
    public static long imprimeSequencia(int n){
        if(n < 2){
           return  n;
        }else{
            return imprimeSequencia(n - 1) + imprimeSequencia(n - 2);
        }
    }
}
