public class SwitchCaseAndIfTernary {
  public static void main(String[] args) {
    var nilai = "A";

    // Switch Versi Biasa
    switch (nilai) {
      case "A":
        System.out.println("Sangat Bagus, Karena nilai anda: " + nilai);
        break;
      case "B":
        System.out.println("Bagus, Karena nilai anda: " + nilai);
        break;
      case "C":
        System.out.println("Cukup, Karena nilai anda: " + nilai);
        break;
      case "D", "E":
        System.out.println("Gagal, Karena nilai anda: " + nilai);
        break;
      default:
        System.out.println("Tidak Ditemukan, Karena nilai anda: " + nilai);
    }

    // Switch Case Lambda
    switch (nilai) {
      case "A" -> {
        System.out.println("Sangat Bagus, Karena nilai anda: " + nilai);
      }
      case "B" -> {
        System.out.println("Bagus, Karena nilai anda: " + nilai);
      }
      case "C" -> {
        System.out.println("Cukup, Karena nilai anda: " + nilai);
      }
      case "D", "E" -> {
        System.out.println("Gagal, Karena nilai anda: " + nilai);
      }
      default -> {
        System.out.println("Tidak Ditemukan, Karena nilai anda: " + nilai);
      }
    }

    // If Ternari
    String keterangan = nilai == "A" ? keterangan = "Anda Lulus" : "Anda Gagal";
    System.out.println(keterangan);

  }
}
