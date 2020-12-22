import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        Scanner input = new Scanner(System.in);
        System.out.println("Сумма : ");
        double sum = input.nextDouble();

        System.out.println("Процентная ставка: ");
        double interestRate = input.nextDouble();

        System.out.println("Количество платежей: ");
        double numberOfPayments= input.nextDouble();

        double monthlyPayment = service.calculate(sum, interestRate, numberOfPayments);

        System.out.println("Ежемесячный платеж: "+ monthlyPayment);





    }
}
