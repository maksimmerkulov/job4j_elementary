package ru.job4j.loop;

public class Savings {

    /**
     * Метод для расчета количества лет, которые потребуются для накопления заданной суммы,
     * при условии ежегодного депозита и начисления процентов.
     *
     * @param goal Целевая сумма.
     * @param annualDeposit Ежегодное пополнение.
     * @param percent Процентная ставка по вкладу.
     * @return Количество лет, необходимых для накопления целевой суммы.
     */
    public static int years(double goal, double annualDeposit, double percent) {
        int years = 0;
        double total = 0;
        do {
            total += total * (percent / 100);
            total += annualDeposit;
            years++;
        } while (total < goal);
        return years;
    }
}