
/**@importing scanner package**/
import java.util.Scanner;

/** @create class */
public class OneDimensionalArray {

	public static void main(String[] args) {
		/** @Define array */
		int[] a;
		int temp, no;
		/** @Declaring size */
		a = new int[8];
		@SuppressWarnings("resource")
		Scanner ob = new Scanner(System.in);
		/** @Input from user */
		System.out.println("enter the number");
		for (int i = 0; i < a.length; i++) {
			a[i] = ob.nextInt();
		}
		/** @Print entered number */
		System.out.println("number entered by you ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		/** @Swap to sort array */
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print(" sorted ");
		/** @Printing sorted array */
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		/** @Enter the number you want to search */
		System.out.println("\n enter the element you want to find in array  ");
		Scanner obj2 = new Scanner(System.in);
		no = obj2.nextInt();
		/** @Initializing beginning and last index */
		int beg = 0;
		int last = a.length - 1;
		/** @A count for counter */
		int count = 0;
		/** @Condition till loop will last */
		while (beg <= last) {
			/** @Mid to store middle element for binary search */
			int mid = (beg + last) / 2;
			/** @Condition to print the specified number */
			if (no == a[mid]) {
				System.out.println("number present at position  " + mid);

				count++;

				break;
				/** @Logic in binary search */
			}
			if (no > a[mid]) {
				beg = mid + 1;
				;
			}
			if (no < a[mid]) {
				last = mid - 1;
			}
		}
		/** @Condition performed to check whether a number is in array or not */
		if (count == 0)
			System.out.println("Number given is not present in array  ");
		else
			System.out.println("number entered by you is present  ");
	}
}