import java.util.*;
import java.util.ArrayList;
public class Gradebook {
    private List<Student> students;
    private List<String> assignments;

    private List<Double> grades;
    public void createStudent(String name){
        Student s = new Student(name);
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
        grades.add(grade);
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
        double total = 0;
        int count = 0;
        for(Student student : students){
            double grade = student.getOverallGrade();
            if(grade >= 0){
                total += grade;
                count++;
            }
        }
        return count == 0 ? 0 : total / count;
    }
    public double getMaxOverall(){
        double maxGrade = Double.MIN_VALUE;
        for(Student student : students) {
            double grade = student.getOverallGrade();
            if(grade > maxGrade){
                maxGrade = grade;
            }
        }
        return maxGrade == Double.MIN_VALUE ? 0 : maxGrade;
    }
    public double getMinOverall(){
        double minGrade = Double.MAX_VALUE;
        for(Student student : students){
            double grade = student.getOverallGrade();
            if(grade >= 0 && grade < minGrade)
                minGrade = grade;
        }
        return minGrade == Double.MAX_VALUE ? 0 : minGrade;
    }
//    public double getStudentsGrade(){ // take IN student name, give student grades
//
//    }
//    public String toString(){
//        //Returns the names of the students and the names of the assignments as a String
//    }
    public Student getStudent(String studentName){
        for(Student student : students){
            if(student.getName().equals(studentName)){
                return student;
            }
        }
        return null;
    }
}


























