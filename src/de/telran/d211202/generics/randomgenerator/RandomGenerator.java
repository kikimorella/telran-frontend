package de.telran.d211202.generics.randomgenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator {

    private final IRandomRule randomRule;

    public RandomGenerator(IRandomRule randomRule) {
        this.randomRule = randomRule;
    }

    public List<Integer> generateNumbers(int number) {
        //compose a list of "number" random numbers using "randomRule" and return
        List<Integer> list = new ArrayList<>();
        Random ran = new Random();
        for (int i = 0; i < number; i++) {
            int randomNumber = randomRule.nextInt();
            list.add(randomNumber);
        }
        return list;
    }
}
