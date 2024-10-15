import java.util.Scanner;
//Nadia Tambunan, 103122400005
public class GradeTest {
    public static void main(String[] args) {
      Scanner Input =  new Scanner(System.in);
      int nilai;

      System.out.println("Input Nilai : ");
      nilai = Input.nextInt();


      if (nilai <= 100 && nilai > 89) {
        System.out.println("nilai A");

      } else if (nilai <= 90 && nilai > 79) { 
        System.out.println("nilai B");
      
      } else if (nilai <= 80 && nilai > 69) {
        System.out.println("nilai C");
      
      } else if (nilai <= 70 && nilai > 59) {
        System.out.println("nilai D");
      
      } else if (nilai <= 60 && nilai > 0) {
        System.out.println("nilai E");
      
      } else  {
        System.out.println("nilai tidak terdaftar");
      }


    }
}
