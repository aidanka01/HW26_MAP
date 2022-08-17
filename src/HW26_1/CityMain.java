package HW26_1;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CityMain {
    /* City деген класс тузунуз. (code, name, ...)
     Эгерде code так сан болсо TreeSetke салыныз.
     Аларды чонунан кичинесине караган тартипте чыгарыныз.*/
    public static void main(String[] args) {
        Set<City> cities = new TreeSet<>(Comparator.reverseOrder());
        City city1 = new City(10, "New York", 8.80000);
        City city2 = new City(21, "Chicago", 2.70000);
        City city3 = new City(15, "Los Angeles", 3.90000);
        City city4 = new City(34, "Boston", 0.680000);
        City city5 = new City(87, "Miami", 0.440000);
        addCityEvenCode(cities, city1);
        addCityEvenCode(cities, city2);
        addCityEvenCode(cities, city3);
        addCityEvenCode(cities, city4);
        addCityEvenCode(cities, city5);
        System.out.println(cities);
    }

    public static void addCityEvenCode(Set<City> cities, City city){
        if (city.getCode() % 2 ==1){
            cities.add(city);
        }
    }

}

