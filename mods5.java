import java.util.Scanner;
public class mods5 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
//Nadia Tambunan, 103122400005
        int x;

        System.out.println("silahkan input angka: ");
        x = masuk.nextInt();

        if (x > 10) {
            System.out.println("x lebih besar dari 10");
        }
        if (x > 5) {
            System.out.println("x lebih besar dari 5");
        } else {
            System.out.println("x tidak lebih besar dari 5");
        }

        if (x > 10) {
            System.out.println("x lebih besar dari 10");
        } else if (x > 5) {
            System.out.println("x lebih besar dari 5, tapi tidak lebih besar dari 10");
        } else if (x > 0) {
            System.out.println("x lebih besar dari 0, tapi tidak lebih besar dari 5");
        } else {
            System.out.println("x kurang dari atau sama dengan 0");
        }

    }
}
