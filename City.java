import java.util.HashMap;

public class City {
    HashMap<Integer, String> city = new HashMap<>();

    City() {
        city.put(100, "Moscow");
        city.put(101, "Saint-Petersburg");
        city.put(102, "Kazan");
        city.put(103, "Krasnodar");
        city.put(104, "Novosibirsk");
    }

    void findZipCode(int n) throws CityNotFOundException {
        if (city.containsKey(n))
            System.out.println(city.get(n));
        else
            throw new CityNotFOundException(n + " not found");
    }

    public static void main(String[] args) throws Exception {
        City c = new City();
        try {
            c.findZipCode(103);
            c.findZipCode(233);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("error is "+e.getMessage());
        }
    }
}
