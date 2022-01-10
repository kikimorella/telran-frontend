package de.telran.d211115.list.list;

import org.junit.jupiter.api.BeforeEach;

class CustomArrayListTest extends CustomListTest{
@BeforeEach
    public void init(){
    intList = new CustomLinkedList<>();
    stringList = new CustomLinkedList<>();
    // при запуске выпала ошибка на removeByValue. Мы его исправили.
}
}