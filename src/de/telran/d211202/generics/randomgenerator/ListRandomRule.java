package de.telran.d211202.generics.randomgenerator;

import java.util.List;
import java.util.Random;

//the class should have a constructor, which receives a list of numbers and the method nextInt must return
// only the numbers from this list
public class ListRandomRule implements IRandomRule {

    private List<Integer> numbers;

    public ListRandomRule(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public int nextInt() {
        Random ran = new Random();
        return ran.nextInt(numbers.toArray().length);
    }
}
// toArray() - Returns an array containing all of the elements in this list in proper sequence (from first to last
// element); the runtime type of the returned array is that of the specified array.