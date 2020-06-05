package hw15;

public class Office extends Chairs {
    private int numberOfChairs;
    private String usageTimes;


    public Office(String brand, String model, int price, int numberOfChairs, String usageTimes) {
        super(brand, model, price);
        this.numberOfChairs = numberOfChairs;
        this.usageTimes = usageTimes;
    }

    @Override
    public String toString() {
        return "Office{" +
                "numberOfChairs=" + numberOfChairs +
                ", usageTimes='" + usageTimes + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}