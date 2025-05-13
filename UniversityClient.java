public class UniversityClient {
    public static void main(String[] args) {
        // Students
        Student s1 = new Student("Princess", "S001", 20000);
        Student s2 = new Student("Ivan", "S002", 18000);
        Student s3 = new Student("Lovel", "S003", 22000);

        // Teachers
        Teacher t1 = new Teacher("Dr. Jose", "Programming", 50000);
        Teacher t2 = new Teacher("Prof. Jeane", "Networks", 55000);

        // Departments
        Department csDept = new Department("Computer Science");
        csDept.add(t1);
        csDept.add(s1);
        csDept.add(s2);

        Department itDept = new Department("Information Technology");
        itDept.add(t2);
        itDept.add(s3);

        // College
        College engCollege = new College("College of Engineering");
        engCollege.add(csDept);
        engCollege.add(itDept);

        // Main College / University
        College university = new College("New Era University");
        university.add(engCollege);

        // Display details
        System.out.println("=== University Details ===");
        university.displayDetails("");

        // Display number of students
        System.out.println("\nTotal Students: " + university.getNumberOfStudents());

        // Display total budget
        System.out.println("Total Budget: $" + university.getBudget());
    }
}
