package org.example.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "head_teacher")
public class HeadTeacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne(mappedBy = "headTeacher")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private School school;



    @Column(name="name")
    private String name;

    public HeadTeacher() {
    }

    public HeadTeacher(School school, String name) {
        this.school = school;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HeadTeacher{" +
               "school=" + school +
               ", name='" + name + '\'' +
               '}';
    }
}
