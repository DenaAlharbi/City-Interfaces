import java.util.Arrays;
public class LAB12 {
        public static void main(String[] args) throws CloneNotSupportedException {
                City[] cities = new City[]{
                        new City("Daharan", 28),
                        new City("Vancouver", 15),
                        new City("Medina", 35),
                        new City("Yanbu", 32)
                };

                cities[0] = (City) cities[0].clone();
                cities[2] = (City) cities[2].clone();

                Arrays.sort(cities);
                for (City city : cities) {
                        System.out.println(city);
                }
        }
}
