public class Hash_Table<T> {
  Entry[] arrayHash;
  int Size;

  public Hash_Table(int size) {
    Size = size;
    arrayHash = new Entry[Size];
    for(int i=0;i<arrayHash.length;i++){
      arrayHash[i] = new Entry<T>();
    }
  }

  int GetHash(int key){
    return key%Size;
  }

  public void put(int key, T value){
    int index=GetHash(key);
    Entry ArrayValue = arrayHash[index];
    Entry newItem = new Entry<T>(key, value);
    newItem.next = ArrayValue.next;
    ArrayValue.next=newItem;
  }

  public T get(int key){
    T value = null;
    int index = GetHash(key);
    Entry ArrayValue = arrayHash[index];
    while(ArrayValue!=null){
      if(ArrayValue.getKey() == key){
        value = (T)ArrayValue.getValue();
        break;
      }
      ArrayValue=ArrayValue.next;
    }
    return value;
  }
  
}
