package de.telran.d211122.strings.Auto;

public class Auto {

    String make; // у каласса стринг тоже есть equals, но сравнивает char
    int year;
    String color;

    public Auto(String make, int year, String color) {
        this.make = make;
        this.year = year;
        this.color = color;
    }

    public boolean equals(Object o2) {
        if (o2 instanceof Auto) // instanceof говорит - является ли объект типом Auto
            return false;

        Auto auto2 = (Auto) o2; // даункастинг
        // через ссылку можем обращаться к объектам
        if (this.make.equals(auto2.make)
                && this.year == auto2.year
                && this.color.equals(auto2.color))
            return true;

        return false;
    }

    @Override
    public String toString() {
        return "The make: " + make + ". The year: " + year + "/ The color: " + color;
    }
}
