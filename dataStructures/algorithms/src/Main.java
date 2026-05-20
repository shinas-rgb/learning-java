import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    // SEARCHING
    List<String> cars = new ArrayList<>();
    cars.add("bmw");
    cars.add("benz");
    cars.add("audi");
    cars.add("mazda");
    cars.add("porche");
    cars.add("lambo");
    System.out.println("Added items " + cars);

    Collections.sort(cars);
    System.out.println("Sorted items " + cars);

    int index = Collections.binarySearch(cars, "mazda");
    System.out.println("mazda is at index " + index);

    // SORTING
    List<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(1);
    numbers.add(23);
    numbers.add(14);
    numbers.add(7);
    numbers.add(7);
    System.out.println("Added items " + numbers);

    Collections.sort(numbers);
    System.out.println("Sorted items " + numbers);

    Collections.sort(numbers, Collections.reverseOrder());
    System.out.println("Sorted items in reverse " + numbers);

    System.out.println("Largest element " + Collections.max(numbers));
    System.out.println("Smallest element " + Collections.min(numbers));

    Collections.shuffle(numbers);
    System.out.println("Shuffled items " + numbers);

    System.out.println("Number of 7: " + Collections.frequency(numbers, 7));

    Collections.swap(numbers, 2, 3);
    System.out.println("Swaped items " + numbers);
  }
}
