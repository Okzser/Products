package entities;

public class ImportedProduct extends Product{
    
    private Double customsFee;

    public ImportedProduct(String n, Double p, Double c) {
        this.name = n;
        this.price = p;
        this.customsFee = c;
    }

    @Override
    public String priceTag() {
        return getName() + " - $" + getPrice() + " (Customs fee: $" + getCustomsFee() + ")"; 
    }

    public Double getCustomsFee() {
        return customsFee;
    }


}
