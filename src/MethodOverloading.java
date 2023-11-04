public class MethodOverloading {
  public static void main(String[] args) {

    helloWorld();
    helloWorld("Hello World");
    helloWorld("Jon", "Heri", 30);
  }

  static void helloWorld() {
    System.out.println("Hello Wold");
    System.out.println();
  }

  static void helloWorld(String data) {
    System.out.println(data);
    System.out.println();
  }

  static void helloWorld(String firstName, String lastName, int age) {
    System.out.println("Hello, My name is: " + firstName + " " + lastName + ", Age: " + age);
  }
}
