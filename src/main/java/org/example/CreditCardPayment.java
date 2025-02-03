public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Compra con carta di credito");
    }
}
