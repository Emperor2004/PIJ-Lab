// Class representing a student with attributes and methods

class Student {
    private String name;
    private long prn;

    // Constructor to initialize Student attributes
    public Student(String name, long prn) {
        this.name = name;
        this.prn = prn;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for PRN
    public void setPRN(long prn) {
        this.prn = prn;
    }

    // Getter for PRN
    public long getPRN() {
        return prn;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + ", PRN: " + prn);
    }
}