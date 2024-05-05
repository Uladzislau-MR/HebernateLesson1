package org.example;

import org.example.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CinemaApp {

    public static void main(String[] args) {
        Configuration configuration = new Configuration().addAnnotatedClass(Actor.class).addAnnotatedClass(Movie.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();


        try (sessionFactory) {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
Actor actor = session.get(Actor.class,3);
//Movie movie2 = session.get(Movie.class, 7);
//actor.getMovieList().remove(movie2);
////Movie movie = new Movie();
////movie.setName("Troy");
////actor.addMovie(movie);
//session.persist(actor);
//session.getTransaction().commit();
for(Movie movie:actor.getMovieList())
            System.out.println(movie.getName());

        }


    }


}
//2.С помощью Hibernate получите любого режиссера, а затем получите список
//его фильмов.
//        try {
//                session.beginTransaction();
//Director director = session.get(Director.class, 2);
//Film newFilm = new Film();
//            newFilm.setFilmName("Fight Club");
//            newFilm.setOwner(director);
//List<Film> array = new ArrayList<>();
//            array.add(newFilm);
//            director.setFilms(array);
//            session.save(newFilm);
//            for(Film film:director.getFilms())
//        {
//        System.out.println(film.getFilmName());
//        }