import java.util.*;
public class Student {
private String name;
private List<String> assignments;

public Student(String name){
    this.name = name;
    this.assignments = List<String>();
}


public void addAssignment(String assignName) {
    double grade = 0;
    boolean graded = false;
    assignName = assignName + " Grade: Ungraded";
    assignments.add(assignName);

}
public void gradeAssignment(String assignment, double grade){
   graded = true;
    assignment = assignment + " Grade: " + grade;
    assignments.add(assignment);

}
public double getAssignmentGrade(String assignment){
  double grade;



}
public double getOverallGrade(){


}




}
