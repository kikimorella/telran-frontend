package de.telran.d211115.list.list;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class AdvancedArrayListTest extends CustomListTest {

    @BeforeEach
    public void init() {
        intList = new AdvancedArrayList<>(0);
        stringList = new AdvancedArrayList<>(0);
    }

}