public class Implement_Linked {
  public static void main(String[] args) {
    Linked_List ls = new Linked_List(new Node<Integer>(12, null));
    ls.add(new Node<String>("11",null));
    ls.add(new Node<Integer>(13,null));
    ls.Display();
    System.out.println("After Delete");
    ls.delete();
    ls.Display();
  }
}
