package HW26_2;

import java.util.HashMap;
import java.util.Map;

public class CarMain {
    public static void main(String[] args) {
      /*  Car деген класс тузунуз (Id, номер авто)
        Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат (год выпуска, модель, цена, цвет)
        HashMap тузунуз ключ - машина, маани - машинанын данныйлары
        HashMapти толтуруп кайра entrySet деген методун колдонуп баардык элементтерин консольго чыгарыныз.*/

        Map<Car, CarStore> mapCars = new HashMap<>();
        Car car1 = new Car(1, 777);
        Car car2 = new Car(2, 001);
        Car car3 = new Car(3, 999);
        CarStore carStore1 = new CarStore(2021, "Tesla Cyber Truck", 990000000, "black");
        CarStore carStore2 = new CarStore(2019, "BMW X7", 9350000, "orange");
        CarStore carStore3 = new CarStore(2020, "Cadillac Escalade Luxury", 9600000, "blue");
        mapCars.put(car1, carStore1);
        mapCars.put(car2, carStore2);
        mapCars.put(car3, carStore3);

        for (Map.Entry<Car, CarStore> entry : mapCars.entrySet()){
            System.out.println(entry.getKey());
            System.out.println( entry.getValue());
        }
    }
}
