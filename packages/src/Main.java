import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Main {
  public static void main(String[] args) {
    Scanner newObj = new Scanner(System.in);
    System.out.println("Enter your name");
    String name = newObj.nextLine();
    System.out.println("Your name is " + name);
    System.out.println(LocalDate.now());
    System.out.println(LocalTime.now());

    LocalDateTime dateTimeObj = LocalDateTime.now();
    DateTimeFormatter formatterObj = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
    String formattedDate = dateTimeObj.format(formatterObj);
    System.out.println("After formatting: " + formattedDate);
  }
}
