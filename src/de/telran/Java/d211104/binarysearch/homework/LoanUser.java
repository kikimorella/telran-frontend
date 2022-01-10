package de.telran.d211104.binarysearch.homework;

public class LoanUser { // пользователь кредита
    String name;
    String surname;
    int age;
    int annualSalary; // важно для одобрения кредита

    public LoanUser(String name, String surname, int age, int annualSalary) { // Alt + Enter выбрать поля
        this.name = name; // this - ссылка на создаваемый/текущий объект
        this.surname = surname; // приоритет имеет аргумент в конструкторе, а не аргумент в поле!
        this.age = age; // аргументы в конструкторе одноименные с полями класса
        this.annualSalary = annualSalary;
    }
}
