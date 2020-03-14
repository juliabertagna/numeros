package com.br.wcc.models;

import java.util.stream.IntStream;

public class IntegerNumber {
    public final int number;

    public IntegerNumber(int number) {
        this.number = number;
    }

    public void escreverTabuada() {
        System.out.println("Tabuada do "+number+":");

        IntStream.range(1, 11).forEachOrdered(n -> {
            System.out.println(n + " x "+ number+ " = " + (n*number));
        });
    }
}
