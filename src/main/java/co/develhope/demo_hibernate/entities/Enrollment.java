package co.develhope.demo_hibernate.entities;

import jakarta.persistence.*;



@Entity
@Table(name = "enrollment")
public class Enrollment {

    Enrollment(){
    }

    public Enrollment(Student student, Classes classes) {
        this.student = student;
        this.classes = classes;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "class-id", nullable = false)
    private Classes classes;


    public void setId(Integer id) {
        this.id = id;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }
}
