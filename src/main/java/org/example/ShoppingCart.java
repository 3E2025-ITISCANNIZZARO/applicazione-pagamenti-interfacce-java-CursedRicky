public class ShoppingCart {
    PaymentStrategy metodoDiPagamento;
    ShoppingCart(PaymentStrategy pagamento) {
        metodoDiPagamento = pagamento;
    }

    // Usa il metodo pay dall'interfaccia che si passa come parametro quando si costruisce l'oggetto
    void pay() {
        metodoDiPagamento.pay();
    }
}
