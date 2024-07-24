import java.util.Scanner;

public class Day_1 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "Hello🙋 ";

        int i2;
        double d2;
        String s2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer value: ");
        i2 = sc.nextInt();
        System.out.println("Enter the double type value: ");
        d2 = sc.nextDouble();
        System.out.println("Enter your name: ");
        sc.nextLine();
        s2 = sc.nextLine();

        System.out.println("your outputs are = ");
        int isum = i + i2;
        System.out.println("sum of integer value = " + isum);
        double dsum = d + d2;
        System.out.println("sum of double value = " + dsum);
        System.out.println("message : " + s+s2);

        sc.close();
        
    }
}