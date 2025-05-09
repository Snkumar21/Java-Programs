// Sorting code in java in ascending order.
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class sorting {

	public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the number of elements:");
			int n = scan.nextInt();

			Integer[] arr = new Integer[n];

			System.out.println("Enter the numbers:");
			for (int i = 0; i < n; i++) {
				arr[i] = scan.nextInt();
			}

			Arrays.sort(arr);
			System.out.println("Ascending Order: " + Arrays.toString(arr));

			Arrays.sort(arr, Collections.reverseOrder());
			System.out.println("Descending Order: " + Arrays.toString(arr));
		}
    }
}