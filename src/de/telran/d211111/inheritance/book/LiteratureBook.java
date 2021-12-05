package de.telran.d211111.inheritance.book;

public class LiteratureBook extends Book{

    //  мы инициализировали Book через конструктор
    public LiteratureBook(int id, String title, String author, int basePrice) {
        super(id, title, author, basePrice);
    }

    @Override
    public int computerPrice() {
        return super.getBasePrice() + 10;
    }
}
