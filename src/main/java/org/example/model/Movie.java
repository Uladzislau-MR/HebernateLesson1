package org.example.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToMany(mappedBy = "movieList",cascade = CascadeType.PERSIST)
    List<Actor> actorList;
    @Column(name = "name")
     private String name;

    public Movie() {
    }

    public List<Actor> getActorList() {
        return actorList;
    }

    public void setActorList(List<Actor> actorList) {
        this.actorList = actorList;
    }

    public void setActor(Actor actor) {
        if(this.actorList == null) {
            this.actorList = new ArrayList<>();
        }
        this.actorList.add(actor);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
