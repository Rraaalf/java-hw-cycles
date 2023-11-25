package ru.netology.services;

public class Holimonths {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        String rest = "Буду отдыхать";
        String work = "Придётся работать";
        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                int spendingOnVacation = money - expenses - (money - expenses) / 3; // траты на отдых
                System.out.printf("Месяц %d. Денег %d. %s. Потратил -%d, затем еще -%d%n",
                        month, money, rest, expenses, spendingOnVacation);
                money = money - spendingOnVacation - expenses; // остаток после месяца отдыха
            } else {
                System.out.printf("Месяц %d. Денег %d. %s. Заработал +%d, потратил -%d%n",
                        month, money, work, income, expenses);
                money = money + income - expenses; // остаток после месяца работы
            }
        }
        return count;
    }
}
