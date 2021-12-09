package de.telran.d211202.generics.randomgenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//the class should have a constructor, which receives a list of numbers and the method nextInt must return
// only the numbers from this list
public class ListRandomRule implements IRandomRule {

    private final List<Integer> numbers;
    private final Random ran = new Random();

    public ListRandomRule(List<Integer> numbers) {
        // this.numbers = numbers; // лучше создать лист, который копия уже созданного листа
        this.numbers = new ArrayList<>(numbers);
    }

    @Override
    public int nextInt() {
        int index = ran.nextInt(numbers.size()); // числа от 0 до размера листа - 1
        return numbers.get(index);
    }
}
// toArray() - Returns an array containing all of the elements in this list in proper sequence (from first to last
// element); the runtime type of the returned array is that of the specified array.