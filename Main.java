public class Main {
    public static void main(String[] args) {

     Gradebook grades = new Gradebook();

     //create some students
        grades.createStudent("Tyler");
        grades.createStudent("James");
        grades.createStudent("Ethan");
        grades.createStudent("Scotty");
        grades.createStudent("David");
        grades.createStudent("Patrick");

     //create assignments
        grades.addAssignment("Stacks and Queues Station Activity");
        grades.addAssignment("Stacks and Queues programs");
        grades.addAssignment("Stacks and Queues quiz");
        grades.addAssignment("Github Exploration");

     //grade assignments for snq stations
        grades.gradeAssignment("Stacks and Queues Station Activity", "Tyler", 94);
        grades.gradeAssignment("Stacks and Queues Station Activity", "James", 14);
        grades.gradeAssignment("Stacks and Queues Station Activity", "Ethan", 5);
        grades.gradeAssignment("Stacks and Queues Station Activity", "Scotty", 100);
        grades.gradeAssignment("Stacks and Queues Station Activity", "David", 0);
        grades.gradeAssignment("Stacks and Queues Station Activity", "Patrick", 79);

     //grade assignments for snq programs
        grades.gradeAssignment("Stacks and Queues programs", "Tyler", 100);
        grades.gradeAssignment("Stacks and Queues programs", "James", 64);
        grades.gradeAssignment("Stacks and Queues programs", "Ethan", 100);
        grades.gradeAssignment("Stacks and Queues programs", "Scotty", 101);
        grades.gradeAssignment("Stacks and Queues programs", "David", 26);
        grades.gradeAssignment("Stacks and Queues programs", "Patrick", 99);

     //grade assignments for snq quiz
        grades.gradeAssignment("Stacks and Queues quiz", "Tyler", 100);
        grades.gradeAssignment("Stacks and Queues quiz", "James", 100);
        grades.gradeAssignment("Stacks and Queues quiz", "Ethan", 100);
        grades.gradeAssignment("Stacks and Queues quiz", "Scotty", 87);
        grades.gradeAssignment("Stacks and Queues quiz", "David", 92);
        grades.gradeAssignment("Stacks and Queues quiz", "Patrick", 83);

     //github exploration
        grades.gradeAssignment("Github Exploration", "Tyler", 96);
        grades.gradeAssignment("Github Exploration", "James", 43);
        grades.gradeAssignment("Github Exploration", "Ethan", 100);
        grades.gradeAssignment("Github Exploration", "Scotty", 97);
        grades.gradeAssignment("Github Exploration", "David", 28);
        grades.gradeAssignment("Github Exploration", "Patrick", 100);

     //print stats for all assignments and overall grades
        System.out.println("Average Grade for Stacks and Queues Station Activity: " + grades.getAverageGrade("Stacks and Queues Stations Activity"));
        System.out.println("Average Grade for Stacks and Queues Station Activity: " + grades.getAverageGrade("Stacks and Queues Stations programs"));
        System.out.println("Average Grade for Stacks and Queues Station Activity: " + grades.getAverageGrade("Stacks and Queues Stations quiz"));
        System.out.println("Average Grade for Stacks and Queues Station Activity: " + grades.getAverageGrade("Github Exploration"));

        //5. Print out the stats for all assignments and overall grades
        //6. Print the grades object
        //7. Print the object of each student

    }
}
