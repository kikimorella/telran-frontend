package de.telran.d211115.list.picture;

public class Picture extends Shape{

    private static final int BORDER_WIDTH = 30; // константа для канат, которая не меняется

    Shape[] figures; // массив фигур
    Line border;

    public Picture(char symbol, Shape[] figures) {
        super(symbol); // ДЗ: зачем тут символ, если в итоге в консоль отображаются созданные из символов фигуры?
        // Ответ: нужно сделать кант из линий, чтоб не путаться
        this.figures = figures;
        border = new Line(symbol, BORDER_WIDTH); // принято и удобно, если хотим поменять и найти константу не сложно,
        // т.к. они должны быть в начале кода
    }

    @Override
    public void draw() {
        border.draw(); // отрисовываем кант
        for (int i = 0; i < figures.length; i++) {
            figures[i].draw(); // отрисовываем фигуру по порядку
        }
        border.draw();
    }
}
