package br.implementations.templatemethod;

// A classe pode ou não sobrescrever os métodos da superclasse, sendo o método debit() o que DEVE ser sobrescrito
public class CreditPaymentProcessor extends PaymentProcessor{

    @Override
    protected void debit() {
        System.out.println("Debiting...");
    }

    @Override
    protected void notifyy() {
        System.out.println("Additional notifications...");
    }
}
