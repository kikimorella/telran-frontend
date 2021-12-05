package de.telran.d211202.generics.randomgenerator;

import java.util.List;
import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {
        Random random = new Random(); // случайное число
        int a = random.nextInt(); // следующее случайное число

        IRandomRule rangeRandomRule = new MaxRandomRule(10);
        RandomGenerator generator = new RandomGenerator(rangeRandomRule);

        List<Integer> randomNumbers = generator.generateNumbers(100);
    }
}
