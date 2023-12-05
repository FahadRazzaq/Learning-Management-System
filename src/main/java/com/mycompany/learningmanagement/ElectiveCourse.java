
class ElectiveCourse extends Course {
    private int numOfElectiveCourse;
    private int maxNumberOfStudent;
    private boolean drop;

    public ElectiveCourse(String courseTitle, String courseCode, Teacher teacher) {
        super(courseTitle, courseCode, scheduleNumber); // Call superclass constructor
    }

    public int maxNumberOfCourse(int numOfElectiveCourse) {
        // Calculate maximum number of elective courses
        return maxNumberOfStudent;
    }

    public int numberOfStudentinClass(int maxNumberOfStudent) {
        // Calculate number of students in the class
        return 0;
    }

    public boolean dropCourse(String courseCode, boolean drop) {
        // Drop the course
        return drop;
    }

    public int getNumberOfStudent() {
        // Get number of students
        return 0;
    }

    public String getElectiveCourse() {
        // Get elective course details
        return "";
    }

    public void setElectiveCourse(String courseTitle, String courseCode) {
        // Set elective course details
    }
}