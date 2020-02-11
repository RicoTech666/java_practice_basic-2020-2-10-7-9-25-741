package model;

public class Teacher {
    private final String name;
    private Student student;

    public Teacher(String name, Student student) {
        this.name = name;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void addScore(int num) {
        this.student.setGrades(this.student.getGrades() + num);
    }

    public void printInfo() {
        System.out.println("I am " + this.name +". I teach student " + this.student.getName() + " whose grades is " +
                this.student.getGrades());
    }
}
