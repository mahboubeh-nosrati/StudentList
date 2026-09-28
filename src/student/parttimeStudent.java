/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author mahbo
 */
public class parttimeStudent extends Student {
    
    private int numCourse;
    public parttimeStudent(String studentId, String name, double grade) {
        super(studentId, name, grade);
    }
    
    public int getNumCourse(){
        return this.numCourse;
    }
    public void setNumCourse(int numCourse){
        this.numCourse=numCourse;
    }
    
    
}
