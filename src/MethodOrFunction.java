public class MethodOrFunction {
  public static void main(String[] args) {

    forLoop();
    whileLoop();
    doWhileLoop();
    forEachLoop();
  }

  static void forLoop() {
    System.out.println("For Loop");
    for (int i = 1; i <= 10; i++) {
      System.out.println("Looping ke: " + (i));
    }
    System.out.println();
  }

  static void whileLoop() {
    System.out.println("While Loop");

    int counter = 1;
    while (counter <= 10) {
      System.out.println("Looping ke: " + counter);
      counter++;
    }
    System.out.println();
  }

  static void doWhileLoop() {
    System.out.println("Do While Loop");

    int counter2 = 1;
    do {
      System.out.println("Looping ke: " + counter2);
      counter2++;
    } while (counter2 <= 10);
    System.out.println();
  }

  static void forEachLoop() {
    String[] dataArray = {
            "Jon", "Heri", "Soft", "Tata",
    };

    for (String s : dataArray) {
      System.out.println(s);
    }
    System.out.println();
  }
}
