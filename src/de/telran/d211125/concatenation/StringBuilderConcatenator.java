package de.telran.d211125.concatenation;

public class StringBuilderConcatenator implements IConcatenator{
    @Override
    public String concat(String[] strs) {
        // concatenate the string using StringBuilder
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            strBuilder.append(strs[i]);
        }
        return strBuilder.toString();

    }
}
