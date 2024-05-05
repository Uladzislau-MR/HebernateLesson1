package org.example.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "director")

public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;




    @Column(name = "full_name" )
    private String fullName;

    @OneToMany(mappedBy = "owner")
    List<Film> films;


    public Director(){}


    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Director{" +
               "id=" + id +
               ", films=" + films +
               ", fullName='" + fullName + '\'' +
               '}';
    }
}

