import java.util.*;

public class SearchingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 5, 8, 12, 9, 6, 20 };
        System.out.println("Enter the element to be searched ");
        int num = sc.nextInt();

        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++) {
            if (arr[i] == num) {
                System.out.println("element found at index " + i);
                break;
            } else if (arr[j] == num) {
                System.out.println("element found at index " + j);
                break;
            } else {
                j--;
            }
        }
    }
}