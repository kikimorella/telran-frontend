package de.telran.d210927.booleanexample;

public class DoorbellAndRectangle {
    //Найти площадь и периметр прямоугольника со сторонами 10 и 15 (где Х - ширина, а У - длинна)

    /*На даче у родителей Васи Сидорова решили поставить звонок, который должен звонить при нажатии на кнопку
    звонка у калитки (значение А) или у двери дома (значение В). Если соседские дети начинают играться и нажимать
    на кнопки звонка одновременно и на калитке и на доме, то звонок не должен реагировать.
    Напишите программу управления звонком.*/

    public static void main(String[] args) {

        System.out.println(findRectangleArea(10, 15));
        System.out.println(findRectanglePerimeter(10, 15));

        System.out.println(" ");

        System.out.println(doorbell(true, false));  //-> true - дети звонят у калитки
        System.out.println(doorbell(false, true));  //-> true - дети звонят у двери
        System.out.println(doorbell(true, true));   //-> false - дети звонят одновременно
        System.out.println(doorbell(false, false)); //-> false - дети не звонят
    }

    public static int findRectangleArea(int x, int y) {
        return x * y;
    }

    public static int findRectanglePerimeter(int x, int y) {
        return 2 * (x + y);
    }

    public static boolean doorbell(boolean a, boolean b) {
        return a ^ b;
    }
}
