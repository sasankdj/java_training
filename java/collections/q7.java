import java.util.ArrayList;
import java.util.Scanner;

class student {
    private int Id;
    private String Name;
    private int marks;

    student() {

    }

    student(int Id, String Name, int marks) {
        this.Id = Id;
        this.Name = Name;
        this.marks = marks;
    }

    public void setId(int Id) {
        this.Id = Id;

    }

    public void setName(String Name) {
        this.Name = Name;

    }

    public void setMarks(int marks) {
        this.marks = marks;

    }
    public void display(){
        System.out.print(Id);
        System.out.print(Name);
        System.out.println(marks);

    }
}

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        student s1 = new student();
        student s2 = new student();
        
        s1.setId(0);
        s1.setName("s");
        s1.setMarks(1);

        s2.setId(0);
        s2.setName("s");
        s2.setMarks(1);

        student s3 = new student(2,"a",3);
        student s4 = new student(2,"a",3);
        student s5 = new student(2,"a",3);


        ArrayList<student> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        
        al.add(s5);

        for (student s : al) {
            s.display();
        }
    }
}
