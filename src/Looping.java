public class Looping {
  public static void main(String[] args) {

    // For Loop
    for (int i = 1; i <= 10; i++) {
      System.out.println("Looping ke: " + (i));
    }
    System.out.println();

    // While Loop
    int counter = 1;
    while (counter <= 10) {
      System.out.println("Looping ke: " + counter);
      counter++;
    }
    System.out.println();

    // Do While Loop
    int counter2 = 1;
    do {
      System.out.println("Looping ke: " + counter2);
      counter2++;
    } while (counter2 <= 10);
    System.out.println();

    // While Loop with break
    int counter3 = 1;
    while (true) {
      System.out.println("Looping ke: " + counter3);
      counter3++;

      if (counter3 > 10) {
        break;
      }
    }
    System.out.println();

    String[] dataArray = {
            "Jon", "Heri", "Soft", "Tata",
    };

    // For with data Array
    for (int i = 0; i < dataArray.length; i++) {
      System.out.println(dataArray[i]);
    }
    System.out.println();

    // For with data Array & with enhanced/For Each
    for (String s : dataArray) {
      System.out.println(s);
    }
    System.out.println();

  }
}
