public class Main {
    static double telescopePrice = 14_000;
    static double account = 1000;
    static double stipend = 2500;
    static double percentBankMonth = 5.0 / 12.0;

    static int countMonth = 0; // количество месяцев

    public static void main(String[] args) {

        while(account < telescopePrice) {

            countMonth++; // countMonth = countMonth + 1;

            account += account * percentBankMonth / 100; // увиличиваем сумму на проценты от вклада
            account += stipend;
        }

        System.out.println("количество месяцев потребовалось  " + countMonth);
        System.out.println("количество средств на момент покупки телескопа" + account);

    }

}












    