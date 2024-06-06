// Java program to count occurrences 
// of an element

public class ExampleOfArray3{

    static int countOccurrences(int arr[], int n, int x)
    {
        int res = 0;
        for (int i=0; i<n; i++)
            if (x == arr[i])
              res++;
        return res;
    }
    
    public static void main(String args[])
    {
        int arr[] = {1,2,2,2,2,3,4,7,9,8,8,11,16};
        int n = arr.length;
        int x = 8;
        System.out.println(countOccurrences(arr, n, x));
    }
}

