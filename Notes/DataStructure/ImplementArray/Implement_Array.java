package Notes.DataStructure.ImplementArray;

public class Implement_Array {
  public static void main(String[] args) {
    // One Dimension Array
    int[] number = new int[5];
    number[0]=12;
    number[1]=2;
    number[2]=21;
    number[3]=13;
    number[4]=11;
    System.out.println("Array of Number:- ");
    for(int i=0;i<number.length;i++){
      System.out.print(number[i]+"\t");
    }

    // Array of Object
    Student[] stu = new Student[3];
    stu[0] = new Student("Hope", 124);
    stu[1] = new Student("Amal", 123);
    stu[2] = new Student("Yuki", 121);
    System.out.println("\nArray of Object:- ");
    for(Student myStudent:stu){
      System.out.println("Name: "+myStudent.getName()+", ID: "+myStudent.getID());
    }
  }
}