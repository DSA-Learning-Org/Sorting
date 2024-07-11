import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class List_Sort {
    // public static void partition(ArrayList<Integer> arr, int low, int high) {
    // if (low >= high)
    // return;
    // int mid = (low + high) / 2;
    // partition(arr, low, mid);
    // partition(arr, mid + 1, high);

    // merge(arr, low, mid, high);
    // }

    // public static void merge(ArrayList<Integer> arr, int low, int mid, int high)
    // {
    // ArrayList<Integer> temp = new ArrayList<>();
    // int left = low;
    // int right = mid + 1;

    // while (left <= mid && right <= high) {
    // if (arr.get(left) <= arr.get(right)) {
    // temp.add(arr.get(left));
    // left++;
    // } else {
    // temp.add(arr.get(right));
    // right++;
    // }

    // while (left <= mid) {
    // temp.add(arr.get(left));
    // left++;
    // }
    // while (right < high) {
    // temp.add(arr.get(right));
    // right++;
    // }

    // for (int i = low; i <= high; i++) {
    // arr.set(i, temp.get(i - low));
    // }
    // }
    // }

    public static void main(String[] args) {
        Node head = new Node(2);
        Node a = new Node(3);
        Node b = new Node(1);
        Node c = new Node(4);

        head.next = a;
        a.next = b;
        b.next = c;

        Node temp = head;

        ArrayList<Integer> arr = new ArrayList<Integer>();

        while (temp != null) {
            System.out.print(temp.data + " --> ");
            arr.add(temp.data);
            temp = temp.next;
        }
        System.out.println("NULL");

        Collections.sort(arr);

        // System.out.println(arr);

        LinkedList<Integer> ll = new LinkedList<>();

        for (int i = 0; i <= arr.size() - 1; i++) {
            ll.add(arr.get(i));
        }

        int i = 0;
        while (!ll.isEmpty()) {
            if (i <= ll.size() - 1) {
                System.out.print(ll.get(i) + " --> ");
                i++;
                if (i > ll.size()) {
                    break;
                }
            }
        }

        // partition(arr, 0, arr.size()-1);
    }

}
