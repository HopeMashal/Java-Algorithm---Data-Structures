public class Implement_Stack {
  public static void main(String[] args) {
    Stack_Array<Integer> stack = new Stack_Array<Integer>(5);
    stack.push(11);
    stack.push(12);
    stack.push(22);
    System.out.println("Top: "+stack.top);
    System.out.println(stack.pop());
    System.out.println("Top: "+stack.top);
  }
}
