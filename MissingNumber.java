/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
public class MissingNumber {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 5, 4, 6, 9, 7, 8, 10};
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        
        int min = numbers[0];
        int max = numbers[numbers.length - 1];
        
        System.out.print("Missing numbers: ");
        for (int i = min; i <= max; i++) {
            boolean found = false;
            for (int num : numbers) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(i + " ");
            }
        }
    }
}