package de.telran.d211111.inheritance.employee;

public abstract class Employee extends Object{ // "extends Object" - можно не писать. Каждый класс в java является
    // расширением Обеъкта.
    // public class Employee - то, что у всех работников есть - родительский класс
    private final int id; // эти поля package private
    private final String name;
    private final String companyName;
    protected int basicSalary; // int стал protected, теперь basicSalary доступна только Employee и тем классам,
    // которые в том же package, т.е. доступен для любого потомка
    // (Alt + insert) или правая кнопка мыши Generate -> Constructor или создать гетеры
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public abstract int getSalary(); // метод - возвращает ЗП, он абстрактный потому что меняется у дочерних классов

    // нужен конструктор со всеми полями
    public Employee(int id, String name, String companyName, int basicSalary) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.basicSalary = basicSalary;
    }

//    public int getSalary(boolean flag) { // статический полиморфизм.
//    название метода то же, но сигнатура другая и java выбирает тот, который подходит по сигнатуре
//    }

}
