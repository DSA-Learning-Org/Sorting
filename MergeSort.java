import java.util.ArrayList;

public class MergeSort {

    public static void divide(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int mid = (low + high) / 2;

        divide(arr, low, mid);
        divide(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right < high) {
            temp.add(arr[right]);
            right++;
        }

        for (int j = low; j <= high; j++) {
            arr[j] = temp.get(j - low );
        }
    }

    public static void main(String[] args) {
        int[] arr = { 6, 7, 10, 1, 4, 5, 9, 2, 3, 8 };
        int n = arr.length - 1;

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        divide(arr, 0, n);

        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}