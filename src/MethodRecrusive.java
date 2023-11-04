public class MethodRecrusive {
  public static void main(String[] args) {

    System.out.println(factorialLoop(5));
    System.out.println(factorialRecrusive(5));

  }

  static int factorialLoop(int value) {
    var result = 1;

    for (int i = 1; i <= value; i++) {
      result *= i;
    }

    return result;
  }

  static int factorialRecrusive(int value) {
    if (value == 1) {
      return 1;
    } else {
      return value * factorialRecrusive(value - 1);
    }


  }

}
