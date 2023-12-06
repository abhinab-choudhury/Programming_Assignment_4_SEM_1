package HomeAssignment;

import java.util.Scanner;

public class A4Q3 {
    public static void main(String args[]) {
        int l, r; 
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Left Range : ");
        l = obj.nextInt();
        System.out.print("Enter the Right Range : ");
        r = obj.nextInt();

        for(int i = l,k = 1;i <= r;i++,k++) {
            System.out.print(i + " ");
            if(k == 5) {
                k = 0;
                System.out.println();
            }
        }

    }
}
