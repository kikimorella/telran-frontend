package de.telran.d211104.binarysearch.homework;

public class LoanMain {

    public static void main(String[] args) {

        LoanUser vasya = new LoanUser("Vasya", "Vasin", 20, 30000);
        LoanUser petya = new LoanUser("Petya", "Petin", 21, 15000);
        LoanUser masha = new LoanUser("Maria Petrovna", "Ivanova", 55, 40000);
        LoanUser semen = new LoanUser("Semen Semenych", "Semenov", 75, 40000);

        LoanUser[] user = {vasya, petya, masha, semen}; // для наглядности можно создать массив

        LoanIssuer johan = new LoanIssuer("Johan", "Kruff", true, true);
        LoanIssuer lazyKindClerk = johan; // ссылка на один и тот же объект
        LoanIssuer stepan = new LoanIssuer("Stepan", "Strong", false, true);
        LoanIssuer kostik = new LoanIssuer("Konstantin", "Konstantinov", false, false);

        LoanIssuer[] clerks = {johan, stepan, kostik}; // чтоб прогнать всех клерков и пользователей

        System.out.println(johan.toProvide(vasya));
        System.out.println(johan.toProvide(petya));

        for (int i = 0; i < clerks.length; i++) {
            for (int j = 0; j < user.length; j++) {
                boolean isProvided = clerks[i].toProvide(user[j]);
                if (isProvided)
                System.out.println("The clerk " + clerks[i].name + " " + clerks[i].surname +
                        " provides a loan to the user " + user[j].name + " " + user[j].surname);
                else
                    System.out.println("The clerk " + clerks[i].name + " " + clerks[i].surname +
                        " does not provides a loan to the user " + user[j].name + " " + user[j].surname);
            }
        }
    }
}
