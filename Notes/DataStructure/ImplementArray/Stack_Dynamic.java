import java.util.Arrays;

public class Stack_Dynamic<T> {

  int Size;
  Object[] ArrayStack;
  int top;

  public Stack_Dynamic(int size) {
    Size = size;
    ArrayStack = new Object[Size];
    top = -1;
  }

  public void push(Object newItem) {
    ensureCapacity(top + 2);
    top += 1;
    ArrayStack[top] = newItem;
  }

  public T pop() {
    if (Isempty()) {
      System.out.println("Stack is empty");
      return null;
    } // is empty
    T item = (T) ArrayStack[top];
    top -= 1;
    return item;
  }

  public boolean Isempty() {
    return (top == -1);
  }

  public void ensureCapacity(int minCapacity) {
    int oldCapacity = ArrayStack.length;
    if (minCapacity > oldCapacity) {
      int newCapacity = oldCapacity * 2;
      if (newCapacity < minCapacity) { // When deleted element
        newCapacity = oldCapacity / 2;
      }
      ArrayStack = Arrays.copyOf(ArrayStack, newCapacity);
    }
  }
}
