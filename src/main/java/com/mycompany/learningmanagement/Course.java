class Course {
    private String courseTitle;
    private String courseCode;
    protected static int scheduleNumber;
    private Schedule courseSchedule;
  //  private Teacher teacher;

    public Course(String courseTitle, String courseCode, int scheduleNumber) {
        this.courseTitle = courseTitle;
        this.courseCode = courseCode;
       // this.teacher = teacher;
    }

    public void courseInfo() {
        // Display course information
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public String getCourseCode() {
        return courseCode;
    }
    public void displaySchedule() {
        if (courseSchedule != null) {
            System.out.println("Schedule Number: " + courseSchedule.getScheduleNumber());
            // Add more schedule details here
        } else {
            System.out.println("Morning Schedule will be followed for this.");
        }
    }

    // Other course functionalities
}

