package HomeAssignment;

import java.util.Scanner;

public class A4Q5 {
  public static void main(String[] args) {
    int N;
    Scanner obj = new Scanner(System.in);
    System.out.print("N : ");
    N = obj.nextInt();

    String pres = "";
    for (int i = 1; i <= N; i++) {
      if (i == 1) {
        for (int j = 1; j <= i; j++) {
          pres += j;
        }
        for (int j = (i - 1); j >= 1; j--) {
          pres += j;
        }
      } else {
        pres = pres + i + pres;
      }

      System.out.println(pres);
    }
    obj.close();
  }
}
