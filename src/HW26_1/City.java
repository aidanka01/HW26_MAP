package HW26_1;

public class City implements Comparable<City> {
    private int code;
    private String name;
    private double population;

    public City(int code, String name, double population) {
        this.code = code;
        this.name = name;
        this.population = population;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }


    public double getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "City{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

    @Override
    public int compareTo(City o) {
        return this.code - o.code;
    }

}
