package Array;

import java.util.Scanner;

public class secondLargest {

    // FIND THE SECOND_LARGEST ELEMENT IN THE GIVEN ARRAY.
    static int findMaximum(int[] arr){
        int max = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static int findSecondMax(int[] arr){
        int max = findMaximum(arr);

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMaximum(arr);
        return secondMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Maximum element is: " + findMaximum(arr));
        System.out.println("Second maximum element is: " + findSecondMax(arr));
    }
}
