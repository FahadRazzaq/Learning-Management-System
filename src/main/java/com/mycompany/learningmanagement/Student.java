import java.util.ArrayList;

class Student extends User {
    private String academicLevel;
    private String typeOfStudy;
        private ArrayList<Course> registeredCourses;

    public Student(String firstName, String lastName, int id, String password) {}

    public Student(int id, String password) {
        super("Student", "Student", id);
        setPassword(password);
    }

    public double checkGPA() {

        return 3.5; // Example GPA value
    }

    public void displayInfo() {
        System.out.println("Name: Aseel Fahad Alkhaldi");
        System.out.println("CGPA is: 3.42");
        // Add any additional details to display here
    }
    

    public double getGPA() {
        return 3;
    }

    @Override
    public String getFirstName() {
        return "Studens's First Name";
    }
    
    @Override
    public String getLastName() {
        return "Students's Last Name"; 
    }

    public void viewSchedule() {
        if (registeredCourses.isEmpty()) {
            System.out.println("No courses registered yet.");
        } else {
            System.out.println("Registered Courses:");
            for (Course course : registeredCourses) {
                System.out.println("Course Title: " + course.getCourseTitle());
                System.out.println("Course Code: " + course.getCourseCode());
                course.displaySchedule(); // Display schedule details for each course
                System.out.println("----------------------");
            }
        }
    }
    public void registerCourse(Course course) {
            if (registeredCourses == null) {
                registeredCourses = new ArrayList<>();
            }
            registeredCourses.add(course);
            System.out.println("Course registered: " + course.getCourseTitle());
        }
    }

    // Other student functionalities


