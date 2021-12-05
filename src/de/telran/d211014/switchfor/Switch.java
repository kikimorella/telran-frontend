package de.telran.d211014.switchfor;

public class Switch {
    public static void main(String[] args) {
        printDayOfWeek(3); // the day of week is Wednesday
        printDayOfWeek(10);
        printDay(3);
        printDay(10);
    }

    // распечатать в консоль день недели
    static void printDayOfWeek (int dayOfWeek) {
        switch (dayOfWeek) {
            case 1:
                System.out.println("The Day of week is Monday");
                break;// описание кэйса закончено
            case 2:
                System.out.println("The Day of week is Tuesday");
                break;
            case 3:
                System.out.println("The Day of week is Wednesday");
                break;
            case 4:
                System.out.println("The Day of week is Thursday");
                break;
            case 5:
                System.out.println("The Day of week is Friday");
                break;
            case 6:
                System.out.println("The Day of week is Saturday");
                break;
            case 7:
                System.out.println("The Day of week is Sunday");
                break;
            default: // чтоб отсесь иные варианты
                System.out.println("No such a day of week");
                break;
        }
    }

    static void printDay(int day) {
        switch (day) {
            case 1:
          //      System.out.println("The Day of week is Monday"); // описание кэйса закончено
          //      break;
            case 2:
          //      System.out.println("The Day of week is Tuesday");
          //      break;
            case 3:
          //      System.out.println("The Day of week is Wednesday");
          //      break;
            case 4:
          //      System.out.println("The Day of week is Thursday");
          //      break;
            case 5:
          //      System.out.println("The Day of week is Friday");
                // если не будет break; то операция не заканчивается
                System.out.println("Today is a workday");
                break;
            case 6:
                System.out.println("The Day of week is Saturday");
                break;
            case 7:
                System.out.println("The Day of week is Sunday");
                break;
            default:
                System.out.println("No such a day of week");
                break;
        }
    }
}
