package de.telran.d211202.generics.randomgenerator;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {
        Random random = new Random(); // случайное число
        int a = random.nextInt(); // следующее случайное число

        // max random generator
        IRandomRule rangeRandomRule = new MaxRandomRule(10);
        RandomGenerator rangeGenerator = new RandomGenerator(rangeRandomRule);

        List<Integer> randomNumbers = rangeGenerator.generateNumbers(20);
        System.out.println(randomNumbers.toString());

        // list random generator
        Integer[] numbers = {10, 8, 15};
        List<Integer> numberList = Arrays.asList(numbers); // .asList принимает набор Объектов
        IRandomRule listRandomRule = new ListRandomRule(numberList);
        RandomGenerator listRandomGenerator = new RandomGenerator(listRandomRule);

        randomNumbers = listRandomGenerator.generateNumbers(20);
        System.out.println(randomNumbers.toString());
    }
}
