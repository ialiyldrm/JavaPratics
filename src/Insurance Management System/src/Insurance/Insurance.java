package Insurance;
import java.util.Date;

public abstract class Insurance {
    private String name;
    private double price;
    private Date startFinish;
    

    
    public Insurance(String name, double price, Date startFinish) {
        this.name = name;
        this.price = price;
        this.startFinish = startFinish;
    }


    public abstract void calculate();

    
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    public Date getStartFinish() {
        return startFinish;
    }


    public void setStartFinish(Date startFinish) {
        this.startFinish = startFinish;
    }


}
