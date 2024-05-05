package org.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "film")

public class Film {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "director_id", referencedColumnName = "id")
    private Director owner;



    @Column(name = "name")
    private String filmName;

    public Film() {

    }

    public Director getOwner() {
        return owner;
    }

    public void setOwner(Director owner) {
        this.owner = owner;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    @Override
    public String toString() {
        return "Film{" +
               "owner=" + owner +
               ", filmName='" + filmName + '\'' +
               '}';
    }
}
