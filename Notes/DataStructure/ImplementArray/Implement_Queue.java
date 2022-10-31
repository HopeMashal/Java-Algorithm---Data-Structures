public class Implement_Queue {
  public static void main(String[] args) {
    Queue_Array<String> queue = new Queue_Array<String>(4);
    queue.Queue("Amal");
    queue.Queue("Hope");
    queue.Queue("Yuki");
    queue.Queue("Akira");
    queue.Queue("Iso"); // Queue is full
    System.out.println(queue.DeQueue()); // Amal
    System.out.println(queue.DeQueue()); // Hope
    System.out.println(queue.DeQueue()); // Yuki
    System.out.println(queue.DeQueue()); // Akira
    System.out.println(queue.DeQueue()); // Queue is empty \n null
    System.out.println("Rear: " + queue.Rear); // Rear: 3
    System.out.println("Front: " + queue.Front); // Front: 4
  }
}
