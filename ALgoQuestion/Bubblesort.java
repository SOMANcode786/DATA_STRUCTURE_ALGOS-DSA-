package ALgoQuestion;

public class Bubblesort {
  public static void main(String[] args) {

    int[] arr = { 10, 7, 8, 9, 1, 5 };
    int n = arr.length;

    // Bubble Sort Algorithm
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          // Swap arr[j] and arr[j + 1]
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    // Print sorted array
    System.out.print("Sorted array: ");
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}
