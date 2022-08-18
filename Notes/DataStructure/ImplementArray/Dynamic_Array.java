import java.util.Arrays;

public class Dynamic_Array<T> {
  private Object[] data;
  private int size;

  public Dynamic_Array() {
    size=0;
    data = new Object[1];
  }

  public int getSize() {
    return size;
  }

  public int getArraySize() {
    return data.length;
  }

  public T get(int index){
    return (T) data[index];
  }

  public void put(T element){
    ensureCapacity(size+1);
    data[size++]=element;
  }

  public void ensureCapacity(int minCapacity){
    int oldCapacity = data.length;
    if(minCapacity > oldCapacity){
      int newCapacity = oldCapacity * 2;
      if(newCapacity<minCapacity){ // When deleted element
        newCapacity = minCapacity;
      }
      data = Arrays.copyOf(data, newCapacity);
    }
  }

}
