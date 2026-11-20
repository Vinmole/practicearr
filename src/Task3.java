public class Task3 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int sum = 0;
        int count = 0;

        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.println();

        double average = (double) sum / arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                count++;
            }
        }
        System.out.println("Average: " + average);
        System.out.println("Numbers above average: " + count);
    }
}
