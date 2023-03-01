package org.example.collections.filmsHomework;

import org.example.collections.filmsHomework.enums.Genre;
import org.example.collections.filmsHomework.enums.Rate;

import java.time.Month;

public class CinemaRunner {
    public static void main(String[] args) {
        Film film1 = new Film(1, 2007, Month.AUGUST, Genre.ACTION, Rate.A);
        Film film2 = new Film(2, 2007, Month.JANUARY, Genre.DRAMA, Rate.B);
        Film film3 = new Film(3, 2007, Month.MARCH, Genre.ADVENTURE, Rate.C);

        Film film4 = new Film(1, 2007, Month.AUGUST, Genre.ACTION, Rate.A);

        Film film5 = new Film(1, 2008, Month.AUGUST, Genre.ACTION, Rate.A);
        Film film6 = new Film(2, 2008, Month.AUGUST, Genre.COMEDY, Rate.C);
        Film film7 = new Film(2, 2008, Month.SEPTEMBER, Genre.COMEDY, Rate.C);

        Cinema cinema = new Cinema();

        cinema.addFilm(film1);
        cinema.addFilm(film2);
        cinema.addFilm(film3);
        //dont add
        cinema.addFilm(film4);
        cinema.addFilm(film5);
        cinema.addFilm(film6);
        cinema.addFilm(film7);

        System.out.println(cinema.getMap());
        System.out.println(cinema.getFilmsByYear(2008));
        System.out.println(cinema.getFilmsByYearAndMonth(2008,Month.AUGUST));
        System.out.println(cinema.getFilmsByGenre(Genre.COMEDY));
        System.out.println(cinema.getAllFilmsOrderByRate());
    }
}
