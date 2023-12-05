class Schedule {
    private int scheduleNumber;
    private String courseTitle;
    private String courseCode;
    // Other schedule details

    public Schedule(int scheduleNumber, String courseTitle, String courseCode) {
        this.scheduleNumber = scheduleNumber;
        this.courseTitle = courseTitle;
        this.courseCode = courseCode;
        // Initialize other schedule details as needed
    }

    public int getScheduleNumber() {
        System.out.println("Fetching schedule number...");
        return scheduleNumber;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public String getCourseCode() {
        return courseCode;
    }

    // Method to display schedule details
    public void displayDetails() {
        System.out.println("Schedule Number: " + scheduleNumber);
        System.out.println("Course Title: " + courseTitle);
        System.out.println("Course Code: " + courseCode);
        // Display other schedule details
    }
}
