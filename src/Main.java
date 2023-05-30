public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("Сумма кредита: " + " " + "1 000 000" + " " + "рублей");
        System.out.println("Срок кредита: " + " " + "1 год");
        System.out.println("Ежемесячный платёж" + " " + "Процентная ставка");
        System.out.println(service.calculate(1000000, 12, 9.99) + " " + "рублей" + "         " + "9,99 %");
        System.out.println();

        System.out.println("Сумма кредита: " + " " + "1 000 000" + " " + "рублей");
        System.out.println("Срок кредита: " + " " + "2 года");
        System.out.println("Ежемесячный платёж" + " " + "Процентная ставка");
        System.out.println(service.calculate(1000000, 24, 9.99) + " " + "рублей" + "         " + "9,99 %");
        System.out.println();

        System.out.println("Сумма кредита: " + " " + "1 000 000" + " " + "рублей");
        System.out.println("Срок кредита: " + " " + "3 года");
        System.out.println("Ежемесячный платёж" + " " + "Процентная ставка");
        System.out.println(service.calculate(1000000, 36, 9.99) + " " + "рублей" + "         " + "9,99 %");
        System.out.println();
    }

}
