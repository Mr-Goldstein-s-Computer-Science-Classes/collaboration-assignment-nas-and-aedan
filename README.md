Your task is to create a Gradebook class, a Student class, and a Main class


The Gradebook should contain some Students and assignments

The Student class should contain corresponding assignment names and grades


You can create other private methods, but the only public methods should be as listed below

Public Methods for Gradebook:

	Gradebook()
	void createStudent(String name)
	void addAssignment(String assignment)
	void gradeAssignment(String assignment, String studentName, double grade)
	double getAverageGrade(String assignment)
	double getMinimumGrade(String assignment)
	double getMaximumGrade(String assignment)
	double getAverageOverall() 
	double getMaxOverall()
	double getMinOverall()
	double getStudentsGrade()
	String toString() //Returns the names of the students and the names of the assignments as a String
	Student getStudent(String studentName)

Public Methods for Student:

	Student(String name)
	void addAssignment(String assignName) //start as ungraded
	void gradeAssignment(String assignment, double grade)
	double getAssignmentGrade(String assignment)
	double getOverallGrade() //should ignore ungraded assignments
	String toString() -Return the Student name and the students average




Main:

1. Create a Gradebook object called grades

2. Create Students inside of grades

	1. Tyler
	2. James
	3. Ethan
	4. Scotty
	5. David
	6. Patrick

3. Create Assignments:

	1. Stacks And Queues Station Activity
	2. Stacks and queues programs
	3. Stacks and queues quiz
	4. Github Exploration
   
4. Grade Assignments:
	1. Stacks and queues station
		1. Tyler got a 94
		2. James got a 14
		3. Ethan got a 5
		4. Scotty got a 100
		5. David didn’t do it (0)
		6. Patrick got a 79
	2. Stacks and queues programs
		1. Tyler got a 100
		2. James got a 64
		3. Ethan got a 100
		4. Scotty got a 101
		5. David got a 26
		6. Patrick got a 99
	3. Stacks and queues quiz
		1. Tyler got a 100
		2. James got a 100
		3. Ethan got a 100
		4. Scotty got a 87
		5. David got a 92
		6. Patrick got a 83
	4. Github Exploration
		1. Tyler got a 96
		2. James got a 43
		3. Ethan got a 100
		4. Scotty got a 97
		5. David got a 28
		6. Patrick got a 100
    
5. Print out the stats for all assignments and overall grades
6. Print the grades object
7. Print the object of each student
