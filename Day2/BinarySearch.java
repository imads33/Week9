import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println("Enter the element to be searched ");
        int num = sc.nextInt();
        int start = 0, stop = arr.length - 1;

        while (true) {
            int mid = (start + stop) / 2;
            if (arr[mid] == num) {
                System.out.println("element found at index " + mid);
                break;
            } else if (arr[mid] > num) {
                stop = mid - 1;
            } else if (arr[mid] < num) {
                start = mid + 1;
            }
        }
    }
}
