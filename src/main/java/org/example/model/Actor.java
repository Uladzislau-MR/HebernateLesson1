package org.example.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "actor")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;

    public Actor() {
    }




    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "actor_movie",
            joinColumns = @JoinColumn(name = "actor_id"),
            inverseJoinColumns = @JoinColumn(name = "movie_id")
    )

    private List<Movie> movieList;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "age")
    private int age;

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void addMovie(Movie movie) {
        if (this.movieList == null){
            this.movieList = new ArrayList<>();
        }
        this.movieList.add(movie);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
