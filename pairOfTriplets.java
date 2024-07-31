package Array;

import java.util.Scanner;

public class pairOfTriplets {

    // COUNT THE NUMBER OF TRIPLETS WHOSE SUM IS EQUAL TO THE GIVEN VALUE OF X.
    static int tripletSum(int[] arr, int target){
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++){  // first number
            for (int j = i+1; j < n; j++){  // second number
                for (int k = j+1; k < n; k++){  // third number
                    if (arr[i] + arr[j] + arr[k] == target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum ");
        int target = sc.nextInt();

        System.out.println("The number of triplet of " +target+ " is = " + tripletSum(arr, target));
    }
}
