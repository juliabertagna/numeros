package com.br.wcc.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Somador<T extends Number> {
    private final List<T> numbers = new ArrayList<T>();

    public Somador(T... numeros) {
        this.numbers.addAll(Arrays.asList(numeros));
    }

    public Number somar(){
        if (numbers.get(0) instanceof Integer) {
            System.out.print("Soma de "+numbers.size()+" números inteiros = ");
            List<Integer> listaInt = (List<Integer>)numbers;

            return listaInt.stream().reduce(0, Integer::sum);
        } else if (numbers.get(0) instanceof Double) {
            System.out.print("Soma de "+numbers.size()+" números Double = ");
            List<Double> listaDouble = (List<Double>)numbers;

            return listaDouble.stream().reduce(0.0D, Double::sum);
        } else if (numbers.get(0) instanceof Float) {
            System.out.print("Soma de "+numbers.size()+" números Float = ");
            List<Float> listaFloat = (List<Float>)numbers;

            return listaFloat.stream().reduce(0.0F, Float::sum);
        } else {
            return null;
        }
    }
}
