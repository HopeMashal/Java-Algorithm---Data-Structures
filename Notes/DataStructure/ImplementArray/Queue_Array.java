public class Queue_Array {
  Object[] ArrayQueue;
  int Rear;
  int Front;
  int Size;

  public Queue_Array(int size) {
    Size = size;
    ArrayQueue = new Object[Size];
    Front=-1;
    Rear=-1;
  }

  
}
