/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mahbo
 */
public class StudentApp {
    public static void main(String[] args) {
        
        // 1. Create a list to store students
        List<Student> students = new ArrayList<>();

        // 2. Add sample students to the list
        students.add(new Student("S123", "Alice Smith", 88.5));
        students.add(new Student("S456", "Bob Jones", 94.0));
        students.add(new Student("S789", "Charlie Brown", 76.2));
        students.add(new Student("S101", "Diana Prince", 98.5));
        students.add(new Student("S202", "Evan Wright", 82.0));
        students.add(new Student("S209", "Evan Forrey", 91.5));

        // Print all students
        System.out.println("--- Student List ---");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();

        // 3. Process data if the list is not empty
        if (!students.isEmpty()) {
            double totalGrade = 0;
            Student topStudent = students.get(0); // Assume the first student has the max score initially
            Student weakStudent=students.get(0);
            for (Student s : students) {
                totalGrade += s.getGrade();
                // Check if current student has a higher grade than the current topStudent
                if (s.getGrade() > topStudent.getGrade()) {
                    topStudent = s;
                }
                if(s.getGrade() < weakStudent.getGrade()){
                    weakStudent = s;
                }
                    
            }

            // Calculate the average
            double averageGrade = totalGrade / students.size();
           
            // 4. Output results
            System.out.println("--- Statistics ---");
            System.out.printf("Average Class Grade: %.2f%n", averageGrade);
            System.out.println("Top Performing Student: " + topStudent.getName() 
                    + " ID: " + topStudent.getStudentId() + " with a score of " + topStudent.getGrade());
            System.out.println("Weakest performance for student: " + weakStudent.getName() +" ID: "+ weakStudent.getStudentId()
                        +" with  the score of "+ weakStudent.getGrade()); 
            } else {
                 System.out.println("No students available to calculate metrics.");
            }
            
    }
    
}
