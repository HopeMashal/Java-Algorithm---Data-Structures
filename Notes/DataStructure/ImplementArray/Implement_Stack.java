//import java.util.Stack;

public class Implement_Stack {
  public static void main(String[] args) {
    System.out.println("\nStack Array");
    Stack_Array<Integer> stack = new Stack_Array<Integer>(5);
    stack.push(11);
    stack.push(12);
    stack.push(22);
    System.out.println("Top: " + stack.top);
    System.out.println(stack.pop());
    System.out.println("Top: " + stack.top);

    System.out.println("\nDynamic Stack Array");

    // Dynamic Stack Array
    // Like Stack<Integer> s = new Stack<Integer>();
    Stack_Dynamic<Integer> stackD = new Stack_Dynamic<Integer>(3);
    stackD.push(11);
    stackD.push(12);
    stackD.push(22);
    System.out.println("Top: " + stackD.top);
    System.out.println("Size: " + stackD.ArrayStack.length);
    stackD.push(222);
    System.out.println("Size: " + stackD.ArrayStack.length);
    System.out.println(stackD.pop());
    System.out.println("Top: " + stackD.top);
    System.out.println("Size: " + stackD.ArrayStack.length);

    System.out.println("\nLinked Stack Array");

    // Linked Stack Array
    Stack_LinkedList StackL = new Stack_LinkedList(new Node<Integer>(12, null));
    StackL.push(new Node<String>("11", null));
    StackL.push(new Node<Integer>(13, null));
    StackL.Display();
    System.out.println("After Delete");
    StackL.pop();
    StackL.Display();
  }
}
