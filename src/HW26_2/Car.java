package HW26_2;

public class Car {
    private int id;
    private int carNumber;

    public Car(int id, int carNumber) {
        this.id = id;
        this.carNumber = carNumber;
    }

    public int getId() {
        return id;
    }

    public int getCarNumber() {
        return carNumber;
    }



    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carNumber=" + carNumber +
                '}';
    }
}


