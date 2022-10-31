public class Implement_Array {
  public static void main(String[] args) {
    // One Dimension Array
    int[] number = new int[5];
    number[0] = 12;
    number[1] = 2;
    number[2] = 21;
    number[3] = 13;
    number[4] = 11;
    System.out.println("Array of Number:- ");
    for (int i = 0; i < number.length; i++) {
      System.out.print(number[i] + "\t");
    }
    System.out.println("");

    // Array of Object
    Student[] stu = new Student[3];
    stu[0] = new Student("Hope", 124);
    stu[1] = new Student("Amal", 123);
    stu[2] = new Student("Yuki", 121);
    System.out.println("\nArray of Object:- ");
    for (Student myStudent : stu) {
      System.out.println("Name: " + myStudent.getName() + ", ID: " + myStudent.getID());
    }

    // Two Dimension Array
    int[][] data = new int[3][3];
    data[0][0] = 1;
    data[0][1] = 2;
    data[0][2] = 3;
    data[1][0] = 4;
    data[1][1] = 5;
    data[1][2] = 6;
    data[2][0] = 7;
    data[2][1] = 8;
    data[2][2] = 9;
    System.out.println("\nTwo Dimension Array:- ");
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[0].length; j++) {
        System.out.print(data[i][j] + "\t");
      }
      System.out.println("");
    }
  }
}