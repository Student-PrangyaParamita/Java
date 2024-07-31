package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Question {

    // COUNT THE NUMBER OF OCCURRENCE OF A PARTICULAR ELEMENT OF X
    static int countOccurrence(int[] arr, int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                count++;
            }
        }
        return count;
    }

    // FIND THE LAST OCCURRENCE OF AN ELEMENT X IN A GIVEN ARRAY
    static int lastOccurrence(int[] arr, int x){
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    // COUNT THE NUMBER OF ELEMENTS STRICTLY GREATER THAN VALUE X
    static int strictlyGreater(int[] arr, int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > x){
                count++;
            }
        }
        return count;
    }

    // CHECK IF THE GIVEN ARRAY IS SHORTED OR NOT
    static boolean isShorted(int[] arr, int x){
        boolean check = true;

        for (int i = 1; i < arr.length; i++){
            if (arr[i] < arr[i-1]){
                // not shorted
                check = false;
                break;
            }
        }
        return check;
    }

    // QUESTION: return an array
    static int[] smallestAndLargestElement(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length-1]};
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements");

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter x: ");
        int x = sc.nextInt();

        System.out.println("Count of x: " + countOccurrence(arr, x));
        System.out.println("Last occurrence of x: " + lastOccurrence(arr, x));
        System.out.println("Elements strictly greater than x: " + strictlyGreater(arr, x) + " elements");
        System.out.println("Is shorted " + isShorted(arr, x));

        int[] ans = smallestAndLargestElement(arr);
        System.out.println("Smallest: " + ans[0]);
        System.out.println("Largest: " + ans[1]);
    }
}
