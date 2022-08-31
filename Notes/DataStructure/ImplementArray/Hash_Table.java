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
  
}
