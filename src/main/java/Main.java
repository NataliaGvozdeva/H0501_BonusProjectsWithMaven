public class Main {
    public static void main(String[] args) {

        int amount = 2_000;
        boolean registered = true;

        BonusService bonusService = new BonusService();

        long bonus = bonusService.calculate(amount,registered);

        System.out.println("Количество бонусов = " + bonus);

    }
}