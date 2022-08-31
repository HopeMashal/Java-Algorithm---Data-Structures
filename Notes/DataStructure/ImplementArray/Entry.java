public class Entry<T> {
  int Key;
  T Value;
  Entry next;

  public Entry(int key, T value) {
    Key = key;
    Value = value;
    next = null;
  }

  public int getKey() {
    return Key;
  }

  public T getValue() {
    return Value;
  }

  
}
