package de.telran.d211111.inheritance.book;

public class BestSeller extends LiteratureBook{

    private final double coef; // мы его нигде не меняем, потому он final

    public BestSeller(int id, String title, String author, int basePrice, double coef) {
        super(id, title, author, basePrice);
        this.coef = coef;
    }

    public double getCoef() {
        return coef;
    }

    @Override
    public int computerPrice() {
        return (int) (super.computerPrice() * coef); // выражение нужно перевести в int, т.к. double coef
    }
}
