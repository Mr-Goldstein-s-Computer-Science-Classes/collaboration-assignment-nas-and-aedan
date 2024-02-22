import java.util.*;
import java.util.List;
public class Student {
private String name;
private ArrayList<String> assignments;
private ArrayList<Double> grades;

private boolean graded;

    public Student(String name){
    this.name = name;
    this.assignments = new ArrayList<String>();
    this.grades = new ArrayList<Double>();
}
public void setName(String name){
        this.name = name;
}
public String getName(){
        return name;
}


public void addAssignment(String assignName) {
    double grade = 0;
    boolean graded = false;
    assignName = assignName + " Grade: Ungraded";
    assignments.add(assignName);
    grades.add(grade);

}
public void gradeAssignment(String assignment, double grade){
     this.graded = true;
    assignment = assignment + " Grade: " + grade;
    assignments.add(assignment);
    grades.add(grade);

}
public double getAssignmentGrade(String assignment){
        double grade = 0;
  for(int i = 0; i <= grades.size();i++){
      if(assignment.equalsIgnoreCase(assignments.get(i))){
           grade = grades.get(i);
      }
  }
  return grade;



}
public double getOverallGrade(){
    double overallGrade = 0;
    for(int i = 0; i <= grades.size();i++){
        overallGrade += grades.get(i);
    }
    return overallGrade;


}

public String toString(){
    String result = "Students name: " + this.name + " " + this.name + "'s average:" + getOverallGrade();
    return result;
}



}
