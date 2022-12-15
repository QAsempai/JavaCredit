public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double loanAmount = 1000000;
        double term = 12;
        double percent = 9.99;
        double monthlyPercent = percent / (100 * term);
        double monthlyPay = service.calculate(loanAmount, term, monthlyPercent);
        System.out.println("Ежемесячный платеж по кретиту " + (int) monthlyPay);
    }
}