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

    }
    public double getMinimumGrade(String assignment){

    }
    public double getMaximumGrade(String assignment){

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
