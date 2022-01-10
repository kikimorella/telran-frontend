package de.telran.d211202.generics.randomgenerator;

import java.util.Random;

// the class should have a constructor, which receives two positive numbers and the method nextInt must return
// only random numbers between the first one inclusive and the second one exclusive
public class RangeRandomRule implements IRandomRule{

    private final int min;
    private final int max;
    private final Random ran = new Random();

    public RangeRandomRule(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public int nextInt() {
        int res = 0;
        // Random ran = new Random();
        int range = max - min;
        res = min + ran.nextInt(range);
        // любое случайное число от 0 до разницы максимума и минимума, и 0 мы двигаем на значение минимума
        return res;

        /*
        public int nextInt() {
            int range = max - min;
            return min + ran.nextInt(range);
            }
         */
    }
}
