import java.util.*;
public class Student {
private String name;
private List<String> assignments;

public Student(String name){
    this.name = name;
    this.assignments = new List<String>();
}
public Assignment(String assignName, double grade, boolean graded){
    this.assignName = assignName;
    this.grade = grade;
    this.graded = (grade > 0);
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
