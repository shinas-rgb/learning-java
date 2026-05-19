// abstract modifier
abstract class Test {
  public String fname = "Java Developer";
  public int age = 22;

  public abstract void study();
}

class Student extends Test {
  public float gpa = 4.5f;

  public void study() {
    System.out.println("Studying...");
  }
}

// publilc static modifier
class Person {
  public String name = "Java";
  private String department = "IT";
}

public class Main {
  int x;

  public Main(int x) {
    this.x = x;
  }

  public void Add(int num) {
    System.out.println(this.x + " + " + num + " = " + (this.x + num));
  }

  public static void main(String[] args) {
    Main myObject1 = new Main(3);
    Main myObject2 = new Main(4);

    System.out.println(myObject1.x);
    System.out.println(myObject2.x);

    myObject2.Add(myObject1.x);

    // public modifier test
    Person person1 = new Person();
    System.out.println(person1.name);

    Student student1 = new Student();
    student1.study();
    System.out.println(student1.fname);
    System.out.println(student1.age);
  }
}
