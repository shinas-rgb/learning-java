import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    // ARRAY LIST
    /*
     * List<String> cars = new ArrayList<>();
     * cars.add("bmw");
     * cars.add("mazda");
     * cars.add("oudi");
     * cars.add("benz");
     * cars.get(0);
     * System.out.println(cars);
     * cars.set(0, "porche");
     * System.out.println(cars);
     * System.out.println(cars.size());
     * for (String car : cars) {
     * System.out.println(car);
     * }
     * Collections.sort(cars);
     * System.out.println(cars);
     * cars.remove(0);
     * cars.clear();
     */

    // LINKED LIST
    /*
     * LinkedList<Integer> numbers = new LinkedList<Integer>();
     * numbers.add(4);
     * numbers.add(3);
     * numbers.add(9);
     * numbers.add(5);
     * System.out.println(numbers);
     * numbers.addFirst(1);
     * numbers.addLast(8);
     * System.out.println(numbers);
     * numbers.removeLast();
     * numbers.getFirst();
     */

    // HASH SET
    /*
     * HashSet<String> cars = new HashSet<String>();
     * cars.add("bmw");
     * cars.add("mazda");
     * cars.add("oudi");
     * cars.add("oudi");
     * cars.add("benz");
     * System.out.println("cars: " + cars);
     * for (String car : cars) {
     * System.out.println(car);
     * }
     * cars.contains("mazda");
     * cars.clear();
     */

    // TREE SET
    /*
     * Set<Integer> numbers = new TreeSet<>();
     * numbers.add(34);
     * numbers.add(31);
     * numbers.add(97);
     * numbers.add(45);
     * numbers.add(45);
     * numbers.add(12);
     * System.out.println("Numbers: " + numbers);
     * numbers.contains(43);
     * numbers.remove(23);
     * numbers.clear();
     * numbers.size();
     */

    // LINKED HASHSET
    /*
     * Set<String> cars = new LinkedHashSet<>();
     * cars.add("bmw");
     * cars.add("mazda");
     * cars.add("oudi");
     * cars.add("oudi");
     * cars.add("benz");
     * System.out.println("cars: " + cars);
     * cars.contains("Mazda");
     * cars.remove("Volvo");
     * cars.clear();
     * cars.size();
     */

    // HASH MAP
    /*
     * Map<String, String> capitalCities = new HashMap<>();
     * capitalCities.put("England", "London");
     * capitalCities.put("India", "New Dehli");
     * capitalCities.put("Austria", "Wien");
     * capitalCities.put("Norway", "Oslo");
     * capitalCities.put("Norway", "Oslo"); // Duplicate
     * capitalCities.put("USA", "Washington DC");
     * System.out.println(capitalCities);
     * capitalCities.get("England");
     * capitalCities.remove("England");
     * capitalCities.clear();
     * capitalCities.size();
     */

    // TREE MAP
    /*
     * Map<String, String> capitalCities = new TreeMap<>();
     * capitalCities.put("England", "London");
     * capitalCities.put("India", "New Dehli");
     * capitalCities.put("Austria", "Wien");
     * capitalCities.put("Norway", "Oslo");
     * capitalCities.put("Norway", "Oslo"); // Duplicate
     * capitalCities.put("USA", "Washington DC");
     * System.out.println(capitalCities);
     */

    // LINKED HASH MAP
    /*
     * Map<String, String> capitalCities = new LinkedHashMap<>();
     * capitalCities.put("England", "London");
     * capitalCities.put("India", "New Dehli");
     * capitalCities.put("Austria", "Wien");
     * capitalCities.put("Norway", "Oslo");
     * capitalCities.put("Norway", "Oslo"); // Duplicate
     * capitalCities.put("USA", "Washington DC");
     * System.out.println(capitalCities);
     */

    // ITERATOR
    /*
     * List<Integer> numbers = new ArrayList<>();
     * numbers.add(14);
     * numbers.add(3);
     * numbers.add(19);
     * numbers.add(5);
     * Iterator<Integer> it = numbers.iterator();
     * while (it.hasNext()) {
     * Integer i = it.next();
     * System.out.println(i);
     * if (i > 10) {
     * it.remove();
     * }
     * }
     * System.out.println(numbers);
     */
  }
}
