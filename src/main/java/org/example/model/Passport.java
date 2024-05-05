package org.example.model;

import jakarta.persistence.*;

@Entity
@Table(name="passport")
public class Passport {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "human_id", referencedColumnName = "id")
    private Human human;
    @Column(name = "pass_number")
    private int passNumber;

    public Passport() {

    }

    public int getId() {
        return id;
    }

    public Human getHuman() {

        return human;
    }

    public void setHuman(Human human) {
        this.human = human;

    }

    public int getPassNumber() {
        return passNumber;
    }

    public void setPassNumber(int passNumber) {
        this.passNumber = passNumber;
    }

    @Override
    public String toString() {
        return "Passport{" +
               "id=" + id +
               ", human=" + human +
               ", passNumber=" + passNumber +
               '}';
    }
}
