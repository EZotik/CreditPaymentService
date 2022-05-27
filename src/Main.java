public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double annuityPaymentYear = service.calculate(1000000.0, 9.99, 12.0);
        System.out.println(Math. round (annuityPaymentYear));

        double annuityPaymentTwoYears = service.calculate(1000000.0, 9.99, 24.0);
        System.out.println(Math.round (annuityPaymentTwoYears));

        double annuityPaymentThreeYears = service.calculate(1000000.0, 9.99, 36.0);
        System.out.println(Math.round (annuityPaymentThreeYears));
    }

}
