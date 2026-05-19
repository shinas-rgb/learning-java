public class Main {

  static int addNumber(int number1, int number2) {
    return (number1 + number2);
  }

  public static void main(String[] args) {
    // Printing strings
    System.out.println("Hi");
    System.out.println("Hello java");

    // Declaration
    int year = 2026;
    double gpa = 4.5;

    System.out.println("The year is " + year);
    System.out.println("Your GPA is " + gpa);

    // Constants
    final int MINUTES_PER_HOUR = 60;
    System.out.println(MINUTES_PER_HOUR);

    // Integer data types
    //
    // byte myNum = 100;
    // short myNum = 5000;
    // int myNum = 120000;
    // long myNum = 142100000L;

    // Floating data types
    //
    // float myNum = 3.124f;
    // double myNum = 4.23235d;

    // Type casting
    //
    // int myInt = 5;
    // double myDouble = (int) myInt;

    float myNum = 6 & 3;
    System.out.println(myNum);

    int random = (int) (Math.random() * 101);
    System.out.println(random);

    // for-each loop
    String[] cars = { "Bmw", "Oudi", "Benz", "Swift" };
    for (String car : cars) {
      System.out.println(car);
    }

    System.out.println(addNumber(3, 2));
  }
}
