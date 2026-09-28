/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student;

/**
 *
 * @author mahbo
 */
public class Student {

  private final String studentId;
    private String name;
    private double grade; // Holds the student's score
    private String program;

    // Constructor
    public Student(String studentId  , String name, double grade) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
    }
    

    // Getters 
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }
    
   
    @Override
    public String toString() {
        return name + " (ID: " + studentId + ") - Grade: " + grade;
    }
}
