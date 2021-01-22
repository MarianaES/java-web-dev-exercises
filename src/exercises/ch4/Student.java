package exercises.ch4;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public void setStudentId(int aStudentId) {
        this.studentId = aStudentId;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        this.numberOfCredits = aNumberOfCredits;
    }

    private void setGpa(double aGpa) {
        this.gpa = aGpa;
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        double totalQualityScore = this.gpa * this.numberOfCredits;
        totalQualityScore += grade * courseCredits;
        this.numberOfCredits += courseCredits;
        this.gpa = totalQualityScore / this.numberOfCredits;
    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        if (this.numberOfCredits >= 90) return "Senior";
        if (this.numberOfCredits >= 60) return "Junior";
        if (this.numberOfCredits >= 30) return "Sophomore";
        if (this.numberOfCredits > 0) return "Freshman";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && numberOfCredits == student.numberOfCredits && Double.compare(student.gpa, gpa) == 0 && name.equals(student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", numberOfCredits=" + numberOfCredits +
                ", gpa=" + gpa +
                '}';
    }
}