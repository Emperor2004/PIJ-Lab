// This class represents a Student entity with basic attributes.
public class Student {
    private String name;
    private int prn;
    private String batch;

    // Constructor to initialize a student object.
    public Student(String name, int prn, String batch) {
        this.name = name;
        this.prn = prn;
        this.batch = batch;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getPrn() {
        return prn;
    }

    public String getBatch() {
        return batch;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    // String representation of a student.
    @Override
    public String toString() {
        return "Name: " + name + ", PRN: " + prn + ", Batch: " + batch;
    }
}
