package de.telran.d211111.inheritance.book;

public class TechnicalBook extends Book{

    private final String scientificField;

    public TechnicalBook(int id, String title, String author, int basePrice, String scientificField) {
        super(id, title, author, basePrice);
        this.scientificField = scientificField;
    }

    public String getScientificField() {
        return scientificField;
    }

    @Override
    public int computerPrice() {
        return getBasePrice();
    }
}
