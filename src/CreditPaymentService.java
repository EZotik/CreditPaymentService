public class CreditPaymentService {
    public double calculate (double sum, double percent, double term) {
        double interestRate = percent / 12.0 / 100.0;
        double settlementRate = 1 + interestRate;
        double extent = Math.pow(settlementRate, term);
        double coefficient = interestRate * extent / (extent - 1);
        double annuityPaymentYear = sum * coefficient;
        return annuityPaymentYear;

    }

}
