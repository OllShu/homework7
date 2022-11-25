public class Main {
    public static void main(String[] args) {
        int supplement = 15000;
        int capital = 0;
        int i = 0;
        while (capital<=2_459_000) {
            i++;
            capital = capital + supplement + capital/100;
            System.out.println("Месяц "+i+" сумма накоплений равна "+capital+" рублей");
        }
        System.out.println("2 459 000 рублей накопит за "+i+" месяцев");
        System.out.println("____________________________");
    }
}