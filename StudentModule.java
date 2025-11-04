public class StudentModule {
    private int studentId;
    private String studentName;

    public StudentModule(int id, String name) {
        this.studentId = id;
        this.studentName = name;
    }

    public int getStudentId() { return studentId; }
    public String getStudentName() { return studentName; }

    public void displayStudent() {
        System.out.println("ID: " + studentId + ", Name: " + studentName);
    }

