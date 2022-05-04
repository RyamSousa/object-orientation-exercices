package main.question26;

public class Fatura {

    private int identificationNumber;

    private String description;

    private int amountBuy;

    private double unitPrice;

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(int identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmountBuy(int amountBuy) {
        if (amountBuy > 0){
            this.amountBuy = amountBuy;
        }
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice > 0){
            this.unitPrice = unitPrice;
        }
    }

    public double calculaTotal(){
        return amountBuy * unitPrice;
    }
}
