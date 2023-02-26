public class HollydayService {

    public int calcHollyday(int income, int expenses, int threshold) {
        // income - доход от работы
        // expenses - месячные траты
        // threshold - обязательная сумма для отдыха

        int count = 0; // счётчик месяцев отдыха
        int money = 0; // начальное количество денег на счёте

        for (int mounth = 0; mounth < 12; mounth++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
