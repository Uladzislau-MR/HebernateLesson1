package org.example.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "school")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "head_teacher_id", referencedColumnName = "id")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    HeadTeacher headTeacher;

@Column( name = "school_number")
    int schoolNumber;


    public School() {
    }

    public School(int schoolNumber,HeadTeacher headTeacher) {
        this.headTeacher = headTeacher;
        this.schoolNumber = schoolNumber;
    }

    public int getId() {
        return id;
    }

    public HeadTeacher getHeadTeacher() {
        return headTeacher;
    }

    public void setHeadTeacher(HeadTeacher headTeacher) {
        this.headTeacher = headTeacher;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    @Override
    public String toString() {
        return "School{" +
               "id=" + id +
               ", headTeacher=" + headTeacher +
               ", schoolNumber=" + schoolNumber +
               '}';
    }
}
