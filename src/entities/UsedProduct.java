package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
    
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date manufactureDate;

    public UsedProduct(String n, Double p, Date m) {
        this.name = n;
        this.price = p;
        this.manufactureDate = m;
    }
    
    public String priceTag() {
        return getName() + " - $" + getPrice() + " (Manufacture date: " + sdf.format(getManufactureDate()) + ")";
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }
}
