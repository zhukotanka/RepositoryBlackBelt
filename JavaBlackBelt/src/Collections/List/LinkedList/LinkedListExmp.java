package Collections.List.LinkedList;


import java.util.LinkedList;

public class LinkedListExmp {
    public static void main(String[] args) {
        Student2 st1 = new Student2("Arthur", 20);
        Student2 st2 = new Student2("Vova", 31);
        Student2 st3 = new Student2("Kirill" , 19);
        Student2 st4 = new Student2("Olya", 23);
        Student2 st5 = new Student2("Petr", 28);
        LinkedList <Student2> student2LinkedList = new LinkedList <>();
        student2LinkedList.add(st1);
        student2LinkedList.add(st2);
        student2LinkedList.add(st3);
        student2LinkedList.add(st4);
        student2LinkedList.add(st5);
        System.out.println(student2LinkedList);

    }
}

class Student2{
    String name;
    int age;

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "[ Name: " + name + " age: " + age + " ]";
    }

}
