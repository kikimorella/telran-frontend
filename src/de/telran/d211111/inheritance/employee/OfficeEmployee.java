package de.telran.d211111.inheritance.employee;

public class OfficeEmployee extends Employee { // так создают наследование "extends Employee" - дочерний класс

    int monthlyBonus; // особенность этого класса
    // ALT + INS --> Override Methods
    @Override // переопределяем метод или переехать? ntgth,
    public int getSalary() {
        return basicSalary + monthlyBonus;
    }
//  для того, чтобы создать объект в суперклассе, нужно создать конструктор таким образом, чтоб использовался
//  конструктор из родительского класса
    public OfficeEmployee(int id, String name, String companyName, int basicSalary, int monthlyBonus) {
        super(id, name, companyName, basicSalary); // super - обращаемся к родительскому классу, любой объект содержит
        // Часть родительского класса помимо нее появилось новая функциональность. Смысл в том, что super мы
        // инициализируем часть "работника", чтоб инициализировать "офисного". Определяем 4 поля
        this.monthlyBonus = monthlyBonus; // определяем 5-е поле, относящееся только к "офисным"
    }

    public int getMonthlyBonus() { // мы переопределили этот метод
        return monthlyBonus;
    }

}
