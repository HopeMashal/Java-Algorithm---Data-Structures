public class Queue_Linked<T> {
  Node_Q<T> Rear;
  Node_Q<T> Front;

  public Queue_Linked(Node_Q newNode) {
    Rear = newNode;
    Front = newNode;
  }

  public void Queue(Node_Q newNode){ //O(1)
    newNode.next = null;
    newNode.previous = Rear;
    Rear.next = newNode;
    Rear = newNode;
  }

  public T DeQueue(){ //O(1)
    if(isEmpty()) {
      System.out.println("Queue is empty");
      return null;
    }
    T value = (T)Front.value;
    Front = Front.next;
    if(Front != null) Front.previous=null;
    return value;
  }

  public boolean isEmpty(){
    return(Front == null || Rear == null);
  }

}
