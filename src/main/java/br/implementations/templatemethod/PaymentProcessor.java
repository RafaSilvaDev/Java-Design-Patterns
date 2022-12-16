package br.implementations.templatemethod;

public abstract class PaymentProcessor {

    // Este é o template method
    public void paymentProcess(){
        prepare();
        validate();
        debit();
        notifyy();
        finish();
    }

    protected abstract void debit();

    private void prepare(){
        System.out.println("Reservando produtos");
    }

    private void validate(){
        System.out.println("Checking register");
    }

    protected void notifyy(){
        System.out.println("Notifying user");
    }

    protected void finish(){
        System.out.println("Checkout");
    }
}
