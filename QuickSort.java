public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        int pivot;
        if (low < high) {
            pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int left = low;
        int right = high;

        int pivot_item = arr[low];

        while (left < right) {
            while (arr[left] <= pivot_item && left <= high) {
                left++;
            }
            while (arr[right] > pivot_item && right >= low) {
                right--;
            }

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        arr[low] = arr[right];
        arr[right] = pivot_item;
        return right;
    }

    public static void main(String[] args) {
        int[] arr = { 50, 25, 92, 16, 76, 30, 43, 54, 19};
        int low = 0;
        int high = arr.length - 1;

        quickSort(arr, low, high);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
