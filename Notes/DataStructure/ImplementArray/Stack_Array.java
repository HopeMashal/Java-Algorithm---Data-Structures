public class Stack_Array<T> {

  int Size;
  Object[] ArrayStack;
  int top;

  public Stack_Array(int size) {
    Size = size;
    ArrayStack = new Object[Size];
    top=-1;
  }

  public void push(Object newItem){
    if(Isfull()) {
      System.out.println("Stack is full");
      return;
    } //Stack is full
    top +=1;
    ArrayStack[top]=newItem;
  }

  public T pop(){
    if(Isempty()) {
      System.out.println("Stack is empty");
      return null;
    } // is empty
    T item=(T) ArrayStack[top];
    top -=1;
    return item;
  }

  public boolean Isfull(){
    return (top==Size-1);
  }

  public boolean Isempty(){
    return (top==-1);
  }
}
