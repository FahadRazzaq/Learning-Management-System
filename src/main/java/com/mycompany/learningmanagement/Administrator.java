import java.util.ArrayList;
import java.util.Scanner;

public class Administrator extends User {
    private ArrayList<Course> courses;
    private ArrayList<Schedule> schedules;
    private double calcGPA;
    private ArrayList<Student> studentArr;
    private Teacher teacher;
    private Scanner scanner;

    public Administrator() {
        schedules = new ArrayList<>();
        courses = new ArrayList<>();
        studentArr = new ArrayList<>();
        scanner = new Scanner(System.in);
        
    }

    public Administrator(int id, String password) {
        super("Admin", "Admin", id);
        setPassword(password);
        courses = new ArrayList<>();
        studentArr = new ArrayList<>();
    }

    public double[][] GPAList(Student student, double[] GAList) {
        // Calculate GPA list
        return new double[0][];
    }

    public void addCourse() {
        System.out.println("Enter course details:");
        System.out.print("Course title: ");
        String courseTitle = scanner.nextLine();
        System.out.print("Course code: ");
        String courseCode = scanner.nextLine();

        Course courseToAdd = new Course(courseTitle, courseCode, 1);
        courses.add(courseToAdd);
        System.out.println("Course added: " + courseTitle);
    }

    public void deleteCourse() {
        System.out.println("Enter course details to delete:");
        System.out.print("Course title: ");
        String courseTitle = scanner.nextLine();
        System.out.print("Course code: ");
        String courseCode = scanner.nextLine();

        Course courseToDelete = null;
        for (Course course : courses) {
            if (course.getCourseTitle().equals(courseTitle) && course.getCourseCode().equals(courseCode)) {
                courseToDelete = course;
                break;
            }
        }

        if (courseToDelete != null) {
            courses.remove(courseToDelete);
            System.out.println("Course deleted: " + courseTitle);
        } else {
            System.out.println("Course not found!");
        }
    }

    public void addStudent() {
        System.out.println("Enter student details:");
        System.out.print("First name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last name: ");
        String lastName = scanner.nextLine();
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Password: ");
        String password = scanner.nextLine();

        Student newStudent = new Student(firstName, lastName, id, password);
        studentArr.add(newStudent);
        System.out.println("Student added: " + firstName + " " + lastName);
    }

    public void deleteStudent() {
        System.out.println("Enter student details to delete:");
        System.out.print("First name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last name: ");
        String lastName = scanner.nextLine();

        Student studentToDelete = null;
        for (Student student : studentArr) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                studentToDelete = student;
                break;
            }
        }

        if (studentToDelete != null) {
            studentArr.remove(studentToDelete);
            System.out.println("Student deleted: " + firstName + " " + lastName);
        } else {
            System.out.println("Student not found!");
        }
    }

    public void addTeacher() {
        System.out.println("Enter teacher details:");
        System.out.print("First name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last name: ");
        String lastName = scanner.nextLine();
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Password: ");
        String password = scanner.nextLine();

        Teacher newTeacher = new Teacher(firstName, lastName, id, password);
        this.teacher = newTeacher;
        System.out.println("Teacher added: " + firstName + " " + lastName);
    }

    public void deleteTeacher() {
        if (this.teacher != null) {
            System.out.println("Teacher deleted: " + this.teacher.getFirstName() + " " + this.teacher.getLastName());
            this.teacher = null;
        } else {
            System.out.println("No teacher assigned!");
        }
    }


    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public double calcGPA() {
        Scanner scanner = new Scanner(System.in);
        int totalCreditHours = 0;
        double totalGradePoints = 0.0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter grade for subject " + (i + 1) + " (A/B/C): ");
            String grade = scanner.nextLine();
            System.out.println("Enter credit hours for subject " + (i + 1) + ": ");
            int creditHours = Integer.parseInt(scanner.nextLine());

            double gradePoint;
            switch (grade.toUpperCase()) {
                case "A":
                    gradePoint = 4.0;
                    break;
                case "B":
                    gradePoint = 3.3;
                    break;
                case "C":
                    gradePoint = 2.7;
                    break;
                default:
                    gradePoint = 0.0; // Set a default value if the grade is not recognized
                    break;
            }

            totalCreditHours += creditHours;
            totalGradePoints += (gradePoint * creditHours);
        }

        double calcGPA = totalGradePoints / totalCreditHours;
        return calcGPA;
    }
    public void addSchedule(Schedule schedule) {
        schedules.add(schedule);
        System.out.println("Schedule added: " + schedule.getScheduleNumber());
    }

    // Method to delete schedule
    public void deleteSchedule(int scheduleNumber) {
        for (Schedule schedule : schedules) {
            if (schedule.getScheduleNumber() == scheduleNumber) {
                schedules.remove(schedule);
                System.out.println("Schedule deleted: " + scheduleNumber);
                return;
            }
        }
        System.out.println("Schedule not found!");
    }

    

}
