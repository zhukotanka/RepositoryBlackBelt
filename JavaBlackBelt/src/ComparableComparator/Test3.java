package ComparableComparator;

import java.util.*;

public class Test3 {

    public static void main(String[] args) {
        List <Employee> list = new ArrayList <>();
        Employee emp1 = new Employee(100, "Athur", "Rakhmankulov", 200);
        Employee emp2 = new Employee(100, "Athur", "Aakhmankulov", 220);
        Employee emp3 = new Employee(122, "Petya", "Vasilenko", 100);
        Employee emp4= new Employee(50, "Kolya", "Nikitenko", 450);
        Employee emp5 = new Employee(153, "Maria", "Ibrahimova", 500);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        System.out.println("Before sorting \n" + list);
        //Collections.sort(list);
        Collections.sort(list, new SalaryComparator());
        System.out.println("After sorting \n" + list);

    }
}

class Employee/* implements Comparable <Employee>*/{
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

   /* @Override
    public int compareTo(Employee emp) {
        if(this.id == emp.id){
           return 0;
       }
       else if(this.id < emp.id) {
           return  -1;
       }
       else {
           return 1;
       }
        /*return this.id-emp.id;
        return (this.id < emp.id) ? -1 : ((this.id == emp.id) ? 0 : 1);
        return this.id.compareTo(emp.id);
        int res =  this.name.compareTo(emp.name);
        if (res==0){
            res = this.surname.compareTo(emp.surname);
        }
        return res;*/
    /* }*/


}

class NameComparator implements Comparator <Employee>{

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComparator implements Comparator <Employee>{

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp2.salary-emp1.salary;
    }
}

class IdComparator implements Comparator <Employee>{

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.id-emp2.id;
    }
}

