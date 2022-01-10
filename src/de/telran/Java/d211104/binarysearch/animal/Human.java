package de.telran.d211104.binarysearch.animal; // пакет

// конструктор это метод, который помогает инициальзировать объкт. Бывают различные по доступу
// конструктор вписывает характеристики (конкретные значения)
/* Статические методы и поля класса это такие методы и поля, которые описывают класс (принадлежат классу целиком,
   а не какому-то конкретному представителю/объекту данного класса)*/

public class Human { // обычно классы публичные. описывает сущность и всё, что в нее всходит
    // у каждого человека есть характеристика: возраст, имя, фамилия

    private static long humanNumber = 0; // статическая характеристика класса людей, не зависит от представителей класса
    // поле, которое принадлежит классу, а не объекту, может меняться
    private static double averageAge; // только поля класса можно неинициализировать, у них простейшее значение = 0
    // (сумма возрастов)/n = averageAge --> сумма возрастов = averageAge * n
    // новая сумма возрастов = сумма возрастов + возраст новенького = averageAge * n + возраст новенького
    // новый averageAge = новая сумма возрастов / n + 1 == averageAge * n + возраст новенького / n + 1
    public static int getAverageAge(){
        return (int) averageAge; // обратим внимание, что тут меняется на double averageAge
    }

    public Human(String specifiedName, String specifiedSurname, int specifiedAge) { // конструктор для создания людей :)
        name = specifiedName;
        surname = specifiedSurname;
        age = specifiedAge;
        averageAge = (averageAge * humanNumber + specifiedAge) / (++humanNumber); // мы делим на humanNumber + 1
        // (humanNumber++) - постфиксный инкремент, когда используется после какого-либо выражения, а не является
        // самостоятельным выражением, сначала все выполняется (берется старое значение переменной), а потом + 1
        // (++humanNumber) - префиксное значение, сначала +1 (вычисление нового значения), а потом выполняется действие
        humanNumber++; // родился человек - инкрементируем (изменять её нельзя просто так) только если используют
        // конструктор-человек и является приват
    }

    public static long getHumanNumber() { // статический метод, который возвращает значение переменной
        return humanNumber;
    }

    // если не хотим, чтоб меняли, то обрезаем доступ словом private и теперь они видны только в своем классе,
    // т.е. в main их не видно (в нашем случае в классе BinarySearch)
    private int age; // переменная класса называется поле (field)
    private String name; // для каждого объекта они свои, все разные
    private String surname;
    private boolean isAlive = true; // инициализация до конструктора возможна, если поля не заполнены, то они null
    // всегда, когда создаем нового человека

    // из любой точки кода можно получить знания об объекте через метод getter
    // Ctrl + Enter и выбрать характеристики. Пишут методы со словом get. создаётся только в конеретном классе
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    // если массовое располовиниваение? возможно! но это сильно Advanced! проблемы, когда 2 потока выполняют 1 задачу
    public void die() { // этот метод не статический, т.к. он относится только к конкретному объекту
        if (isAlive) {
            humanNumber--; // воскресить нельзя, т.к. переменная приватная
            isAlive = false;
            averageAge = (averageAge * humanNumber - age) / (--humanNumber); // --humanNumber это декремент
        }
    }

    public void introduce() {// метод (способность), который умеет предвтавлять текущий объект
        if (isAlive)
            System.out.println("My name is " + name + " " + surname + ". I am " + age + " years old.");
        else
            System.out.println("R.I.P.");
    }
}
