public class Heap_Sort {

  static int total;

  static void Heapify(int[] arr, int ParentIndex){
    int LeftNodeIndex= ParentIndex*2;
    int RightNodeIndex = (ParentIndex*2) +1;
    int NewIndex = ParentIndex;
    if(LeftNodeIndex<total && arr[LeftNodeIndex]>arr[ParentIndex]){
      NewIndex=LeftNodeIndex;
    }
    if(RightNodeIndex<total && arr[RightNodeIndex]<arr[ParentIndex]){
      NewIndex=RightNodeIndex;
    }
    if(NewIndex != ParentIndex){
      swap(arr, ParentIndex, NewIndex);
      Heapify(arr, NewIndex);
    }
  }

  static void swap(int[] arr, int a, int b){
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

  static void PreSort(int[] arr){
    total = arr.length-1;
    for(int i=total/2; i>=0;i--){
      Heapify(arr, i);
    }
    for(int i=total; i>=0;i--){
      swap(arr, 0, i);
      total--;
      Heapify(arr, 0);
    }
  }

  public static void main(String[] args) {
    int[] arr={1,50,30,10,60,80};
    System.out.println("Before Sorting");
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + "\t");
    }
    PreSort(arr);
    System.out.println("\nAfter Sorting");
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + "\t");
    }
  }
}
