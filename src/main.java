import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[] a = {1,3,5,7,9,11,13};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inputNumber = scanner.nextInt();
        System.out.println("\n"+recursiveBinarySearch(a,0,a.length-1,inputNumber));
    }

    public static int recursiveBinarySearch(int arr[], int low, int high, int value) {
        int mid = (low+high)/2;
        if (high >= low){
            if (arr[mid] == value) return mid;

            if (arr[mid]> value) return recursiveBinarySearch(arr,low, mid-1, value);

            if (arr[mid] < value) return recursiveBinarySearch(arr, mid+1, high, value);
        }
        return -1;
    }
}
