public class CreditPaymentService {
    public int calculate(int amountOfCreditRuble, double creditTermMonths, double interestRatePercentage) {

        int annuityPayment;
        double interestRatePerMonth;
        double annuityRatio;


        interestRatePerMonth = (interestRatePercentage / 12) / 100;
        annuityRatio = interestRatePerMonth * (Math.pow((1 + interestRatePerMonth), creditTermMonths) / (Math.pow((1 + interestRatePerMonth), creditTermMonths) - 1));
        annuityPayment = (int) (amountOfCreditRuble * annuityRatio);


        return annuityPayment;

    }
}
