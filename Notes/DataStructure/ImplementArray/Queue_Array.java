public class Queue_Array<T> {
  Object[] ArrayQueue;
  int Rear; // last added item
  int Front; // first added item
  int Size;

  public Queue_Array(int size) {
    Size = size;
    ArrayQueue = new Object[Size];
    Front=-1;
    Rear=-1;
  }

  public void Queue(Object newItem){
    if(isFull()) {
      System.out.println("Queue is full");
      return;
    }
    Rear +=1;
    ArrayQueue[Rear]= newItem;
    if (Front == -1) Front=0; //only execute one time
  }

  public T DeQueue(){
    if(isEmpty()) {
      System.out.println("Queue is empty");
      return null;
    }
    T objectOut =(T)ArrayQueue[Front];
    Front+=1;
    return objectOut;
  }

  public boolean isFull(){
    return(Rear == Size-1);
  }

  public boolean isEmpty(){
    return(Front == -1 || Front> Rear);
  }
  
}
