public class Student {
    
    String name;
    int rollNo;

    public Student(String studentName, int studentRollNo) {
        name = studentName;
        rollNo = studentRollNo;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args){
        Student s1 = new Student("Soham",6969);

        s1.displayDetails();
    }
}