package web.model;

public class Car {

    private String brand;
    private String color;
    private int series;

    public Car() {
    }

    public Car(String brand, String color, int series) {
        this.brand = brand;
        this.color = color;
        this.series = series;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", series=" + series +
                '}';
    }
}
