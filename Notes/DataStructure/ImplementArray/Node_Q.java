import org.w3c.dom.Node;

public class Node_Q<T> {
  T value;
  Node_Q next;
  Node_Q previous;

  public Node_Q(T value, Node_Q next, Node_Q previous) {
    this.value = value;
    this.next = next;
    this.previous = previous;
  }

  
}
