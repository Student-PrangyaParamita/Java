package Array;

import java.util.Scanner;

public class secondSmallest {

    // FIND THE SECOND_SMALLEST ELEMENT IN THE GIVEN ARRAY.
    static int MinValue(int[] arr){
        int n = arr.length;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    static int secondMinValue(int[] arr){
        int min = MinValue(arr);

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == min){
                arr[i] = Integer.MAX_VALUE;
            }
        }
        int second_Min = MinValue(arr);
        return second_Min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array length ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Minimum value is: " + MinValue(arr));
        System.out.println("Second Minimum value is: " + secondMinValue(arr));
    }
}
