public class LinearSearch {
  public static void main(String[] args) {
    int size = 1000000;
    int[] numbers = new int[size];
    // Full Array
    for (int i = 0; i < size; i++) {
      numbers[i] = i + 1;
    }
    // Linear Search
    int searchNumber = 1111;
    int NumberTry = 0;
    for (int i = 0; i < size; i++) { // n Time
      NumberTry++;
      if (numbers[i] == searchNumber) { // C1
        System.out.println("Number is Found in index no. " + (i + 1));// C2
        System.out.println("Find after number of try: " + NumberTry);
        break;// C3
      }
      if (i == size - 1 && numbers[i] != searchNumber)
        System.out.println("NOT FOUND!!!");
    }
  }
}