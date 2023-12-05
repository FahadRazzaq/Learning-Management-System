import java.util.ArrayList;

class Teacher extends User {
    private double marks;
    private double[] marksArr;
    private String department;
    private double average;
    private ArrayList<Schedule> schedules;
    private ArrayList<Student> studentArr;

    public Teacher(String firstName, String lastName, int id, String password) {
        studentArr = new ArrayList<>();
        schedules = new ArrayList<>();
    }

    public Teacher(int id, String password) {
        super("Teacher", "Teacher", id);
        setPassword(password);
        studentArr = new ArrayList<>();
    }

    public void displayTeacherInfo() {
        // Display teacher info
    }

    public void searchForStudent(Student student) {
        if (studentArr.contains(student)) {
            System.out.println("Student found!");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    public double calcAverage(double[] marksArr) {
        // Calculate average from marksArr
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public String getFirstName() {
        return "Teacher's First Name"; // For Teacher class
    }
    
    @Override
    public String getLastName() {
        return "Teacher's Last Name"; // For Teacher class
    }
    
    public void viewSchedule() {
        for (Schedule schedule : schedules) {
            schedule.displayDetails();
        }
    }

    // Other teacher functionalities
}

