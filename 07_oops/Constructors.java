import java.util.Arrays;

public class Constructors {

    public static void main(String[] args) {

        Student s1 = new Student("Kid 1", 1);
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        System.out.println(Arrays.toString(s1.marks));

        Student s2 = new Student(s1);

        s2.marks[1] = 100;

        System.out.println(Arrays.toString(s2.marks));
    }
}

class Student {

    int roll;
    String name;
    int marks[];

    Student() {
        System.out.println("New object created");
        marks = new int[3];
    }

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
        marks = new int[3];
    }

    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = new int[3];

        // The line below soft copies the content, hence referencing both the s1 and s2
        // to the same affress making no difference even if values are changed
        // this.marks = s1.marks;

        // Below is the code for deep copy
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }

    }

}
