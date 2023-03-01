package org.example.collections.filmsHomework;


import org.example.collections.filmsHomework.enums.Genre;
import org.example.collections.filmsHomework.enums.Rate;

import java.time.Month;
import java.util.Objects;

public class Film implements Comparable<Film> {
    private int id;
    private int year;
    private Month mont;
    private Genre genre;
    private Rate rate;

    public Film(int id, int year, Month mont, Genre genre, Rate rate) {
        this.id = id;
        this.year = year;
        this.mont = mont;
        this.genre = genre;
        this.rate = rate;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public Month getMont() {
        return mont;
    }

    public Genre getGenre() {
        return genre;
    }

    public Rate getRate() {
        return rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return id == film.id && year == film.year && mont == film.mont && genre == film.genre && rate == film.rate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, year, mont, genre, rate);
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", year=" + year +
                ", mont=" + mont +
                ", genre=" + genre +
                ", rate=" + rate +
                '}';
    }

    @Override
    public int compareTo(Film o) {
        return o.rate.getValue() - this.rate.getValue();
    }
}
