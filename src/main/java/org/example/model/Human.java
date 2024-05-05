package org.example.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name="human")
public class Human {
@Id
@Column(name = "id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

@OneToOne(mappedBy = "human")
@Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
Passport passport;
@Column(name="full_name")
private String name;

    public Human() {
    }

    public Passport getPassport() {
        return passport;
    }


    public void setPassport(Passport passport) {

        this.passport = passport;
        passport.setHuman(this);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
               "id=" + id +
               ", passport=" + passport +
               ", name='" + name + '\'' +
               '}';
    }
}
