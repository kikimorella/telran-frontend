package de.telran.d211111.inheritance.employee;

public class Manager extends Employee{

    double coef;

    public Manager(int id, String name, String companyName, int basicSalary, double coef) {
        super(id, name, companyName, basicSalary);
        this.coef = coef;
    }

    public double getCoef() {
        return coef;
    }

    @Override // динамический полиморфизм
    public int getSalary() {
        return (int) (basicSalary * coef); // т.к. basicSalary не является private мы можем к нему обращаться
    }
}
