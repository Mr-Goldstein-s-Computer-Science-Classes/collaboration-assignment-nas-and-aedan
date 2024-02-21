public class Student {
private String name;

public Student(String name){
    this.name = name;
}

public void addAssignment(String assignName) {
    assignName = assignName + " Grade: Ungraded";

}
public void gradeAssignment(String assignment, double grade){
    assignment = assignment + " Grade: " + grade;
}
public double getAssignmentGrade(String assignment){
    double grade = 0;

}




}
