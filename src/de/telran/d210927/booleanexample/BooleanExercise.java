package de.telran.d210927.booleanexample;

public class BooleanExercise {
    public static void main(String[] args) {

        //Родители Васи Сидорова купили умный сейф и запрограммировали его на выдачу денег по отпечатку пальцев
        //одного из родителей

        System.out.println(smartDepositBox(true, false)); // -> true
        System.out.println(smartDepositBox(false, true)); //-> true
        System.out.println(smartDepositBox(false, false)); // -> false
        System.out.println(" ");

        //После покупки сейфа в семье начался разлад по поводу выделению сыну денег и родители решили сейф
        //перепрограммировать, таким образом, что бы он выдавал деньги только при обоюдном согласии родителей

        System.out.println(smartDepositBoxVersionTwo(true, false)); // ->false
        System.out.println(smartDepositBoxVersionTwo(false, true)); //->false
        System.out.println(smartDepositBoxVersionTwo(false, false)); //->false
        System.out.println(smartDepositBoxVersionTwo(true, true)); // ->true
        System.out.println(" ");

        //К родителям Васи Сидорова приехала Бабушка и сказала, что родители не умеют воспитывать сына и она сама знает,
        //когда давать ребёнку деньги. Напишите программу выдачи денег Васе, если бабушка выдаёт деньги независимо от
        //решения родителей

        System.out.println(verySmartDepositBoxVersionThree(false, true, true)); // true
        System.out.println(verySmartDepositBoxVersionThree(false, true, false)); // false
        System.out.println(" ");

        //Родители Василия добились успехов в программировании и смогли передать свои знания сыну. Василий вырос и
        //запрограммировал систему аварийного уничтожения первых космических кораблей земли, улетевших в Альфа-
        //Центавру. Система уничтожения реагирует на ввод команд двух старших офицеров корабля

        System.out.println(bigBadaBoom(true, true)); //-> true
        System.out.println(bigBadaBoom(false, false)); // -> false
        System.out.println(bigBadaBoom(true, false)); //-> false
    }

    public static boolean smartDepositBox(boolean papaPermission, boolean mamaPermission) {
        //return papaPermission || mamaPermission;
        return papaPermission ^ mamaPermission;
    }
    public static boolean smartDepositBoxVersionTwo(boolean papaPermission, boolean mamaPermission) {
        return papaPermission && mamaPermission;
    }
    public static boolean verySmartDepositBoxVersionThree(boolean papaPermission,
                                                          boolean mamaPermission,
                                                          boolean omaPermission) {
//        return (mamaPermission && papaPermission) || omaPermission;
        return omaPermission || smartDepositBoxVersionTwo(mamaPermission, papaPermission);
    }
    public static boolean bigBadaBoom(boolean cap1, boolean cap2) {
        return cap1 && cap2;
    }
}