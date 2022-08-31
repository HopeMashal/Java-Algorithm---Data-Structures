public class Implement_Hash_Table {
  public static void main(String[] args) {
    Hash_Table<String> hash = new Hash_Table<String>(10);
    hash.put(10, "Hope");
    hash.put(11, "Amal");
    hash.put(5, "Yuki");
    System.out.println(hash.get(5));
    System.out.println(hash.get(10));
    System.out.println(hash.get(11));
  }
}
