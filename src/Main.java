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

        System.out.println("задание 4 второй домашки урока");
        System.out.println(".");

        int firstFriday = 7;
        i=1;
        while (i<=31) {
            if (i==firstFriday || (i-firstFriday)%7==0) {
                System.out.println("Сегодня пятница, " +i+ " число. Необходимо подготовить отчет.");
            }  i++;
        }

        System.out.println("____________________________");

        // задание 1 третьей домашки урока

        System.out.println("задание 1 третьей домашки урока");
        System.out.println(".");

        int years=2022;
        int pastYears = years-200;
        int futureYears = years+100;
        i=pastYears;
        while (i>=pastYears && i<= futureYears) {
            if (i%79==0) {
                System.out.println(i);
            } i++;
        }

        System.out.println("____________________________");

        // задание 2 третьей домашки урока

        System.out.println("задание 2 третьей домашки урока");
        System.out.println(".");

        int multiplicationByTwo;
        for (i=1; i<=10; i++) {
            multiplicationByTwo = i*2;
            System.out.println("2*"+i+"="+multiplicationByTwo);
        }

        System.out.println("____________________________");

    }
}