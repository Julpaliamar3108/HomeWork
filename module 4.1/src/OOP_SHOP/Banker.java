package OOP_SHOP;

public class Banker {
    private String bankName;
    private String paymentTerm;

    public String getBankName() {
        return bankName;
    }

    public String getPaymentTerm() {
        return paymentTerm;
    }

    public Banker(String bankName, String paymentTerm){
        this.bankName = bankName;
        this.paymentTerm = paymentTerm;
    }

    @Override
    public String toString() {
        return "Банк " + bankName + '\'' +
                ", рассрочка " + paymentTerm + '\'';
    }

    public void BankChoice(){
        System.out.println("Какой банк предпочитаете?");
    }
}
