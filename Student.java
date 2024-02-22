import java.util.*;
public class Student {
private String name;
private List<String> assignments;
private List<double> grades;

public Student(String name){
    this.name = name;
    this.assignments = List<String>();
    this.grades = List<double>();
}


public void addAssignment(String assignName) {
    double grade = 0;
    boolean graded = false;
    assignName = assignName + " Grade: Ungraded";
    assignments.add(assignName);
    grades.add(grade);

}
public void gradeAssignment(String assignment, double grade){
   graded = true;
    assignment = assignment + " Grade: " + grade;
    assignments.add(assignment);
    grades.add(grade);

}
public double getAssignmentGrade(String assignment){
  for(int i = 0; i <= grades.size();i++){
      if(assignment.equalsIgnoreCase(assignments.get(i))){
          return grades.get(i);
      }
  }



}
public double getOverallGrade(){
    double overallGrade = 0;
    for(int i = 0; i <= grades.size();i++){
        overallGrade += grades.get(i);
    }
    return overallGrade;


}

public String toString(){
    String result = "Students name: " + this.name + " " + this.name + "'s average:" + Student.getOverallGrade();
    return result;
}






}
