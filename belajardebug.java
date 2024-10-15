import java.util.Scanner;

public class belajardebug {
    public static void main(String[] args) {
      Scanner masuk = new Scanner(System.in);

      float m, cm, inci;
      System.out.println("Masukkan ukuran dalam Meter :");
      m = masuk.nextFloat();
      cm = m * 100;
      inci = m * 100/ 25f;

      System.out.println("Ukuran dalam CM= " + cm);
      System.out.println("Ukuran dalam Inci= " + inci);
    }
    
}
