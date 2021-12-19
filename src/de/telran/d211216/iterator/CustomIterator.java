package de.telran.d211216.iterator;

public interface CustomIterator<T> { // Дженерик с типом, который мы будем указывать.
    // Каждый объект типа, который наследуется от итератора, имеет 2 основных метода.
    // Инкапсулировать в себя логику перебора коллекции

    /**
     * @return true if there is left something to iterate
     */
    boolean hasNext();

    /**
     * The method reterns the current element of collection, for which the iterator is intended. After that it "terns"
     * to the next element. Meaning the next invocation of the method will return the next element
     *
     * @return
     */
    T next();

}
