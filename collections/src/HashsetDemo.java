import java.util.HashSet;

public class HashsetDemo {
    public static void msin(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("paris");
        cities.add("New York");
        cities.add("Switzerland");
        cities.add("New delhi");
        cities.add("Tokyo");

        System.out.println("cities in the set:");
        for (String city : cities) {
            System.out.println(city);
        }
        String cityToCheck = "Paris";
        if (cities.contains(cityToCheck)) {
            System.out.println("\n" + cityToCheck + " exits in the set. ");

        } else {
            System.out.println("\n" + cityToCheck + "not in the set");
        }

        cities.remove("Switzerland");
        System.out.println("cities in the set after removing Switzerland\n");
        for (String city : cities) {
            System.out.println(city);
        }
    }

}
