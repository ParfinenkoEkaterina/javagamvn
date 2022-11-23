public class main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000;
        boolean registered = true;

        service.calculate(amount, registered);

    }
}
