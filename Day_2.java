import java.util.Scanner;

public class Day_2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<1;i++){
            System.out.println("Enter the subject name: ");
            String s1=sc.next();
            System.out.println("enter the mark of that subject: ");
            int x=sc.nextInt();
            System.out.println("Enter the subject name: ");
            String s2=sc.next();
            System.out.println("enter the mark of that subject: ");
            int x2=sc.nextInt();
            System.out.println("Enter the subject name: ");
            String s3=sc.next();
            System.out.println("enter the mark of that subject: ");
            int x3=sc.nextInt();
            
            System.out.println("Your subjects and releted marks are:");
            System.out.println("\nSubject\t\tMark");
            System.out.printf( "%-15s%03d %n", s1, x);
            System.out.printf( "%-15s%03d %n", s2, x2);
            System.out.printf( "%-15s%03d %n", s3, x3);
        }
            
        System.out.println("================================");
        sc.close();

    }

}
