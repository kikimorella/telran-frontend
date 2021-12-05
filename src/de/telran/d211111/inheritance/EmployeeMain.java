package de.telran.d211111.inheritance;
/*Наследование:
- Наследовать можно только один класс
- Можно переопределить метод родителя. Обратиться к методу родителя можно через ссылку/слово super.
- Модификатор final для класса запрещает его наследование. В методе запрещает его переопределение.
- Можно в родителе и наследнике иметь поля с одним названием. При этом это две различные переменные.
К переменной родителя обращаемся через super(ссылка на часть объекта, который является родительским к).
- Статические переменные и методы индивидуальны для родителя и наследника. (если нужен метод родителя пишем название
родителя и вызываем метод). статический метод зависит от типа ссылки
- Методы в java переопределяются. (какую бы ссылку на объект не использовали, метод, который мы пытаемся вызвать,
будет использоваться наиболее конкретный, относящийся к Объекту, а потом java ищет в родительском классе)
нестатический метод не зависит от типа ссылки
*/
// надо сделать импорт, т.к. Inheritance находится в другом пакете - ALT + ENTER
import de.telran.d211111.inheritance.employee.Employee;
import de.telran.d211111.inheritance.employee.HourBasedEmployee;
import de.telran.d211111.inheritance.employee.Manager;
import de.telran.d211111.inheritance.employee.OfficeEmployee;

// Наследование классов (расширение extension) - это способность одного класса наследовать функциональность другого
// класса. Наследник копирует функциональность родителей и приобретает дополнительные
public class EmployeeMain {
    public static void main(String[] args) { // метод класса
        // new OfficeEmployee - объект, на него указывает ссылка Employee
        // тип ссылки должен быть выше типа объекта (стоять раньше, быть уже)
        // когда мы обращаемся к методам объекты и делаем это через ссылку, а у ссылки есть методы типа
        Employee officeEmployeeVasia = new OfficeEmployee(1, "Vasia", "Tel-Ran", 2000, 200);
        Employee officeEmploeePetya = new OfficeEmployee(2, "Petya", "Tel-Ran", 2500, 300);
        // Employee officeEmploeePetya2 = new OfficeEmployee(2, "Petya", "Tel-Ran", 2500, 300);
        // System.out.println(officeEmploeePetya == officeEmploeePetya2);
        // false, т.к. опрератор == true если 1 и 2 ссылка показывают один и тот же объект (но будет работать, если:
        // Employee officeEmploeePetya2 == officeEmploeePetya;)

        Employee managerStepan = new Manager(3, "Stepan", "Tel-Ran", 2000, 2.5);
        Employee hourEmployeeTania = new HourBasedEmployee(4, "Tatiana", "Tel-Ran", 2500, 150);

        // System.out.println(officeEmploeePetya.getMonthlyBonus()) - ничего не произойдет

        printSalary(officeEmployeeVasia);
        printSalary(officeEmploeePetya);
        printSalary(managerStepan);
        printSalary(hourEmployeeTania);

        Employee [] employees = {officeEmployeeVasia, officeEmploeePetya, managerStepan, hourEmployeeTania};

        OfficeEmployee officeEmploee = (OfficeEmployee) officeEmploeePetya; // даункастинг ссылки. ссылка Employee
        // имеет тип, который является суперкалассом officeEmploee
        System.out.println(officeEmploee.getMonthlyBonus()); // и только теперь мы можем вызвать getMonthlyBonus

        OfficeEmployee officeEmployeeStepan = (OfficeEmployee) managerStepan;
        System.out.println(officeEmployeeStepan.getMonthlyBonus());
        // не сработает, т.к. класс officeEmployee не расширяет класс manager
        // нельзя преобразовывать ссылки без отношений родительский-дочерний класс
    }

    public static void printSalary(Employee employee){ // используем с этим же типом или шире, чем он
        // мы можем в этом методе использовать любые ссылки, которые расширяют Employee - полиморфизм
        System.out.println("The Employee " + employee.getName() + " earns " + employee.getSalary());
        // для упрощения именного этого метода, мы писали все @Override, т.к. нас не интересует как считаются у каждого
        // работника его ЗП. В момент компиляции java не знает что будет, а потом подставляет к каждому типу свое
    }
}
