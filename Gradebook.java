import java.util.*;
import java.util.ArrayList;
public class Gradebook {
    private List<Student> students;
    private List<String> assignments;
    public void createStudent(String name){
        students = new ArrayList<>();
        assignments = new ArrayList<>();
    }
    public void addAssignment(String assignment){
        assignments.add(assignment);
    }
    public void gradeAssignment(String assignment, String studentName, double grade){
        for(Student student : students){
            if(student.getName().equals(studentName)){
                student.gradeAssignment(assignment, grade);
                break;
            }
        }
    }
    public double getAverageGrade(String assignment){
        double total = 0;
        int count = 0;
        for(Student student : students) {
            double grade = student.getAssignmentGrade(assignment);
            if (grade >= 0) {
                total += grade;
                count++;
            }
        }
        return count == 0 ? 0 : total / count;
    }
    public double getMinimumGrade(String assignment){
        double minGrade = Double.MAX_VALUE;
        for(Student student : students) {
            double grade = student.getAssignmentGrade(assignment);
            if(grade >= 0 && grade < minGrade){
                minGrade = grade;
            }
        }
        return minGrade == Double.MAX_VALUE ? 0 : minGrade;
    }
    public double getMaximumGrade(String assignment){
        double maxGrade = Double.MIN_VALUE;
        for(Student student : students){
            double grade = student.getAssignmentGrade(assignment);
            if(grade > maxGrade)
                maxGrade = grade;

        }
        return maxGrade == Double.MIN_VALUE ? 0 : maxGrade;
    }
    public double getAverageOverall(){

    }
    public double getMaxOverall(){

    }
    public double getMinOverall(){

    }
    public double getStudentsGrade(){

    }
    public String toString(){
        //Returns the names of the students and the names of the assignments as a String
    }
    public String getStudent(String studentName){

    }
}
















