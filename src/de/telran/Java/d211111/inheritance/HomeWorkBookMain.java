package de.telran.d211111.inheritance;

import de.telran.d211111.inheritance.book.BestSeller;
import de.telran.d211111.inheritance.book.Book;
import de.telran.d211111.inheritance.book.LiteratureBook;
import de.telran.d211111.inheritance.book.TechnicalBook;

/*
1. Book содержит поля id(int), title(String), author(String), price(int), геттеры к ним и метод int computePrice(),
который просто отдает цену книги
2. TechnicalBook наследует книгу, плюс имеет поле scientificField(String) - научная область
3. LiteratureBook наследует книгу, кроме того цена литературной книги рассчитывается из суммы базовой стоимости и
10 условных единиц
4. BestSeller наслудует литературную книгу(!) и имеет дополнительное поле, которое рассчитывается из стоимости
литературной(!) книги, умноженной на коэффициент
Все классы должны содержать единственный конструктор, позволяющий задать все поля новому объекту.
В классе Main написать статический метод String describeBook(Book book), отдающий описание книги (использующее поля книги)
В метое main создать несколько книг, сделать массив из них и вызвать описание каждой книги из массива.
*/
public class HomeWorkBookMain {
    public static void main(String[] args) {
        // тип ссылки должен быть менее конкретный, чем более конкретная ссылка
        Book theLittlePrince = new LiteratureBook(1, "The Little Prince", "Antoine de Saint-Exupéry", 26);
        Book theInnovators = new TechnicalBook(2, "The Innovators", "Walter Isaacson", 39, "Biography");
        LiteratureBook harryPotter = new LiteratureBook(3, "Harry Potter", "J. K. Rowling", 47);
        Book theLordOfTheRings = new BestSeller(4, "The Lord of the Rings", "J. R. R. Tolkien", 37, 1.5);

        Book[] book = {theLittlePrince, theInnovators, harryPotter, theLordOfTheRings};
        // book[2] - не смотря на то, что это LiteratureBook, он все равно book, т.к. book - родительский класс
        // тип ссылок должен быть более конкретный, чем тип массива
        describeBooks(book);
        /*
        for (int i = 0; i < books.length; i++) {
            String description = describeBook(books[i]);
            System.out.println(description);
        }
        */
    }
    // полиморфизм - возможность применять один и тот же метод у объектов различных классов, связанных общим родителем
    public static String describeBook(Book book) { // мы работаем с типом book или более конкретный. используя ссылку,
        // мы не знаем каким типом является ссылка, но можем её использовать
        return "The book " + book.getTitle() + ", written by " + book.getAuthor() + ", costs " + book.computerPrice();
    }

    public static void describeBooks(Book[] book) {
        for (int i = 0; i < book.length; i++) {
            System.out.println(describeBook(book[i])); // мы можем использовать метод, который уже создан
        }
    }
}