package de.telran.d211202.generics.randomgenerator;

import java.util.Random;

// The class should have a constructor, which receives number and the method must return only random numbers between 0
// inclusive and max exclusive
public class MaxRandomRule implements IRandomRule{

    private final int max;

    public MaxRandomRule(int max) {
        this.max = max;
    }

    @Override
    public int nextInt() {
        Random ran = new Random();

        return ran.nextInt(max); // nextInt(bound) - от 0 до указанного значения;
    }
}
