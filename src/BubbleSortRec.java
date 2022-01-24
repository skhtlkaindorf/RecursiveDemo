import java.util.Arrays;

public class BubbleSortRec {
    public static void main(String[] args) {

        int[] arr = {9, 8, 7, 6, 5, 4, 3};

        System.out.println("unsorted");
        System.out.println(Arrays.toString(arr));

        sortArray(arr, arr.length);

        System.out.println("sorted");
        System.out.println(Arrays.toString(arr));
    }

    public static boolean sortArray(int[] arr, int n) {

        boolean exchanged = false;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                exchanged = true;
            }
        }
        //if (exchanged)
            sortArray(arr, n - 1);

        return true;
    }

}
