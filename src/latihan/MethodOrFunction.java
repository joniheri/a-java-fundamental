package latihan;


import java.util.Arrays;

public class MethodOrFunction {
  public static void main(String[] args) {
    String[] dataArray = {
            "Jon", "Heri", "Soft", "Tata",
    };
    System.out.println(Arrays.toString(dataArray));

    loopDataArray(dataArray);
  }

  static void loopDataArray(String[] data) {
    String[] dataArray = {
            "Jon", "Heri", "Soft", "Tata",
    };

    for (String s : dataArray) {
      System.out.println(s);
    }
    System.out.println();

    for (String s : data) {
      System.out.println(s);
    }
    System.out.println();
  }
}
