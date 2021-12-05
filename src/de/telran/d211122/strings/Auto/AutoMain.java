package de.telran.d211122.strings.Auto;
// для того, чтоб сравнивать объекты нужен метод equals
public class AutoMain {

    public static void main(String[] args) {
        Auto[] autos = createAutopark(); // ссылка autos указывает на объект - массив ссылок на авто

        Auto silverBentley = new Auto("Bentley", 2018, "Silver"); // живёт в main

        System.out.println(silverBentley);

        String something = "Something" + silverBentley;// конкотинация строк
        // silverBentley превратился в строку
        System.out.println(something);

        System.out.println(autoparkContains(autos, silverBentley)); //false, т.к. 2 разных Бентли!
    }

    static boolean autoparkContains(Auto[] autopark, Auto auto) { // autopark указывает на 6 строку, а auto на строку 8
        for (int i = 0; i < autopark.length; i++) {
            // if (autopark[i] == auto) - так не работает, т.к. 2 разных Бентли!
            if (autopark[i].equals(auto)) // когда мы сравниваем 2 строки используем equals, сравниваем буквы
                return true;
        }
        return false;
    }
    static Auto[] createAutopark() {
        Auto grayOpel = new Auto("Opel", 2012, "Grey");
        Auto redMazda = new Auto("Mazda", 2015, "Red");
        Auto silverBentley = new Auto("Bentley", 2018, "Silver");
        return new Auto[]{grayOpel, redMazda, silverBentley};
    }
}
