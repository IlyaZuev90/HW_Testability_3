public class CreditPaymentService {
    public int calculate(int amountOfCredit_ruble, double creditTerm_months, double interestRate_percentage) {

        int annuityPayment;
        double interestRate_perMonth;
        double annuityRatio;


        interestRate_perMonth = (interestRate_percentage / 12) / 100;
        annuityRatio = interestRate_perMonth * (Math.pow((1 + interestRate_perMonth), creditTerm_months) / (Math.pow((1 + interestRate_perMonth), creditTerm_months) - 1));
        annuityPayment = (int) (amountOfCredit_ruble * annuityRatio);


        return annuityPayment;

    }
}
