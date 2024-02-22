import java.util.*;
public class Student {
private String name;
private List<String> grades;

public Student(String name){
    this.name = name;
    this.grades = new List<String>();
}

public void addAssignment(String assignName) {
    double grade = 0;
    assignName = assignName + " Grade: Ungraded";
    grades.add(assignName);

}
public void gradeAssignment(String assignment, double grade){
    assignment = assignment + " Grade: " + grade;
    if()
}
public double getAssignmentGrade(String assignment){
    double grade = 0;

}
public double getOverallGrade(){

}




}
