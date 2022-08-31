package Notes.DataStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Refresh_Collections {
  public static void main(String[] args) {
    //Dynamic Array
    ArrayList<String> ar = new ArrayList<String>();
    ar.add("Hope"); //O(n)
    ar.remove(0);

    //Linked List
    LinkedList<String> ls = new LinkedList<String>();
    ls.add("Yuki");

    //Dynamic Stack Array
    Stack<String> st = new Stack<String>(); 
    st.push("Amal");
    st.pop();

    //Queue
    Queue<String> q = new LinkedList<String>();
    q.add("Yuuki");
    q.poll();

    //Priority Queue
    PriorityQueue<String> pq = new PriorityQueue<String>();
    pq.poll();

    // Hash Table
    HashMap<Integer,String> hash = new HashMap<Integer,String>();
    hash.put(11, "Hope Mashal");
    hash.get(11);
  }
}
