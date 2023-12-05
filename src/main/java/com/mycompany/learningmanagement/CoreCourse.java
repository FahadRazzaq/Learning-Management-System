class CoreCourse extends Course {
    private int credit;
    private int hours;
    private boolean lab;

    public CoreCourse(String courseTitle, String courseCode, Teacher teacher, int credit) {
        super(courseTitle, courseCode, scheduleNumber); // Call superclass constructor
        this.credit = credit;
    }

    public int minCoreHours(int credit) {
        // Calculate minimum core hours
        return hours;
    }

    public int maxCoreHours(int credit) {
        // Calculate maximum core hours
        return hours;
    }

    public boolean labCheck(boolean lab) {
        // Check if the course has a lab
        return lab;
    }

    public String getCoreCourse() {
        // Get core course details
        return "";
    }

    public void setCoreCourse(String courseTitle, String courseCode, int credit) {
        // Set core course details
    }
}
