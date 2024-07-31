package Array;

class ArrayQuestions {

    // CALCULATE THE SUM OF ALL ELEMENTS IN THE GIVEN ARRAY
    void sumOfArray(){
        int[] arr = {1, 5, 3};  // ANS = 9
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Addition: " + sum);
    }

    // CALCULATE THE MAXIMUM VALUE OUT OF ALL THE ELEMENTS IN THE ARRAY
    void maxValue() {
        int[] arr_1 = {1, 9, 4, 28, 73, 45};
        int ans = 0;

        for (int i = 0; i < arr_1.length; i++){
            if (arr_1[i] > ans){
                ans = arr_1[i];
            }
        }
        System.out.println("Maximum: " +ans);
    }

    // SEARCH THE GIVEN ELEMENT X IN THE ARRAY. IF PRESENT THEN RETURN THE INDEX ELSE RETURN -1
    void searchOfArray() {
        int[] arr_2 = {1, 5, 3};
        int x = 5;  // SEARCH FOR 5 IN arr_2
        int ans = -1;

        for (int i = 0; i < arr_2.length; i++){
            if (arr_2[i] == x) {
                ans = i;
                break;
            }
        }
        if (ans == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found " + x + " at index " + ans);
        }
    }
}

public class Questions {
    public static void main(String[] args) {
        ArrayQuestions obj = new ArrayQuestions();
        obj.sumOfArray();

        ArrayQuestions obj_1 = new ArrayQuestions();
        obj_1.maxValue();

        ArrayQuestions obj_2 = new ArrayQuestions();
        obj_2.searchOfArray();
    }
}
