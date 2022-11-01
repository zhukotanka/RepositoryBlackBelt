package Generics.ComplexExampleOnGenerics;

public class Test {
    public static void main(String[] args) {
        Schooler schooler1 = new Schooler("Petr", 12);
        Schooler schooler2 = new Schooler("Nikolai", 11);
        Schooler schooler3 = new Schooler("Serg", 13);
        Schooler schooler4 = new Schooler("Sveta", 10);

        Student student1 = new Student("Vanya", 19);
        Student student2 = new Student("Andrew", 21);

        Employee employee1 = new Employee("Arthur", 29);
        Employee employee2 = new Employee("Kirill", 26);

        Team<Schooler> schoolerTeam = new Team<>("Schooler Team");
        schoolerTeam.addNewParticipant(schooler1);
        schoolerTeam.addNewParticipant(schooler2);

        Team<Schooler> schoolerTeam2 = new Team<>("Schooler2 Team");
        schoolerTeam2.addNewParticipant(schooler3);
        schoolerTeam2.addNewParticipant(schooler4);

        Team<Student> StudentTeam = new Team("Student Team");
        StudentTeam.addNewParticipant(student1);
        StudentTeam.addNewParticipant(student2);

        Team<Employee> EmployeeTeam = new Team("Employee Team");
        EmployeeTeam.addNewParticipant(employee1);
        EmployeeTeam.addNewParticipant(employee2);

        schoolerTeam.playWith(schoolerTeam2);
        StudentTeam.playWith(StudentTeam);
        schoolerTeam2.playWith(schoolerTeam);
        EmployeeTeam.playWith(EmployeeTeam);
    }
}
