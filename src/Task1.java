
public class Task1 {
    public static void main(String[] args) {
        int[] arr = {52, -3, 0, 8, -1, 0, 42, -67, 4, 2};
        int positive = 0;
        int negative = 0;
        int zero = 0;

        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println();
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
    }
}
