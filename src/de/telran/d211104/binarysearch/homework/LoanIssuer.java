package de.telran.d211104.binarysearch.homework;

public class LoanIssuer { // человек, который одобряет кредиты
    String name;
    String surname;
    // age; annualSalary; - не сильно интересует
    boolean isLazy;
    boolean isKind;

    public LoanIssuer(String name, String surname, boolean isLazy, boolean isKind) {
        this.name = name;
        this.surname = surname;
        this.isLazy = isLazy;
        this.isKind = isKind;
    }

    public boolean toProvide(LoanUser user) { // решение + или - значит boolean, метод принимает ссылку на пользователя
        //Если работник ленивый, он одобрит кредит в случае, если у клиента зп больше 20000 в год.
        //Если работник неленивый и добрый, он оформит кредит, если зп больше 20000 и клиенту не больше 70
        //Если работник неленивый и злой, он оформит кредит, если зп больше 20000 и клиенту не больше 50.
        // чтоб обратиться к ссылкам характеристик нужно вбить "user."
        if (user.annualSalary < 20000) // сразу отсечь
            return false;

        if (this.isKind && this.isLazy)  // пытаемся узнать добрый ли клерк
            return true;

        if (!this.isLazy && user.age <= 50)
            return true;

        if (!this.isLazy && this.isKind && user.age <= 70)
            return true;
        else
            return false;
    }
}
