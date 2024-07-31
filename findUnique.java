package Array;

import java.util.Scanner;

public class findUnique {

    /* FIND THE UNIQUE NUMBER IN A GIVEN ARRAY WHERE ALL ELEMENTS
       ARE BEING REPEATED TWICE WITH ONE VALUE BEING UNIQUE.
       *ONLY POSITIVE ELEMENTS IN ARRAY*/
    static int uniqueNumber(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n; i++){
            for (int j = i+1 ; j < n; j++){
                if (arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        int ans = -1;
        for (int i = 0; i < n; i++){
            if (arr[i] > 0){
                ans = arr[i];
            }
        }
        return ans;
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


        System.out.println("Unique number is: " + uniqueNumber(arr));
    }
}
