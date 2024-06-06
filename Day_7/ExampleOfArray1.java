public class ExampleOfArray1 {

    static int getMin(int arr[], int n) {
        if (n == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            res = Math.min(res, arr[i]);
        }
        return res;
    }

    static int getMax(int arr[], int n) {
        if (n == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            res = Math.max(res, arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 159, 96, 69, 111 };
        int n = arr.length;
        System.out.println("Minimum element of array: " + getMin(arr, n));
        System.out.println("Maximum element of array: " + getMax(arr, n));
    }
}
