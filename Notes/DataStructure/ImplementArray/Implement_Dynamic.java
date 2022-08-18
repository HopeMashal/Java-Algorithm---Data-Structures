public class Implement_Dynamic {
  public static void main(String[] args) {
    System.out.println("\n-------------Integer-------------\n");
    Dynamic_Array<Integer> dArray = new Dynamic_Array<Integer> ();
    dArray.put(3);
    System.out.println("Size: "+dArray.getArraySize());
    dArray.put(2);
    System.out.println("Size: "+dArray.getArraySize());
    dArray.put(5);
    System.out.println("Size: "+dArray.getArraySize());
    dArray.put(6);
    System.out.println("Size: "+dArray.getArraySize());
    dArray.put(8);
    System.out.println("Size: "+dArray.getArraySize());
    System.out.println("No. of Elements: "+dArray.getSize());
    System.out.println("The element in index no. 3 is: "+dArray.get(2));

    System.out.println("\n-------------Student-------------\n");
    Dynamic_Array<Student> sArray = new Dynamic_Array<Student>();
    Student stu1 = new Student("Hope", 124);
    Student stu2 = new Student("Amal", 123);
    Student stu3 = new Student("Yuki", 121);
    sArray.put(stu1);
    sArray.put(stu2);
    sArray.put(stu3);
    System.out.println("Size: "+sArray.getArraySize());
    System.out.println("No. of Elements: "+sArray.getSize());
    System.out.println("The element in index no. 2 is: "+sArray.get(1).toString());
  }
}
