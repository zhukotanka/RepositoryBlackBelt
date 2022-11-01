package Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList <Student> studentsAl = new ArrayList <>();
        Student st1 = new Student("Arthur", 20, 3, 10.3);
        Student st2 = new Student("Slavik", 19, 3, 88.9);
        Student st3 = new Student("Maria", 22, 5, 11.1);

        studentsAl.add(st1);
        studentsAl.add(st2);
        studentsAl.add(st3);

        //System.out.println(studentsAl);
      Student st4 = new Student("Maria", 22, 5, 11.1);
//       studentsAl.remove(st4);
//        studentsAl.set(1, st4);
//        studentsAl.add(0, st4);
        //System.out.println(studentsAl.get(0));
        //System.out.println(studentsAl);

        ArrayList <Student> studentsAl2 = new ArrayList <>();
        studentsAl2.add(st1);
        studentsAl2.add(st2);
        studentsAl2.addAll(2, studentsAl);
        System.out.println("studentsAl2: " + studentsAl2.toString());
//        studentsAl2.clear();
//        System.out.println("studentsAl2: " + studentsAl2);
        //System.out.println(studentsAl.indexOf(st4));
    }


}

class Student{
    String name;
    int age;
    int course;
    double grade;

    public Student(String name, int age, int course, double grade) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", grade=" + grade +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && course == student.course && Double.compare(student.grade, grade) == 0 && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, course, grade);
    }
}

class createStudents{
    static ArrayList createSomeStudents(){
        ArrayList <Student> studentsAl = new ArrayList <>();
        Student st1 = new Student("Arthur", 20, 3, 10.3);
        Student st2 = new Student("Slavik", 19, 3, 8.9);
        Student st3 = new Student("Maria", 22, 5, 11.4);
        Student st4 = new Student("Maria", 22, 5, 11.4);
        studentsAl.add(st1);
        studentsAl.add(st2);
        studentsAl.add(st3);
        studentsAl.add(st4);

        return studentsAl;
    }
}
