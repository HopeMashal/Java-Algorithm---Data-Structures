public class Heap_Sort {

  static void Heapify(int[] arr, int i){
    int LeftNodeIndex= i*2;
  }
  public static void main(String[] args) {
    int[] arr={1,50,30,10,60,80};
    System.out.println("Before Sorting");
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + "\t");
    }
    
    System.out.println("\nAfter Sorting");
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + "\t");
    }
  }
}
