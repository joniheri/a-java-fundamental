public class TypeDataArray {
  public static void main(String[] args) {
    String[] arrayString;
    arrayString = new String[3];
    arrayString[0] = "Jon";
    arrayString[1] = "Heri";
    arrayString[2] = "Soft";
    System.out.println("Array String: " + arrayString[0]);

    String[] arrayString2 = new String[3];
    arrayString2[0] = "Jon";
    arrayString2[1] = "Heri";
    arrayString2[2] = "Soft";
    System.out.println("Array String2: " + arrayString2[1]);

    String[] arrayStrings3 = new String[]{
            "Jon",
            "Heri",
            "Soft"
    };
    System.out.println("Array String3: " + arrayStrings3[2]);

    String[] arrayStrings4 = {
            "Jon",
            "Heri",
            "Soft"
    };
    System.out.println("Array String4: " + arrayStrings4[1] + ", dari jumlah Data: " + arrayStrings4.length);
  }
}
