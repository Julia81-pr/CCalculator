public class PaymentService {
    public double calculate( double sum, double interestRate, double numberOfPayments){
        //месячная процентная ставка
        double monthlyInterestRate = interestRate/12;

        //коэффициент аннуитента
        double annuityCoefficient = monthlyInterestRate* Math.pow((1 + monthlyInterestRate),numberOfPayments)/Math.pow((1 + monthlyInterestRate),numberOfPayments)-1;

        // аннуитентный платеж
        double annuityPayment = sum* annuityCoefficient;

        return annuityPayment;

    }

}
