
import java.util.ArrayList;
import java.util.Scanner;

class Student{
    private int id;
    private String name;
    private double marks;

    public Student(int id, double marks, String name) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getMarks() {
        return marks;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }

}



public class StudentRecordManagementSystem {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> student=new ArrayList<>();
    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n ++++++++ Student Record Management +++++++");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exit!");
                    break;
                default:
                   System.out.println("Invalid Choice. Re-try Again");
            }
        } while (choice != 5);
    }

    public static void addStudent(){
        System.out.println("Enter the student id :");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Student Name : ");
        String name = sc.nextLine();
        System.out.println("Enter the mark");
        double mark= sc.nextDouble();
        student.add(new Student(id, mark, name));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public static void viewStudents(){
        if(student.isEmpty()){
            System.out.println("Cannot Found Student Records Founds !");
        }else{
            student.forEach(System.out::println);
        }
    }

    public static void updateStudent(){
        System.out.println("Enter Student id : ");
        int id = sc.nextInt();
        sc.nextLine();
        boolean foundStudent= false;

        for (Student list : student) {
            if(list.getId() == id){
                System.out.println("Enter the Student Name : ");
                String name = sc.nextLine();
                System.out.println("Enter the Student Mark");
                double mark = sc.nextDouble();
                list.setName(name);
                list.setMarks(mark);
                System.out.println("Student updated successfully.");
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                foundStudent = true;
                break;
            }
        }

        if(!foundStudent) System.out.println("Student Not Found : ");
    }

    public static void deleteStudent(){
        System.out.println("Enter the Student ID : ");
        int id = sc.nextInt();
        boolean removed = student.removeIf(stud -> stud.getId() == id);
        if(removed){
            System.out.println("Student is removed successfully");
        }else{
            System.out.println("Student Not found!");
        }
    }
}
