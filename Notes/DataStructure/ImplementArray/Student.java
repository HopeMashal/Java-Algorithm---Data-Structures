package Notes.DataStructure.ImplementArray;

public class Student {
  private String Name;
  private int ID;
  
  public Student(String name, int iD) {
    Name = name;
    ID = iD;
  }

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  public int getID() {
    return ID;
  }

  public void setID(int iD) {
    ID = iD;
  }

  @Override
  public String toString() {
    return "Student [ID=" + ID + ", Name=" + Name + "]";
  }

  
}
