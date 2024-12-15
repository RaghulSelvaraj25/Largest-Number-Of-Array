package project.numberlargestarray;

import java.util.Scanner;

public class largestnumberarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter " + size + " elements of the array:");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();

		}
		int largest = array[0];
		for (int i = 1; i < size; i++) {
			if (array[i] > largest) {
				largest = array[i];

			}
			System.out.println("Element: " + array[i] + ", Largest so far: " + largest);

		}
		System.out.println("The largest element in the array is: " + largest);
		scanner.close();
	}

}
