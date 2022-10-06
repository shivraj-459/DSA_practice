package JAVA_Practice;

public class Student implements Comparable<Student> {

    private Integer roll;
    private String name;
    private Integer marks;


    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }


    public Student(){

    }

    public Student(Integer roll, String name, Integer marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }


    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student o) {

        return o.getMarks() > this.getMarks() ? 1:-1;
    }
}
