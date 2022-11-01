package Collections.MethodsEqualsAndHashCode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeExmpl1 {
    public static void main(String[] args) {
        HashMap<Student, Double> map = new HashMap <>();
        Student st1 = new Student("Arthur", "Rakhmankulov", 3);
        Student st2 = new Student("Mariya", "Sidorova", 4);
        Student st3 = new Student("Vova", "Petrov", 2);
        Student st4 = new Student("Vova", "Petrov", 2);
        Student st5 = new Student("Vofva", "Petdov", 2);
        map.put(st1, 8.2);
        map.put(st2, 4.5);
        map.put(st3, 9.6);

        st1.getName();
        st3.getName();


        //map.put(st4, 9.6);
//        System.out.println(map);
//        System.out.println(map.containsKey(st1));
//        System.out.println(st1.hashCode());
//
//        System.out.println(map.containsKey(st1));
//        System.out.println(st1.hashCode());
//        boolean result = map.containsKey(st4);
//        System.out.println(result);
//        System.out.println(st3.hashCode());
//        System.out.println(st4.hashCode());
//
//        System.out.println(map.entrySet());
//        for (Map.Entry<Student, Double> entry: map.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
//        Map<Integer, String> map2 = new HashMap <>(16, 0.75f);

    }
}

final class Student{
    private final String name;
    private final String surname;
    private final int course;

    Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

     void getName(){
        String name = this.name;
        System.out.println(name);
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
    /*@Override
    public int hashCode() {
        return name.length() + surname.length() + course;
    }*/

}
