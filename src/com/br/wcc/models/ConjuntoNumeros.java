package com.br.wcc.models;

import java.awt.geom.FlatteningPathIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConjuntoNumeros<T extends Number> {
    private final List<T> numbers = new ArrayList<T>();

    public ConjuntoNumeros(T... numeros) {
        this.numbers.addAll(Arrays.asList(numeros));
    }

    public Number somar(){
        if (numbers.get(0) instanceof Integer) {
            System.out.print("Soma de "+numbers.size()+" números inteiros = ");
            int sum = 0;

            for(T number:numbers){
                sum += number.intValue();
            }

            return sum;
        } else if (numbers.get(0) instanceof Double) {
            System.out.print("Soma de "+numbers.size()+" números Double = ");
            double sum = 0D;

            for(T number:numbers){
                sum += number.doubleValue();
            }

            return sum;
        } else if (numbers.get(0) instanceof Float) {
            System.out.print("Soma de "+numbers.size()+" números Float = ");
            float sum = 0F;

            for(T number:numbers){
                sum += number.floatValue();
            }

            return sum;
        } else {
            return null;
        }
    }
}
