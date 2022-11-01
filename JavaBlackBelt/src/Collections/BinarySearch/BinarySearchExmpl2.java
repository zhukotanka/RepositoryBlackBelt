package Collections.BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchExmpl2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(11, "Gavgav", 240);
        Employee emp2 = new Employee(13, "Biba", 170);
        Employee emp3 = new Employee(10, "Boba", 350);
        Employee emp4 = new Employee(10, "Buba", 120);
        Employee emp5 = new Employee(15, "Bibi", 470);
        Employee emp6 = new Employee(14, "Moawww", 550);
        List <Employee> employeeList = new ArrayList <>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        System.out.println(employeeList);
        //Collections.sort(employeeList, new idComparator());
        Collections.sort(employeeList);
        System.out.println(employeeList);
        int index = Collections.binarySearch(employeeList, new Employee(11, "Gavgav", 240));
        System.out.println(index);
    }
}

class Employee implements Comparable <Employee>{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return "[ id = " + id + " | " + " Name: " + name  + " | " + " Salary = " + salary + " ]" + "\n";
    }

    @Override
    public int compareTo(Employee employee) {
        int result = this.id - employee.id;
        if(result==0){
            result = this.name.compareTo(employee.name);
        }

        return result;
    }
}

/*class idComparator implements Comparator <Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {

        return o1.id - o2.id;
    }


}
*/