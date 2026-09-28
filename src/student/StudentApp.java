/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;



/**
 *
 * @author mahbo
 */
public class StudentApp {
    public static void main(String[] args) {
        
        // 1. Create a list to store student
        Student[] students=new Student[10];

        // 2. Add sample students to the list
        students[0]= new Student("S123", "Alice Smith", 88.5);
        students[1]=(new Student("S456", "Bob Jones", 94.0));
        students[2]=new Student("S789", "Charlie Brown", 76.2);
        students[3]=new Student("S101", "Diana Prince", 98.5);
        students[4]=new Student("S202", "Evan Wright", 82.0);
        students[5]=new Student("S209", "Evan Forrey", 91.5);
        students[0].setTeacher("Bob");
        students[1].setTeacher("larry");
        students[2].setTeacher("David");

        // Print all students
        System.out.println("--- Student List ---");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();

        // 3. Process data if the list is not empty
            try{
            double totalGrade = 0;
            Student topStudent = students[0]; // Assume the first student has the max score initially
            Student weakStudent=students[0];
            for (Student s : students) {
                if(s !=null){
                totalGrade += s.getGrade();
                // Check if current student has a higher grade than the current topStudent
                if (s.getGrade() > topStudent.getGrade()) {
                    topStudent = s;
                }
                if(s.getGrade() < weakStudent.getGrade()){
                    weakStudent = s;
                }
            } }
            
            // Calculate the average
            double averageGrade = totalGrade / students.length;
           
            // 4. Output results
            System.out.println("--- Statistics ---");
            System.out.printf("Average Class Grade: %.2f%n", averageGrade);
            System.out.println("Top Performing Student: " + topStudent.getName() 
                    + " ID: " + topStudent.getStudentId() + " with a score of " + topStudent.getGrade());
            System.out.println("Weakest performance for student: " + weakStudent.getName() +" ID: "+ weakStudent.getStudentId()
                        +" with  the score of "+ weakStudent.getGrade()); 
            } catch(Exception e){
                 System.out.println("No students available to calculate metrics.");
            }
           
            
    }
    
}
