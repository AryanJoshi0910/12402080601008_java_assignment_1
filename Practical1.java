import java.util.Arrays;

class ArrayString {
    int[] arr;
    String str;

    ArrayString(int[] arr, String str) {
        this.arr = arr;
        this.str = str;
    }

    void reverse() {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int t = arr[i]; arr[i] = arr[j]; arr[j] = t;
        }
        System.out.println("Reversed: " + Arrays.toString(arr));
    }

    void sort() {
        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));
    }

    void search(int key) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) { System.out.println("Found at index " + i); return; }
        System.out.println("Not found");
    }

    void average() {
        int sum = 0;
        for (int x : arr) sum += x;
        System.out.println("Average: " + (double) sum / arr.length);
    }

    void maximum() {
        int max = arr[0];
        for (int x : arr) if (x > max) max = x;
        System.out.println("Maximum: " + max);
    }

    void stringOps() {
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + new StringBuilder(str).reverse());
        System.out.println("Uppercase: " + str.toUpperCase());
    }
}

public class A1P1 {
    public static void main(String[] args) {
        ArrayString obj = new ArrayString(new int[]{5, 2, 8, 1, 9}, "hello");
        obj.reverse();
        obj.sort();
        obj.search(8);
        obj.average();
        obj.maximum();
        obj.stringOps();
    }
}
