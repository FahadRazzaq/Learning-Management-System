import java.util.Scanner;

public class Main {
    private static Administrator admin = new Administrator();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your credentials:");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (authenticate(username, password)) {
            System.out.println("Authentication successful!");

            System.out.println("Select your role:");
            System.out.println("1. Student");
            System.out.println("2. Administrator");
            System.out.println("3. Teacher");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    studentMenu();
                    break;
                case 2:
                    administratorMenu();
                    break;
                case 3:
                    teacherMenu();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } else {
            System.out.println("Authentication failed. Invalid credentials.");
        }

        scanner.close();
    }

    private static boolean authenticate(String username, String password) {
        // Perform authentication logic here
        return username.equals("user") && password.equals("pass");
    }

    private static void studentMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Student Portal!");
        System.out.println("1. Check GPA");
        System.out.println("2. Display Info");
        System.out.println("3. Register for Course");
        System.out.println("4. View Schedule");
        System.out.print("Enter your choice: ");    
        int choice = scanner.nextInt();

        Student student = new Student(choice, null); // Create a student instance
        
        Course mathCourse = new Course("Maths", "MATH101", 1); // Creating a course with a schedule
        Course bioCourse = new Course("Biology", "BIO101", 2); // Creating another course with a schedule

        student.registerCourse(mathCourse); 


        switch (choice) {
            case 1:
                double gpa = student.checkGPA();
                System.out.println("Your GPA is:" + gpa);
                break;
            case 2:
                student.displayInfo();
                break;
            case 3:
                student.registerCourse(bioCourse);
                break;
            case 4:
                student.viewSchedule(); // Implement this method in the Student class
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    private static void administratorMenu() {
        Scanner scanner = new Scanner(System.in);
       // Administrator admin = new Administrator(); // Create an admin instance

        boolean exit = false;
        while (!exit) {
            System.out.println("Welcome to Administrator Portal!");
            System.out.println("1. Add Course");
            System.out.println("2. Delete Course");
            System.out.println("3. Calculate GPA List");
            System.out.println("4. Add Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Add Teacher");
            System.out.println("7. Delete Teacher");
            System.out.println("8. Add Schedule"); // New option to add schedule
            System.out.println("9. Delete Schedule"); // New option to delete schedule
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    admin.addCourse();
                    break;
                    
                    case 2:
                    admin.deleteCourse();
                    break;
       
                    case 3:
                    double calculatedGPA = admin.calcGPA();
                    // Process the calculated GPA
                    System.out.println("Calculated GPA: " + calculatedGPA);
                    break;
                    
                case 4:
                    admin.addStudent();
                    break;
                case 5:
                    admin.deleteStudent();
                    break;
                case 6:
                    admin.addTeacher();
                    break;
                case 7:
                    admin.deleteTeacher();
                    break;
                case 8:
                    addNewSchedule(); // Call method to add schedule
                    break;
                case 9:
                    deleteExistingSchedule();
                case 10:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice!");

            }
        }
            
        }
        private static void addNewSchedule() {
            // Create a new schedule and call the addSchedule() method
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter schedule details:");
            System.out.print("Schedule Number: ");
            int scheduleNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Course Title: ");
            String courseTitle = scanner.nextLine();
            System.out.print("Course Code: ");
            String courseCode = scanner.nextLine();
    
            Schedule newSchedule = new Schedule(scheduleNumber, courseTitle, courseCode);
            admin.addSchedule(newSchedule);
        }
    
        private static void deleteExistingSchedule() {
            // Prompt for schedule number to delete and call deleteSchedule() method
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter schedule number to delete:");
            int scheduleNumber = scanner.nextInt();
            admin.deleteSchedule(scheduleNumber);
        }


    private static void teacherMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Teacher Portal!");
        System.out.println("1. Display Teacher Info");
        System.out.println("2. Search for Student");
        System.out.println("3. View Schedule"); 
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Teacher teacher = new Teacher(choice, null); // Create a teacher instance
        

        switch (choice) {
            case 1:
                teacher.displayTeacherInfo();
                break;
            case 2:
                Student studentToSearch = new Student(choice, null);
                teacher.searchForStudent(studentToSearch);
                break;
            case 3:
                teacher.viewSchedule(); // Implement this method in the Teacher class
                break;
        
            default:
                System.out.println("Invalid choice!");
        }
    }
}
