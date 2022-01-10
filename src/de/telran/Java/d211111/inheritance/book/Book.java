package de.telran.d211111.inheritance.book;
// Абстрактный класс - это класс, который не подразумевает создание собственных представителей (объектов данного класса).
// позволяют создовать методы, которые не имеют тела
public abstract class Book { // мы добавили слово abstract - ссылки существуют, а объектов - нет
    private final int id; // обычно поля private или protected
    private final String title;
    private final String author;
    private final int basePrice;

    public Book(int id, String title, String author, int price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.basePrice = price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public abstract int computerPrice(); // abstract метод обязан быть реализовываться во всех дочерних классах

}
