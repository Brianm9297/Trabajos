
package info_academica;

import java.util.ArrayList;

/**
 *
 * @author Brian Mendivelso
 */
public class Group {
    
    private int id;
    private String horario;
    private int numEstudientes;
    private Course course;
    private Teacher professor;
    private ArrayList<Student> student;
    private ArrayList<Grade> grade;

    public ArrayList<Student> getStudent() {
        return student;
    }

    
    public void setStudent(ArrayList<Student> student) {
        this.student = student;
    }

    public ArrayList<Grade> getGrade() {
        return grade;
    }

    public void setGrade(ArrayList<Grade> grade) {
        this.grade = grade;
    }
    
    
    
    public void setCourse(Course course) {
        this.course = course;
    }

    public void setProfessor(Teacher professor) {
        this.professor = professor;
    }

    public Course getCourse() {
        return course;
    }

    public Teacher getProfessor() {
        return professor;
    }
    
    public int getId() {
        return id;
    }

    public String getHorario() {
        return horario;
    }

    public int getNumEstudientes() {
        return numEstudientes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setNumEstudientes(int numEstudientes) {
        this.numEstudientes = numEstudientes;
    }
    
    
    
}
