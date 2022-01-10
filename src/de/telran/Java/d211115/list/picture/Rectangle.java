package de.telran.d211115.list.picture;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(char symbol, int width, int height) {
        super(symbol);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override /*
    public void draw() {
        for (int i = 0; i < height; i++) { // нужное количество раз печатаем линию - получаем заполненный прямоугольник
             for (int j = 0; j < width; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }*/
    public void draw() {

        for (int i = 0; i < height; i++) { // нужное количество раз печатаем линию - получаем полый прямоугольник

            for (int j = 0; j < width; j++) {

                if ((i == 0 || i == height - 1) || (j == 0 || j == width - 1)) { // нас интересует 1 и поледнее значения
                    System.out.print(symbol);
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
