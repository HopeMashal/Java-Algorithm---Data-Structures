public class InterpolationSearch {
  public static void main(String[] args) {
    int size = 1000000;
    int[] numbers = new int[size];
    // Full Array
    for (int i = 0; i < size; i++) {
      numbers[i] = i + 1;
    }
    // Interpolation Search
    int searchNumber = 1111;
    int NumberTry = 0;
    int low = 0;
    int high = numbers.length - 1;
    int mid = 0;
    Boolean isFound = false;
    while (!isFound) {
      NumberTry++;
      if (low > high) {
        System.out.println("NOT FOUND");
        break;
      }
      mid = low + (((high - low) / (numbers[high] - numbers[low])) * (searchNumber - numbers[low]));
      if (numbers[mid] == searchNumber) {
        System.out.println("Number is Found in index no. " + (mid + 1));
        System.out.println("Find after number of try: " + NumberTry);
        isFound = true;
        break;
      } else if (numbers[mid] < searchNumber) {
        low = mid + 1;
      } else if (numbers[mid] > searchNumber) {
        high = mid - 1;
      }
    }
  }
}
