package Graph;

public class BinaryTreeDemo {
  public static void main(String[] args) {
    NodeTree root = new NodeTree(7, null, null);
    Binary_Tree bt = new Binary_Tree(root);
    for (int i = 1; i < 10; i++) {
      NodeTree newNode = new NodeTree(i, null, null);
      bt.AddNode(newNode, bt.root);
    }
    bt.Search(5, bt.root);
    bt.Search(15, bt.root);
  }
}
