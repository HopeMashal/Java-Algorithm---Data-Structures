public class Quick_Sort {
  static void Quick_Sort(int[] arr, int low, int high) {
    if (low >= high)
      return;
    int middle = low + (high - low) / 2;
    int pivot = arr[middle];
    int i = low;
    int j = high;
    while (i <= j) {
      while (arr[i] < pivot)
        i++;
      while (arr[j] > pivot)
        j--;
      if (i <= j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }
    }
    if (low < j)
      Quick_Sort(arr, low, j);
    if (high < i)
      Quick_Sort(arr, i, high);
  }

  public static void main(String[] args) {
    int[] arr = { 1, 50, 30, 10, 60, 80 };
    System.out.println("Before Sorting");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + "\t");
    }
    Quick_Sort(arr, 0, arr.length - 1);
    System.out.println("\nAfter Sorting");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + "\t");
    }
  }
}