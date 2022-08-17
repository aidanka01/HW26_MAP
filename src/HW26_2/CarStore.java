package HW26_2;

import java.util.Objects;

public class CarStore {
    private int yearOfIssue;
    private String model;
    private int price;
    private String color;

    public CarStore(int yearOfIssue, String model, int price, String color) {
        this.yearOfIssue = yearOfIssue;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarStore carStore = (CarStore) o;
        return yearOfIssue == carStore.yearOfIssue && price == carStore.price && Objects.equals(model, carStore.model) && Objects.equals(color, carStore.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfIssue, model, price, color);
    }

    @Override
    public String toString() {
        return "CarStore{" +
                "yearOfIssue=" + yearOfIssue +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
