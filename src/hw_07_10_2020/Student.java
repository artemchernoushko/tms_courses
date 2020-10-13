package hw_07_10_2020;

import java.util.List;
import java.util.ArrayList;

public class Student {
    private String name;
    private String surname;
    private String dateOfBirthday;
    private int course;

    public Student(String name, String surname, String dateOfBirthday, int course) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirthday = dateOfBirthday;
        this.course = course;
    }

    public Student() {
    }

    public static void main(String[] args) {
        Student student = new Student();
        List<Student> students = new ArrayList<>();
        students.add((new Student("Ivan", "Petrov", "20.05.2000", 4)));
        students.add((new Student("Vova", "Vasiliev", "11.01.1999", 5)));
        students.add((new Student("Egor", "Ivanov", "04.10.2001", 3)));
        students.add((new Student("Roma", "Trump", "21.02.2000", 4)));

        int course = 4;
        printStudents(students, course);

        course = 5;
        printStudents(students, course);

        course = 3;
        printStudents(students, course);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println();
        System.out.println("Students of " + course + " course");
        System.out.println();

        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("Name : " + student.getName());
                System.out.println("Surname : " + student.getSurname());
                System.out.println("Date Of Birthday : " + student.getDateOfBirthday());
            }
        }
    }
}







