public class Implement_Linked_Queue {
  public static void main(String[] args) {
    Node_Q<Integer> node = new Node_Q<Integer>(12, null, null);
    Queue_Linked<Integer> queuels = new Queue_Linked<Integer>(node);
    queuels.Queue(new Node_Q<Integer>(11, null, null));
    queuels.Queue(new Node_Q<Integer>(13, null, null));
    queuels.Queue(new Node_Q<Integer>(14, null, null));
    System.out.println(queuels.DeQueue());
    System.out.println(queuels.DeQueue());
    System.out.println(queuels.DeQueue());
    System.out.println(queuels.DeQueue());
    System.out.println(queuels.DeQueue());
  }
}
