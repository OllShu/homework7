public class Main {
    public static void main(String[] args) {
        int supplement = 15000;
        int capital = 0;
        int i = 0;
        while (capital <= 2_459_000) {
            i++;
            capital = capital + supplement + capital / 100;
            System.out.println("Месяц " + i + " сумма накоплений равна " + capital + " рублей");
        }
        System.out.println("2 459 000 рублей накопит за " + i + " месяцев");
        System.out.println("____________________________");

        // задание 2

        int number = 1;
        i = 0;
        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println(" ");

        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("____________________________");

        // задание 3

        int people = 12_000_000;
        int year = 1;
        int birthRate = 17;
        int mortality = 8;
        while (year <= 10) {
            System.out.println("год " + year + " численность населения составляет " + people + " человек");
            year++;
            people = people + people / 1000 * (birthRate - mortality);
        }
        System.out.println("____________________________");

        // задание 2 второй домашки урока
        System.out.println("задание 2 второй домашки урока");
        System.out.println(".");

        capital = 15000;
        i = 0;
        while (capital <= 12_000_000) {
            i++;
            capital = capital + capital / 100 * 7;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + capital + " рублей");
            }
        }
        System.out.println("12 миллионов рублей накопит за " + i + " месяцев");

        System.out.println("____________________________");

        // задание 3 второй домашки урока
        System.out.println("задание 3 второй домашки урока");
        System.out.println(".");

        capital = 15000;
        i = 0;
        while (i <= 9 * 12) {
            i++;
            capital = capital + capital / 100 * 7;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + capital + " рублей");
            }
        }
        System.out.println("за "+i/12+" лет Василий накопит " + capital + " рублей");


        System.out.println("____________________________");

        // задание 4 второй домашки урока

        //  System.out.println("задание 4 второй домашки урока");
        //System.out.println(".");

        //System.out.println("____________________________");
    }
}