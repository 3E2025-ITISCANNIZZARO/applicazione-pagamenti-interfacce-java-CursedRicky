public class Main {
    public static void main(String[] args) {
        ShoppingCart carrelloPayPall = new ShoppingCart(new PayPalPayment());
        ShoppingCart carrellocarta = new ShoppingCart(new CreditCardPayment());

        carrellocarta.pay();
        carrelloPayPall.pay();
    }
}