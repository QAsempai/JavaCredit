public class CreditPaymentService {
    public double calculate(double loanAmount, double term, double monthlyPercent) {
        return monthlyPercent * Math.pow((1 + monthlyPercent), term) / (Math.pow((1 + monthlyPercent), term) - 1) * loanAmount;
    }
}